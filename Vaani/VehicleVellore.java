import java.util.Scanner;
import java.util.Arrays;
public class VehicleVellore {
    // Vaani
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers of 5 vehicles : ");
        String ar[]=new String[5];
        for(int i=0;i<4;i++){
            ar[i]=sc.next();
            if(ar[i].substring(0,4)!="TN23"){
                System.out.println("Vehicle is not from Vellore");
            }
        }
        Arrays.sort(ar);

        System.out.println(Arrays.toString(ar));

    }
}
