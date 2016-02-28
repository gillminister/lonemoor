TITLE Minecraft Server - StianOgJorn
for /f "skip=1 tokens=2 delims=[]" %%* in ('ping.exe -4 -n 1 %Computername%') Do (set "IP=%%*")

echo #Minecraft server properties>server.properties
echo #Mon Nov 05 17:58:54 CET 2012>>server.properties
echo generator-settings=>>server.properties
echo allow-nether=true>>server.properties
echo level-name=StianOgJorn>>server.properties
echo enable-query=false>>server.properties
echo allow-flight=true>>server.properties
echo server-port=25565>>server.properties
echo level-type=DEFAULT>>server.properties
echo enable-rcon=false>>server.properties
echo level-seed=>>server.properties
echo server-ip=%IP%>>server.properties
echo max-build-height=256>>server.properties
echo spawn-npcs=true>>server.properties
echo white-list=true>>server.properties
echo spawn-animals=true>>server.properties
echo snooper-enabled=true>>server.properties
echo texture-pack=>>server.properties
echo online-mode=true>>server.properties
echo pvp=true>>server.properties
echo difficulty=3>>server.properties
echo gamemode=0>>server.properties
echo max-players=20>>server.properties
echo spawn-monsters=true>>server.properties
echo generate-structures=true>>server.properties
echo view-distance=15>>server.properties
echo spawn-protection=16>>server.properties
echo motd=StianOgJorn>>server.properties
echo enable-command-block=true>>server.properties