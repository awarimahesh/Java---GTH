import java.io.*;
public class Filecreate{
	public static void main(String args[])throws IOException{
		
		File f= new File("D:\\java class\\DemoFile\\am.doc");
		boolean b=f.createNewFile();
		if(b){
			System.out.println("File create :");
			
		}
		else{
			System.out.println("File not created:");
		}
	}
}