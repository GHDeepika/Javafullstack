package TCSNQT;
import java.util.*;
public class Findingas {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = sc.nextInt();
        int max = 0;
        int count =0;
        for(int i=0;i<str.length();i++)
        {
            if(i %l == 0)
            {
                max = Math.max(count,max);
                count = 0;
            }
            if(str.charAt(i) == 'a')
                count++;
        }
        max = Math.max(count,max);
        System.out.println(max);
    }
}