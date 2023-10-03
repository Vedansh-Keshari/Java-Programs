import java.util.*;

public class fas_sarthak {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);

         int n = sc.nextInt();
         String s=String.valueOf(n)+String.valueOf(n*2)+String.valueOf(n*3);

         String a[] = s.split("");

         ArrayList<String> l = new ArrayList<>();

         for(int i=0;i<a.length;i++)
         {
             l.add(a[i]);
         }
        
         HashSet<String> hset = new HashSet<>(l);

         l = new ArrayList<>(hset);

         Collections.sort(l);

         if(!(l.get(0).equals("0")) && l.size()==9)
         {
             System.out.println("fas");
         }
         

         System.out.println(l);

    }
}
