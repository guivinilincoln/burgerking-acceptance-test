# Projeto de automação mobile ANDROID/IOS do aplicativo do BK


## Pré-requisitos:
<ul>
<li>Java sdk8</li>
<li>Eclipse</li>
<li>Appium</li>
<li>Cmder</li>
</ul>


## Configuração de variaveis de ambiente
<ul>
<li>JAVA_HOME %ProgramFiles%\Java\jdk1.8.0_231</li>
<li>MAVEN_HOME C:\qa\tools\apache-maven-3.6.3</li>
<li>cmder_root C:\qa\tools\cmder</li>
<li>ANDROID_HOME C:\Users\gmartins\AppData\Local\Android\Sdk</li>
</ul>

## Path:
<ul>
<li>%JAVA_HOME%\bin</li>
<li>%cmder_root%\bin</li>
<li>%ANDROID_HOME%\tools</li>
<li>%ANDROID_HOME%\bin</li>
<li>%ANDROID_HOME%\platform-tools</li>
<li>%MAVEN_HOME%\bin</li>
<li>%ANDROID_HOME%\tools\bin</li>
</ul>

## Ativar emulador do Android Studio
### Acessar o caminho:
``` cd C:\Users\AppData\Local\Android\Sdk\tools ```

emulator ``` @nome_dispositivo_criado ``` 

Exemplo: ``` emulator @Nexus_5X_API_29_x86 ``` 

## Rodar testes pelo cmd/cmder por feature
### Acessar o caminho:
``` cd C:\Systems\Flex\Develop\acceptance-tests ```
``` mvn test -Dcucumber.options="C:\Systems\Develop\acceptance-tests\src\test\resources\Features\NovoCadastro.feature" ```

## Rodar testes pelo cmd/cmder por feature com debug
### Acessar o caminho:
``` cd C:\Systems\Flex\Develop\acceptance-tests ```
``` mvn test -Dmaven.surefire.debug test -Dcucumber.options="C:\Systems\Develop\acceptance\src\test\resources\Features\NovoCadastro.feature" ```

### Configuração:
``` Run > Debug configurations > Remote Java Application > Projeto > Connect: Host: localhost Port: 5005 ```
### Clicar em Debug
Rodar debug normalmente como em desenvolvimento, usando f6 para proximo passo e f8 para até o proximo breakpoint.


## Rodar testes pelo cmd/cmder por tag
### Acessar o caminho:
``` cd C:\Systems\Develop\acceptance-tests ```
``` mvn test -Dcucumber.options="--tags @smoke1 --tags @smoke2" ```

