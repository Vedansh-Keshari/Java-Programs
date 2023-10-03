import java.util.Scanner;
public class max_l {
    //find the length of the word with maximum length
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        int max=str[1].length();
        for(int i=1;i<str.length;i++){
            int l=str[i].length();
            if(l>max){
                max=l;
            }
        }
        System.out.println(max);
    }
}
//An English school teacher is teaching how to build sentences for kindergarten students. She starts by teaching two words in a sentence, then 3 words, and so on. The next step is that she asks the students to find which word in the sentence they have made has the maximum value of alphabets. The task here is to write a program to find the longest word in each input sentence(str) Note The sentence can consist of uppercase, lowercase alphabets, special characters and numbers.
