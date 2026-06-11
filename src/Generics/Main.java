package Generics;

public class Main {
        public static void main(String[] args) {
            content<String> c1 = new content<>();
            c1.setName("Deepu");
            System.out.println(c1.getName());
            items<String, Double,Boolean> i = new items("banana",10.3,true);
            System.out.print(i.getName() + " " + i.getB() + " " + i.getD());
        }
    }

