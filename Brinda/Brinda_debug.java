import java.util.Scanner;
public class Brinda_debug {
    public static void main(String args[]){
        One obj=new One();
        One ob1=new One("VIT");
        ob1.meth();
    }    
}


class One {
	String var;
One(); //default constructor
One(String s) //parameterized constructor 
{
	 var=s;
}
void meth()
{	
System.out.println("In method");
}
}