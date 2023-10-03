import java.util.Scanner;

public class a_power_b {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int d=1;
        for(int x=1;x<=b;x++){
            d=d*a;
            d=d%10;
        }
        System.out.println(d);
    }
}
