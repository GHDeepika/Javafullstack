/*package Oops;
class MyAdd{
    public void display(){
    System.out.println("hello world");
}}
public class oops {
    public static void main(String[] args){
        MyAdd add=new MyAdd();
        add.display();
    }
}*/

package Oops;
class MyAdd{
    public int a;
    public int b;
    public MyAdd(int a,int b){
      this.a=a;
      this.b=b;

    }
    public void add(){
        System.out.println(this.a+this.b);
    }
    public void sub(){
        System.out.println(this.a-this.b);
    }
    public void mul(){
        System.out.println(this.a*this.b);
    }
}
public class oops {
    public static void main(String[] args) {
        MyAdd add = new MyAdd(10, 20);
        add.add();
        add.sub();
        add.mul();
    }
}
