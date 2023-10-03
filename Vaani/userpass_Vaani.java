import java.util.Scanner; 
public class userpass_Vaani {
    // Vaani
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username : ");
        String u=sc.nextLine();
        System.out.println("Enter password : ");
        String pa=sc.nextLine();
        System.out.println("Confirm Password : ");
        String re=sc.nextLine();
        if(u.length()==0){
            System.out.println("Username field is empty");
        }
        if(pa.length()==0){
            System.out.println("Password field is empty");
        }
        if(pa.length()<8){
            System.out.println("Invalid Password");
        }
        if(pa.indexOf(u)==-1){
            System.out.println("Password does not contain username");
        }
        else{
            System.out.println("Password contains username");
        }
        if(pa.equals(re)){
            System.out.println("Password and Confirm Password are the same");
        }
        else{
            System.out.println("Password and Confirm Password are not the same");
        }
    }
}
