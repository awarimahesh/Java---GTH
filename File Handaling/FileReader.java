import java.io.*;

public class ReadFile {

    public static void main(String args[]) throws Exception {

        java.io.FileReader fr =
            new java.io.FileReader(
                "D:\\java class\\DemoFile\\write.txt"
            );

        int data;

        while ((data = fr.read()) != -1) {

            System.out.print((char)data);
        }

        fr.close();
    }
}