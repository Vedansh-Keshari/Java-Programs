import java.util.Scanner;
public class mobile_phone_Vaani {
    String model_name;
    String company;
    double price;
    int year;

    set_mobileDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter model name : ");
        model_name=sc.next();
        System.out.println("Enter company name : ");
        company=sc.next();
        System.out.println("Enter price : ");
        price=sc.nextInt();
        System.out.println("Enter year of manufacture : ");
        price=sc.nextInt();
    }

    sort_mobileDetails(){

    }

    display_mobileDetails(){

    }

    public static void main(String args[]){
        mobile_phone_Vaani ob[]=new mobile_phone_Vaani[5];
        for(int i=0;i<5;i++){

        }
    }
}
