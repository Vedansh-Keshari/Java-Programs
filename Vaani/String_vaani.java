import java.util.Scanner;
public class String_vaani {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username : ");
        String user=sc.nextLine();
        System.out.println("Enter Password : ");
        String pass=sc.nextLine();
        System.out.println("Confirm Password : ");
        String conf=sc.nextLine();
        if(user.length()<8){
            System.out.println("Invalid Username Length");
        }
        if(pass.length()<8){
            System.out.println("Invalid Password Length");
        }
        boolean space=false;
        for(int i=0;i<user.length();i++){
            if(user.charAt(i)==32){
                space=true;
                break;
            }
        }
        if(space){
            System.out.println("Username should not contain space");
        }
        space=false;
        for(int i=0;i<pass.length();i++){
            if(user.charAt(i)==32){
                space=true;
                break;
            }
        }
        if(space){
            System.out.println("Password should not contain space");
        }
        if(!(pass.equals(conf))){
            System.out.println("Password does not match");
        }
        // for(int i=0;i<user.length()-2;i++){
        //     String use=user.substring(i,i+3);
        //     for(int j = 0 ; j < pass.length()-2; j++){
        //         String pas=pass.substring(j,j+2);
        //         if(use.equals(pas)){
        //             System.out.println("Password cannot contain Username");
        //         }
        //     }
        // }
        // Correct this
    }
}
