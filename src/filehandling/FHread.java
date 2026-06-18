package filehandling;
import java.io.BufferedWriter;
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io. IOException;
public class FHread {
    public static void main(String[] args)throws IOException{
        //creating file
        System.out.println("strating my file");
        String path="C:\\Users\\DELL\\IdeaProjects\\Firstday\\src\\filehandling\\text.txt";
        File f =new File(path);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        int ch;
        int c =0;
        while (((ch = br.read())!= -1)){
            System.out.print((char)ch);
            c++;
        }
        System.out.println(c);
        /*char r = (char)br.read();
        System.out.println(r);*/
    }
}

