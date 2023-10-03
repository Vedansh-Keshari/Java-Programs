// Write a program to input name, father's name and school of a student and print them
import java.io.*;
class P8{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter your name : ");
        String n=br.readLine();
        System.out.println("Enter your father's name : ");
        String fn=br.readLine();
        System.out.println("Enter the name of your school : ");
        String sn=br.readLine();
        System.out.println("Enter your age : ");
        int age=Integer.parseInt(br.readLine());
        System.out.println("Enter your grade : ");
        char g=br.readLine().charAt(0);
        System.out.println("Name   : "+n); 
        System.out.println("Father : "+fn); 
        System.out.println("School : "+sn);
        System.out.println("Age    : "+age);
        System.out.println("Grade  : "+g);
    }
}
