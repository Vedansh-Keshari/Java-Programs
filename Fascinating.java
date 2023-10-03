import java.util.*;
class Fascinating{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        String s=String.valueOf(n)+String.valueOf(n*2)+String.valueOf(n*3);
        /*
        System.out.println(s+"     "+s.length());
        
        boolean fasc=true;

        for(int x=1;x<=9;x++){
            if(s.indexOf(x)==-1){
                fasc=false;
                break;
            }
        }
        */
        if(fasc){
            System.out.println(n+" is a Fascinating Number");
        }
        else{
            System.out.println(n+" is not a Fascinating Number  ");
        }
    }
}