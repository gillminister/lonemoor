import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class MinecraftBackup {
	private static ArrayList<String> changed, unchanged,conflicts;
	private static File srcFolder,destFolder,dropDestFolder;

    public static void main(String[] args)
    {
    	String backupType="unknown";
    	if(args.length!=0)backupType=args[0];
    	changed=new ArrayList<String>();
    	unchanged=new ArrayList<String>();
    	conflicts=new ArrayList<String>();

    	srcFolder = new File("D:\\Dropbox\\Minecraft_Server\\StianOgJorn");
    	destFolder = new File("D:\\Spill\\Minecraft\\Backup\\StianOgJorn\\"+backupType);
    	dropDestFolder = new File("D:\\Dropbox\\Minecraft_Server\\Backup\\StianOgJorn");

    	//make sure source exists
    	if(!srcFolder.exists()){

           System.out.println("SOURCE DOES NOT EXIST\n->TERMINATING");
           //just exit
           System.exit(0);

        }
		else{
			System.out.println("INITIATE BACKUP");
			try{
				copyFolder(srcFolder,destFolder);
				if(backupType.equals("EndGame"))copyFolder(srcFolder,dropDestFolder);
			}
			catch(IOException e){
				System.out.println("BACKUP FAILED - FILE READ/WRITE ERROR");
				printReport();
				System.exit(0);
			}
		}

    	printReport();
    	System.out.println("\nBACKUP \""+backupType+"\" COMPLETE");
    }

    public static void printReport(){
    	if(unchanged.size()!=0)System.out.println("UNCHANGED FILES");
    	for(String f:unchanged)System.out.println("NOT COPIED\t"+f);

    	if(changed.size()!=0)System.out.println("\nCHANGED FILES");
    	for(String f:changed)System.out.println("COPIED\t\t"+f);

    	if(conflicts.size()!=0)System.out.println("\nDELETED CONFLICTS");
    	for(String f:conflicts)System.out.println("COPIED\t\t"+f);
    }

    public static void copyFolder(File src, File dest) throws IOException{
    	if(src.getAbsolutePath().contains(" conflicted copy ")){
    		if(!conflicts.contains(src.getAbsolutePath()))conflicts.add(src.getAbsolutePath());
    		src.delete();
    		return;
    	}
    	if(!src.isDirectory()){
    		if(src.lastModified()<=dest.lastModified()){
        		if(!unchanged.contains(src.getAbsolutePath()))unchanged.add(src.getAbsolutePath());
        		return;
        	}
        	else changed.add(dest.getAbsolutePath());
    	}

    	if(src.isDirectory()){//folder
    		if(!dest.exists())dest.mkdir();

    		for (String file : src.list())copyFolder(new File(src, file),new File(dest, file));
    	}
    	else{//file
    		InputStream in = new FileInputStream(src);
    		OutputStream out = new FileOutputStream(dest);

    		byte[] buffer = new byte[1024];

    		int length;
    		while ((length = in.read(buffer)) > 0) out.write(buffer, 0, length);

    		in.close();
    		out.close();
    	}
    }
}
