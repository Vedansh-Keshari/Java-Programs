import java.util.*;
class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        boolean prime=true;
        for(int x=2;x<n;x++){
            if(n%x==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println(n+" is a Prime Number");
        }
        else{
            System.out.println(n+" is not a Prime Number");
        }
    }
}
