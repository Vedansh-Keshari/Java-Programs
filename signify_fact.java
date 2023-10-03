import java.util.Scanner;
//tell the first significant digit of a factorial
public class signify_fact
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=1;
		for(int x=1;x<=n;x++){
		    p=p*x;
		    if(p%10==0){
		        p/=10;
		    }
		}
		System.out.println(p%10);
        sc.close();
	}
}
//Mike likes to play with numbers. His friends are also good with numbers and often play mathematical games. They made a small game where they will spell the last digit of factorial of a number other than 0. Let say the given number is 5, so 5! (5 factorial) will be 5 * 4 * 3 * 2 * 1 = 120. Here 0 is the last digit. But, we don't want 0, we want a number other than 0. Then the last digit is 2. This is what we have to output.