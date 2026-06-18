package filehandling;
import java.io.BufferedWriter;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io. IOException;
public class FH {
    public static void main(String[] args)throws IOException{
        //creating file
        System.out.println("strating my file");
        String path="C:\\Users\\DELL\\IdeaProjects\\Firstday\\src\\filehandling\\text.txt";
                File f =new File(path);
                FileWriter fw = new FileWriter(f,true);
                BufferedWriter bw = new BufferedWriter(fw);
                Scanner sc=new Scanner(System.in);
                String inp=sc.nextLine();
                bw.newLine();
                bw.write(inp);
                //fw.write("Hello IIIIIAAAAMMMMM");
                bw.write("Hello am deep");
                bw.close();
                fw.close();
    }
}
