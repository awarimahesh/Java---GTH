import java.io.*;
class Fetch{
	public static void main(String args[]){
		
		File f1 = new File("D:\\java class\\Array");
		
		File fileList[]=f1.listFiles();
		for(File f:fileList){
			System.out.println(f);
		}
	}
}