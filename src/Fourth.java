/*public class Fourth {
    public static void main(String[] args){
        String str="i love to code in java programming";
        String words[]=str.split(" ");
        String maxword=" ";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>maxword.length()){
                maxword=words[i];
            }

        }
        System.out.println(maxword);
        System.out.println(maxword.length());
    }
}
*/
//password code

/*public class Fourth {

    static int check(String str, int n) {

        int capital = 0;
        int digit = 0;

        if(str.length() < 4) {
            return 0;
        }

        if(Character.isDigit(str.charAt(0))) {
            return 0;
        }

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch == ' ' || ch == '/') {
                return 0;
            }

            if(Character.isUpperCase(ch)) {
                capital++;
            }

            if(Character.isDigit(ch)) {
                digit++;
            }
        }

        if(capital >= 1 && digit >= 1) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {

        String str = "aA1_67";

        System.out.println(check(str, str.length()));
    }
}
*/
//AND OR XOR operatons with the given input

/*public class Fourth {

    static int OperationsBinary(String str) {
        int result = str.charAt(0) - '0';

        for (int i = 1; i < str.length(); i += 2) {
            char op = str.charAt(i);
            int num = str.charAt(i + 1) - '0';

            if (op == 'A') {          // AND
                result = result & num;
            } else if (op == 'B') {   // OR
                result = result | num;
            } else if (op == 'C') {   // XOR
                result = result ^ num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";

        int result = OperationsBinary(str);

        System.out.println(result);
    }
}

 */
// two pointers
/*import java.util.*;
public class Fourth{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int front=0;
        int end=arr.length-1;
        while(front<end){
            if(arr[front]%2!=0 && arr[end]%2==0) {
                int temp = arr[front];
                arr[front] = arr[end];
                arr[end] = temp;
            }
            else if(arr[front]%2==0) {
                front++;
            }
            else{
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

 */

