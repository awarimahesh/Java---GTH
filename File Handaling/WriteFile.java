import java.util.*;
import java.io.*;
public class WriteFile{
	public static void main(String args[])throws IOException{
		
		FileWriter fw = new FileWriter("D:\\java class\\DemoFile\\write.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String data=sc.nextLine();
		
		bw.write(data);
		bw.newLine();
		System.out.println("Datat save ......");
		
		bw.close();
		fw.close();
	}
}