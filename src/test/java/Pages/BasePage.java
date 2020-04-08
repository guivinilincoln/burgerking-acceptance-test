/*
 * Copyright 2014-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package Pages;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class BasePage {
	protected final AppiumDriver<?> driver;
	public static AndroidDriver<MobileElement> driverAndroid;

	protected BasePage(AppiumDriver<?> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 10, TimeUnit.SECONDS), this);
	}

	public void tirarScreenShot() throws IOException {

		String folder_name = "target/surefire-reports/screenshot";

		File f = driver.getScreenshotAs(OutputType.FILE);

		DateFormat df = new SimpleDateFormat("dd-MM-YYYY__hh_mm_ssaa");
		new File(folder_name).mkdir();

		String file_name = df.format(new Date()) + ".png";

		org.apache.commons.io.FileUtils.copyFile(f, new File(folder_name + "/" + file_name));

		extracted(folder_name, file_name);

	}

	private void extracted(String folder_name, String file_name) {
		Reporter.log("<br><img src='"  + "screenshot" + "/" + file_name + "' height='400' width='400'/><br>");
	}

	public void scrollHorizontal(String valor) {
		for (int i = 1; i <= 5; i++) {
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementByXPath("//*[@text='" + valor + "']").isDisplayed();
				break;
			} catch (Exception e) {
				swipehorizontal(valor);
			}
		}
	}

	public void scrollVertical(String valor) {
		for (int i = 1; i <= 5; i++) {
			try {
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				driver.findElementByXPath("//*[@text='" + valor + "']").isDisplayed();
				break;
			} catch (Exception e) {
				swipeVertical(valor);
			}
		}
	}

	public void swipeVertical(String valor) {

		@SuppressWarnings("unused")
		MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"" + valor + "\"));"));
	}

	public void swipehorizontal(String valor) {

		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView("
						+ "new UiSelector().textContains(\"" + valor + "\"))"));
		element.click();
	}

	public void scroll(double inicio, double fim) throws InterruptedException {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		screenSize.getHeight();
		screenSize.getWidth();

		int screenHeight = screenSize.height;
		int screenWidht = screenSize.width;

		int y = screenHeight / 2;

		int start_x = (int) (screenWidht * inicio);
		int end_x = (int) (screenWidht * fim);

		Thread.sleep(5000);

		new TouchAction(driver).longPress(y, start_x).waitAction(500).moveTo(y, end_x).release().perform();
	}

	public void scrollVerticalIoS(String lado) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("direction", "left");
		js.executeScript("mobile: swipe", params);
	}

	public void swipeHorizontalElementExample(WebElement el) {
		String orientation = driver.getOrientation().value();
		int leftX = el.getLocation().getX();
		int rightX = leftX + el.getSize().getWidth();
		int upperY = el.getLocation().getY();
		int lowerY = upperY - el.getSize().getHeight();
		int middleY = (upperY - lowerY) / 2;
		orientation.equals("landscape");
		driver.swipe(rightX - 5, middleY, leftX + 5, middleY, 500);
	}
	
	public void swipeVerticalElementExample(WebElement el) {
		String orientation = driver.getOrientation().value();
		int leftX = el.getLocation().getX();
		int rightX = leftX + el.getSize().getWidth();
		int upperY = el.getLocation().getY();
		int lowerY = upperY - el.getSize().getHeight();
		int middleY = (upperY - lowerY) / 2;
		orientation.equals("portrait");
		driver.swipe(leftX + 5, middleY, rightX - 5, middleY, 500);
	}

}