import java.util.Scanner;
public class P269 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int b=sc.nextInt();
        System.out.println("Enter second number");
        int s=sc.nextInt();
        int ps=0;

        /*
        while(true){
            int r=b%s;
            if(r==0){
                System.out.println(s);
                break;
            }
            b=s;
            s=r;
        }
        */


        // while(b%s!=0){
        //     int r=b%s;
        //     b=s;
        //     s=r;
        // }
        // System.out.println("HCF : "+s);


    }
}


// RUN : 
// notepad 
// c:\abc
// Command line arguments