import java.util.Scanner;
public class Mobile_Vaani {
    String name;
    String ram;
    double price;
    String color;
    Mobile_Vaani(){
        name="";
        ram="";
        price=0.0;
        color="";
    }
    void setInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name :");
        name=sc.next();
        System.out.println("Enter ramspecification :");
        ram=sc.next();
        System.out.println("Enter price :");
        price=sc.nextDouble();
        System.out.println("Enter color :");
        color=sc.next();
    }
    void display(){
        System.out.println("Enter name :"+name);
        System.out.println("Enter ramspecification :"+ram);
        System.out.println("Enter price :"+price);
        System.out.println("Enter color :"+color);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of \'n\'");
        int n=sc.nextInt();
        Mobile_Vaani mv[]=new Mobile_Vaani[n];
        for(int i=0;i<n;i++){
            mv[i]=new Mobile_Vaani();
        }
        for(int i=0;i<n;i++){
            System.out.println("Customer : "+(i+1));
            mv[i].setInput();
            // mv[i].display();
        }
        for(int i=0;i<n;i++){
            System.out.println("Customer : "+(i+1));
            // mv[i].setInput();
            mv[i].display();
        }
    }
}
