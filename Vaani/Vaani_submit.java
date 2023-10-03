import java.util.Scanner;
import java.util.Arrays;


public class Vaani_submit 
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
       System.out.println("Registration number:21BCE0892"); 
       System.out.println("Enter the string");
       String str=in.next();
       String[] array = str.split(" ");
       System.out.println(Arrays.toString(array));
       int count=0;
       for (int i=0;i<array.length;i++)
       {
         String j= array[i];
           if(j.equals("India"))
           {
               count++;
           }
       }
        System.out.print("The count of the word India in the string is "+count);
        
           
       System.out.println("Enter the number of students : ");
       int number=in.nextInt();
       String[] micro=new String[number];
       for (int i=0;i<number;i++)
       {
            System.out.println("Enter the registration numbers");
            String stri=in.next();
            micro[i]=stri;
        }
       System.out.println(Arrays.toString(micro));
       int scope=0;
       int site=0;
       for (int i=0;i<number;i++)
       {
           if (micro[i].contains("BCE")||micro[i].contains("BKT")||micro[i].contains("BCT")||micro[i].contains("BCI")){
               scope++;
               System.out.println(" "+micro[i]+" has been selected into Microsoft from SCOPE");
            }
            else if(micro[i].contains("BIT"))
            {
                site++;
                System.out.println(" "+micro[i]+" has been selected into Microsoft from SITE");
            }
        }
        if(scope==0 && site==0)
        {
            System.out.println("No students from SCOPE and SITE are placed in Microsoft");
        }
        else
        {
            System.out.println("There are "+scope+" students from SCOPE and "+site+" from SITE");
        }
        
        
    }
}