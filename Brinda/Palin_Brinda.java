package Palindrome;

public class String_Palindrome{
    public boolean checkPalindrome(String s){
        
        // Initializing an empty string to store the reverse of the original str
        String rev = "";
 
        // Initializing a new boolean variable for the answer
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;


    } 
}

public class Number_Palindrome{
    public boolean checkPalindrome(int n){
    
        int reversed_n = 0;
        int x=n;
        while (x > 0) {
            reversed_n = reversed_n * 10 + x % 10;
            x = x / 10;
        }
        
        if(n==reversed_n){
            return true;
        }
        return false;
    } 

}




import java.util.*;
import Palindrome.String_Palindrome;
import Palindrome.Number_Palindrome;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input any Number or String to check if it's Palindrome or not.");
        String ch=sc.next();

        String_Palindrome sp=new String_Palindrome();
        Number_Palindrome np=new Number_Palindrome();

        boolean palin=false;

        if(ch.isNumber()){
            np.checkPalindrome(Integer.parseInt(ch));
        }
        else{
            sp.checkPalindrome(ch);
        }

        if(palin){
            System.out.println("Thus, "+ch+" is a Palindrome");
        }
        else{
            System.out.println("Thus, "+ch+" is not a Palindrome");
        }
    }
}































public class Palin_Brinda {
    
}
