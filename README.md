# Projeto de automação mobile ANDROID/IOS do aplicativo do BK


## Pré-requisitos:
Java sdk8
Eclipse
Appium
Cmder


## Configuração de variaveis de ambiente
JAVA_HOME %ProgramFiles%\Java\jdk1.8.0_231
MAVEN_HOME C:\qa\tools\apache-maven-3.6.3
cmder_root C:\qa\tools\cmder
ANDROID_HOME C:\Users\gmartins\AppData\Local\Android\Sdk


## Path:
%JAVA_HOME%\bin
%cmder_root%\bin
%ANDROID_HOME%\tools
%ANDROID_HOME%\bin
%ANDROID_HOME%\platform-tools
%MAVEN_HOME%\bin
%ANDROID_HOME%\tools\bin


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

