import java.util.Scanner;
public class circular_queue {
    int ar[];
    int f,r;
    public circular_queue(int size){
        ar[]=new int[size];
        f=-1;
        r=-1;
    }
    public void input(int n){
        if(! (f==r && f!=-1 || f==-1 && r==ar.length-1)){
            r++;
            if(r==ar.length){
                r=0;
            }
            ar[r]=n;
        }
        else{
            System.out.println("Queue is full");
        }
    }
    public int output(){
        if(f==-1 && r==-1){
            return -9999;
        }
        else{
            f++;
            if(f==ar.length){
                f=0;
            }
            int ret=ar[f];
            if(f==r){
                f=-1;
                r=-1;
            }
            return ret;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n=sc.nextInt();
        System.out.println("Enter elements of the array : ");
        int a[]=new int[n];
        for(int ){

        }
    }
}
