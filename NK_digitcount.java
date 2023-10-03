import java.util.Scanner;
//digitcount matches with K or not
class NK_digitcount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int l = (String.valueOf(N)).length();
        if(K==l){
            System.out.print("True");
        }
        else{
            System.out.print("False");

        }
        System.out.print(" "+K);
    }
}
//Given two positive numbers N and K. The task is to find the number N contains exactly K digit or not. If contains then print True <space><digit count of N>. Otherwise, print False <space><digit count of N>