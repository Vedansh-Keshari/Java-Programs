import java.util.Scanner;
public class magic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int p = sc.nextInt();
        int n=p;
        while(n>=10){
            int s=0;
            for(int x=n;x!=0;x/=10){
                int d=x%10;
                s+=d;
            }
            n=s;
        }
        if(n==1){
            System.out.println(p+" is a Magic Number.");
        }
        else{
            System.out.println(p+" is not a Magic NumberK");
        }
    }
}
