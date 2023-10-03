import java.util.Scanner;

public class Brinda1 {
    int m1,m2,m3;
    double avg;
    Brinda1(){
        m1=0;
        m2=0;
        m3=0;
        avg=0.0;
    }
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        Brinda1 P=new Brinda1();
        P.input();
        P.calculate();
        P.display();
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in Physics : ");
        m1=sc.nextInt();
        System.out.println("Enter marks in Chemistry : ");
        m2=sc.nextInt();
        System.out.println("Enter marks in Mathematics : ");
        m3=sc.nextInt();
    }
    void calculate(){
        avg = (m1+m2+m3)/3.0;
    }
    void display(){
        int day=0;
        if(avg>90){
            day=1;
        }
        else if(avg<=90 && avg>80){
            day=2;
        }
        else if(avg<=80 && avg>75){
            day=3;
        }
        System.out.println("Counselling day : "+day);
    }
}
