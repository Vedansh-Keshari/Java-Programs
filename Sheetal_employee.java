import java.util.Scanner;
public class Sheetal_employee {
    String name;
    String number;
    String design;
    public void input(String name, String number, String design){
        this.name=name;
        this.number=number;
        this.design=design;
    }
    public void display(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Number :"+number);
        System.out.println("Designation : "+design);
    }
}

public class Permanent_Employee extends Sheetal_employee{
    int basic_pay,HRA,DA,PF;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic_pay :");
        basic_pay=sc.nextInt();
        System.out.println("Enter HRA :");
        HRA=sc.nextInt();
        System.out.println("Enter DA :");
        DA=sc.nextInt();
        System.out.println("Enter PF :");
        PF=sc.nextInt();
    }
    public void display(){
        System.out.println("Basic_pay : "+basic_pay);
        System.out.println("HRA : "+HRA);
        System.out.println("DA : "+DA);
        System.out.println("PF : "+PF);
    }
    public int calculate(){
        return basic_pay+HRA+DA-PF;
    }
}

public class Temporary_Employee extends Sheetal_employee{
    int salary;
    public void input(int sala){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary :");
        salary=sala;
    }
    public void display(){
        System.out.println("Salary : "+salary);
    }
}

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name : ");
        String name=sc.nextLine();
        System.out.println("Enter employee number : ");
        String number=sc.next();
        System.out.println("Enter employee designation : ");
        String design=sc.next();
        Sheetal_employee se=new Sheetal_employee();
        se.input(name,number,design);
        Permanent_Employee pe=new Permanent_Employee();
        pe.input();
        Temporary_Employee te=new Temporary_Employee();
        int sal=pe.calculate();
        te.input(sal);

        se.display();
        pe.display();
        te.display();
    }
}