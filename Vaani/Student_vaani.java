import java.util.Scanner;
public class Student_vaani {
    static String stid,name,yoj;
    public static void display(){
        System.out.println("Name : "+name);
        System.out.println("Student ID : "+stid);
        System.out.println("Year of Joining : "+yoj);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Students : ");
        int n=sc.nextInt();
        int bce=0
        int bit=0;
        int bec=0;
        int bee=0;
        for(int i=0;i<n;i++){
            boolean invalid=true;
            System.out.println("Enter Student ID : ");
            stid=sc.next();
            stid=stid.toUpperCase();
            System.out.println("Enter name : ");
            name=sc.next();
            System.out.println("Enter year of joining : ");
            yoj=sc.next();
            yoj=yoj.substring(2);
            try{
                String year=stid.substring(0,2);
                if(!(year.equals(yoj))){
                    throw new InvalidRegisterNumber("Invalid year entered");
                }
                String scool=stid.substring(2,5);
                if(scool.equals("BCE")){
                    bce++;
                }
                else if(scool.equals("BIT")){
                    bit++;
                }
                else if(scool.equals("BEC")){
                    bec++;
                }
                else if(scool.equals("BEE")){
                    bee++;
                }
                invalid=false;
            }
            catch(InvalidRegisterNumber irn){
                System.out.println(irn.getMessage());
            }
            if(!invalid && (Integer.parseInt(yoj)==18 || Integer.parseInt(yoj)==19)){
                // Student_vaani sv=new Student_vaani();
                Student_vaani.display();
            }
            System.out.println("SCOPE has "+bce+" students.");
            System.out.println("Information Tecchnology has "+bit+" students.");
            System.out.println("SENSE has "+bec+" students.");
            System.out.println("SELECT has "+bee+" students.");
        }

    }
}

class InvalidRegisterNumber extends Exception{
    InvalidRegisterNumber(String s){
        super(s);
    }
}