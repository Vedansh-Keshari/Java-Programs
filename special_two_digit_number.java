import java.util.Scanner;
public class special_two_digit_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 2-digit number : ");
        int n=sc.nextInt();
        int p=(n/10)*(n%10);
        int s=(n/10)+(n%10);
        if(n>=10 && n<=99){
            if((s+p)==n){
                System.out.println(n+" is a Special 2-digit number");
            }
            else{
                System.out.println(n+" is not a Special 2-digit number");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
