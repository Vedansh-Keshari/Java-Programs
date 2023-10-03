import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
public class Insertion_Sort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        // int size=sc.nextInt();
        int n=sc.nextInt();
        // ArrayList<Integer> a=new ArrayList<>();
        // for(int x=0;x<size;x++){
        //     System.out.println("Enter element at index "+x);
        //     int d=sc.nextInt();
        //     a.add(d);
        // }
        // for(int x=1;x<a.size();x++){
            //     for(int y=x-1;y>=0;y--){
                
        //         // for(int i=0;i<size;i++){
        //         //     System.out.println(a.get(i));
        //         // }
        //         System.out.println(a);
        //         while(){
        //                 if(a.get(x)<a.get(y)){
            //                 int swap=a.get(x);
        //                 a.set(x,a.get(y));
        //                 a.set(y,swap);
        //         }
        //     }
        // }
        // for(int x=0;x<size;x++){
        //     System.out.println(a.get(x));
        // }
        
        int ar[]=new int[n];
        for(int x=0;x<n;x++){
            System.out.println("Enter element at index "+x);
            ar[x]=sc.nextInt();
        }

        for(int x=1;x<n;x++){
            int temp=ar[x];
            for(int y=x-1;y>=0;y--){
                if(temp<ar[y]){
                    ar[y+1]=ar[y];
                }
                else{
                    ar[y+1]=temp;
                    break;
                }
            }
        }

        for(int x=0;x<n;x++){
            System.out.println(ar[x]);
        }


    }
}
