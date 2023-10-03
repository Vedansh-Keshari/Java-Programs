import java.util.*;

import jdk.internal.jimage.decompressor.ZipDecompressorFactory;

class Niven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter base of the number");
            int b = sc.nextInt();
            if (b <= 36) {
                while (true) {
                    System.out.println("Enter any number");
                    String n = sc.next();
                    boolean valid = true;
                    for (int x = n; x != 0; x /= 10) {
                        
                       // CHECK VALIDITY OF numerals of n with the base b accordingly like A to Z
                        

                    }
                    if (!valid) {
                        System.out.println("Invalid Number");
                        continue;
                    }
                    int s = 0;
                    for (int x = n; x != 0; x /= 10) {
                        int d = x % 10;
                        s += d;
                    }


                    
                    if (convert(n) % convert(s) == 0) {
                        System.out.println(n+" is a Niven Number");
                    }
                    else{
                        System.out.println(n+" is not a Niven Number");
                    }
                }
            }
            else{
                System.out.println("Invalid Input");
                continue;
            }
        }
    }
}
