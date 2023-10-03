import java.util.*;
public class reverse_recursive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=reverse(s);
        System.out.println(s);
    }
    public static String reverse(String str){
        if(str.length()==1){
            return str;
        }
        return reverse(str.substring(1,str.length()))+str.charAt(0);
    }
}
