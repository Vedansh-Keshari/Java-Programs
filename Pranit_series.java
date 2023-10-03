import java.util.Scanner;
public class Pranit_series {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        String str=sc.nextLine();
        str.trim();
        for(int i=0;i<str.length();i++){
            String w="";
            for(int j=i;j<str.length();j++){
                char ch=str.charAt(j);
                if(ch>=48 && ch<=57){
                    w+=ch;
                }
                else if(ch==32){
                    break;
                }
            }
            w.trim();
            System.out.println(w);
            sum+=Integer.parseInt(w);
        }
        System.out.println("Sum : "+sum);
    }
}

// Sum of the string entry " 12 13 14 " without using split function.


// getting java.lang.NumberFormatException when tried, check logic and mend errors