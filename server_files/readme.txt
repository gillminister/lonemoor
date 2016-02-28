Hei Anus!

Har mekka litt på Backups'an. 

Når du bruke "call" så kjøre du den *.bat-fila du call'e via den stien du 
allerede e på. Det vil si at hvis du har denne stien aktiv: 
"...\Dropbox\Minecraft_Server\" og da kjøre kommandoen
"call Backup_PROTOCOLS\myBat.bat" UTEN å kjøre "cd Backup_PROTOCOLS" først, 
så vil alle kommandoan i "myBat.bat" kjøres fra stien 
"...\Dropbox\Minecraft_Server\", og IKKE fra
"...\Dropbox\Minecraft_Server\Backup_PROTOCOLS".

Æ har laga "\Backup_PROTOCOLS\BeginGameBackup_StianOgJorn.bat" og
"\Backup_PROTOCOLS\EndGameBackup_StianOgJorn.bat" slik at de MÅ call'es fra
"...\Dropbox\Minecraft_Server" (ellers blir ikke riktig mappe kopiert, og
den blir ikke kopiert til riktig sted)

"\Backup_PROTOCOLS\NoGameBackup_StianOgJorn.bat" må kjøres fra
"...\Dropbox\Minecraft_Server\Backup_PROTOCOLS", altså kan man som normalt
bare dobbeltklikke på *.bat fila =)