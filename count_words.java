import java.util.Scanner;
public class count_words {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.trim();
        // s=" "+s;
        int c=0;
        String str[]=s.split(" ");
        System.out.println(str.length+" words are present in the entered string");
    }
}
// count number of words in a given String