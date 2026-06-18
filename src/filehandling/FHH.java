package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FHH {
    public  static void main(String[] args) throws  Exception{
        System.out.println("Starting my file");
        String path ="C:\\Users\\DELL\\IdeaProjects\\Firstday\\src\\filehandling\\text.txt";
        File f1 = new File(path);
        File f2 = new File("C:\\Users\\avula\\IdeaProjects\\java fullstack\\src\\FH\\textt.txt");
        FileInputStream fis1 = new FileInputStream(f1);
        FileOutputStream fis2 = new FileOutputStream(f2);
        int ch;
        while (((ch = fis1.read())!= -1)){
            System.out.print((char)ch);
            fis2.write(ch);
        }
        fis1.close();
        fis2.close();
    }
}

