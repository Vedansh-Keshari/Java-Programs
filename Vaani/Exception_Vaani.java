import java.lang.invoke.WrongMethodTypeException;
import java.util.Scanner;
public class Exception_Vaani {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter marks for student "+(i+1));
            a[i]=sc.nextInt();
        }
        // WrongMarks wm=new WrongMarks();
        try{
            for(int i=0;i<n;i++){
                if(a[i]<0 || a[i]>100){
                    throw new WrongMarks("Invalid marks entered");
                }
            }
        }
        catch(WrongMarks wm){
            System.out.println(wm.getMessage());
        }
    }
}

class WrongMarks extends Exception{
	WrongMarks(String s){
		super(s);
	}
}