Hei Anus!

Har mekka litt p� Backups'an. 

N�r du bruke "call" s� kj�re du den *.bat-fila du call'e via den stien du 
allerede e p�. Det vil si at hvis du har denne stien aktiv: 
"...\Dropbox\Minecraft_Server\" og da kj�re kommandoen
"call Backup_PROTOCOLS\myBat.bat" UTEN � kj�re "cd Backup_PROTOCOLS" f�rst, 
s� vil alle kommandoan i "myBat.bat" kj�res fra stien 
"...\Dropbox\Minecraft_Server\", og IKKE fra
"...\Dropbox\Minecraft_Server\Backup_PROTOCOLS".

� har laga "\Backup_PROTOCOLS\BeginGameBackup_StianOgJorn.bat" og
"\Backup_PROTOCOLS\EndGameBackup_StianOgJorn.bat" slik at de M� call'es fra
"...\Dropbox\Minecraft_Server" (ellers blir ikke riktig mappe kopiert, og
den blir ikke kopiert til riktig sted)

"\Backup_PROTOCOLS\NoGameBackup_StianOgJorn.bat" m� kj�res fra
"...\Dropbox\Minecraft_Server\Backup_PROTOCOLS", alts� kan man som normalt
bare dobbeltklikke p� *.bat fila =)