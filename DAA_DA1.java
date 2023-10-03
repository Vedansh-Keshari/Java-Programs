import java.util.Scanner;
public class DAA_DA1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int K;

        do{
            System.out.println("Enter number of items to be considered : ");
            K=sc.nextInt();
        }while(K<1 || K>20);

        String name[]=new String[K];

        for(int i=0;i<K;i++){
            System.out.println("Enter name of item "+(i+1));
            name[i]=sc.next();
        }

        int n[]=new int[K];

        for(int i=0;i<K;i++){
            System.out.println("Enter number of "+name[i]+" in the stock");
            n[i]=sc.nextInt();
        }

        int cost[][]=new int[K][20];

        for(int i=0;i<K;i++){
            for(int j=0;j<n[i];j++){
                System.out.println("Enter price of "+name[i]+" "+(j+1));
                c[i][j]=sc.nextInt();
            }
        }

        
    }    
}


def maximum_spend_brute_force(M, K, garments):
    max_spend = 0
    for shirt in garments[0]:
        for belt in garments[1]:
            for shoes in garments[2]:
                curr_spend = shirt + belt + shoes
                if curr_spend <= M:
                    max_spend = max(max_spend, curr_spend)
    return max_spend if max_spend > 0 else "no solution"


    def maximum_spend_dynamic_programming(M, K, garments):
    dp = [[0 for j in range(M + 1)] for i in range(K + 1)]
    for i in range(1, K + 1):
        for j in range(1, M + 1):
            for price in garments[i-1]:
                if j >= price:
                    dp[i][j] = max(dp[i][j], dp[i-1][j-price]+price)
    if dp[K][M] == 0:
        return "no solution"
    return dp[K][M]