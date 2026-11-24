@echo off
chcp 65001 > nul
if not exist out mkdir out
echo Compilando o projeto SmartRoom...
javac -encoding UTF-8 -d out src\smartroom\Main.java src\smartroom\factory\*.java src\smartroom\decorator\*.java src\smartroom\observer\*.java src\smartroom\model\*.java
if errorlevel 1 (
    echo.
    echo Erro na compilacao. Verifique se o JDK esta instalado.
    pause
    exit /b 1
)
echo.
echo Executando o SmartRoom...
echo.
java -cp out smartroom.Main
echo.
pause
