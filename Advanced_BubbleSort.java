import java.util.Scanner;
public class Advanced_BubbleSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int l=sc.nextInt();
        int ar[]=new int[l];

        for(int i = 0 ; i < l ; i++ ){
            ar[i]=sc.nextInt();
        }


        int upto = ar.length - 2;
        boolean sorted;
        do{
            sorted = true;
            for(int y = 0 ; y <= upto ; y++ ){
                if( ar[y] > ar[y++] ){
                    sorted = false;
                    int t = ar[y] ;
                    ar[y] = ar[y+1] ;
                    ar[y+1] = t ;
                }
            }
            upto--;
        }while(sorted==false);
    }   
}
