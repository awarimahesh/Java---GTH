import java.io.*;
class DemoFile{
public static void main(String args[]){
	File f= new File("D:\\java class\\DemoFile");
	
	if(f.exists()){
		System.out.println("File is allredy present:");
	}
	else{
		boolean b=f.mkdir();
		if(b){
			System.out.println("Folder create success fully:");
			
		}
		else{
			System.out.println("Some problem to thiear>>>>>>>>>>>:");
		}
	}
}
}