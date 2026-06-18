
    package TCSNQT;
    public class Binaryrepresentation {
        public static void main(String[] args) {
            int n = 10;
            String binary = Integer.toBinaryString(n);//1010//int to binary
            String rev = "";
            for (int i = binary.length() -1; i >=0 ; i--) {
                rev += binary.charAt(i);//0101
            }
            int num = Integer.parseInt(rev,2);//binary to int
            //System.out.println(binary);
            System.out.println(num);
        }
    }

