public class digital_sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n=sc.nextInt();
        while(true){
            int sum=sum(n);
            if(sum%10==0){
                break;
            }
        }
    }

    public static int sum(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
}
//keep adding until a single digit is left