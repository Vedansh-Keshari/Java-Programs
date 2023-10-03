import java.util.Scanner;
// check repeated pdf from Java hmmm...
public class Inheritance_Brinda {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account type : ");
        System.out.println("1 - For savings account ");
        System.out.println("2 - For current account");
        int ch=sc.nextInt();
        if(ch==1){
            sav_acct sa=new sav_acct();
            sa.input("Savings");
            System.out.println("Enter interest percentage : ");
            double
        }
        else if(ch==2){
            cur_acct ca=new cur_acct();
            ca.input("Current");
        }
        else{
            System.out.println("Invalid Choice");
        }

    }
}

class Account{
    Scanner sc=new Scanner(System.in);
    String cname;
    long accnum;
    String type;
    int deposit;
    int total;
    public void update(){
        System.out.println("Enter deposit amount : ");
        deposit=sc.nextInt();
        total+=deposit;
    }
    public void display(){
        System.out.println(total+" is the amount present in the account now.");
    }
}

class cur_acct extends Account{
    String cname;
    long accnum;
    String type;
    public void input(String typ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer\'s name : ");
        cname=sc.nextLine();
        System.out.println("Enter account number : ");
        accnum=sc.nextLong();
        // System.out.println("Enter account type : ");
        type=typ;
    }
    
}

// import java.util.Scanner;
class sav_acct extends Account{
    String cname;
    long accnum;
    String type;
    public void input(String typ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer\'s name : ");
        cname=sc.nextLine();
        System.out.println("Enter account number : ");
        accnum=sc.nextLong();
        type=typ;
    }

    public int withdraw(int amt){
        if(super.total>0){
            return super.total-amt;
        }
        return 0;
    }
}