@ECHO OFF


REM Skriver serverstatus til fil.

ECHO Server_Running>serverstatus_StianOgJorn.txt




REM Starter server

TITLE Minecraft Server: StianOgJorn
CLS
if %COMPUTERNAME%==STANMINISTER java -Xmx8192M -Xms3072M -jar minecraft_server.1.8.jar nogui
if %COMPUTERNAME%==JORN-BEASTPC java -Xmx5120M -Xms2048M -jar minecraft_server.1.8.jar nogui
if %COMPUTERNAME%==JORN-PC java -Xmx1024M -Xms1024M -jar minecraft_server.1.8.jar nogui



REM Skriver serverstatus til fil.

ECHO Server_Off>serverstatus_StianOgJorn.txt



REM Stopper server.

ECHO Server Stopped
TIMEOUT 3