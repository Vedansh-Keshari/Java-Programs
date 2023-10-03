import java.util.*;

class Emirp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int r = 0;
        boolean prime = true;
        boolean emirp = true;
        for (int x = 2; x < n; x++) {
            if (n % x == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            for (int x = n; x != 0; x /= 10) {
                int d = x % 10;
                r = r * 10 + d;
            }
            for (int x = 2; x < n; x++) {
                if (r % x == 0) {
                    emirp = false;
                    break;
                }
            }
            if(emirp){
                System.out.println(n+" is an Emirp Number");
            }
            else{
                System.out.println(n+" is not an Emirp Number");
            }
        }
        else{
            System.out.println(n+" is not a Prime number and hence cannot be an Emirp Number");
        }
    }
}