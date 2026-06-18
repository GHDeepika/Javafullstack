package comparableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student{
    int roll;
    String name;
    student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }
}
public class CCC {
    public static void main(String[] args){
        ArrayList<student> st=new ArrayList<student>();
        st.add(new student(18,"A"));
        st.add(new student(14,"B"));
        st.add(new student(15,"C"));
        st.add(new student(20,"D"));

        Comparator<student> com=new Comparator<student>() {
            public int compare(student a, student b) {
                if(a.roll>b.roll){
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(st,com);
        for(student s:st)
        System.out.println(s.name+" "+s.roll);
    }
}
