import java.util.*;
class Pronic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        boolean pronic=false;
        for(int x=0;x<=(int)Math.sqrt(n);x++){
            if((x*(x+1))==n){
                pronic=true;
                break;
            }
        }
        if(pronic){
            System.out.println(n+" is a Pronic Number");
        }
        else{
            System.out.println(n+" is not a Pronic Number");
        }
    }
}