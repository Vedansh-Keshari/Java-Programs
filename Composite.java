import java.util.*;
class Composite{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        boolean composite=false;
        for(int x=2;x<n;x++){
            if(n%x==0){
                composite=true;
                break;
            }
        }
        if(composite){
            System.out.println(n+" is a composite number");
        }
        else{
            System.out.println(n+" is not a composite number");
        }
    }
}