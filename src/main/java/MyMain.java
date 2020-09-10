import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        char a1 = 'a';
        char b1 = 'b';
        char c1 = 'c';
        int zero = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i)== a1)
            zero++; 
            else if (str.charAt(i)== b1)
            zero++; 
            else if(str.charAt(i)== c1)
            zero++; 
        }
        return zero;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        if (str.contains("the")){
            return true;
        }
        else if (str.contains("The")){
            return true;
        }
        else {
            return false;
        }
        
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        int zero = 0;
        int qwe = str.length() -1;

        while (qwe > zero){
            if (str.charAt(zero) != str.charAt(qwe))
            return false;
            zero++;
            qwe--;
        }

        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.nextLine();
    }
}
