// Write a program to assign a file name with full path as given below. Using library functions extract and output the file path, file name & extension separately as shown :
// Input -> C:\Users\admin\Pictures\flower.jpg
// Output ->
// Path = C:\Users\admin\Pictures\
// Filename = flower
// Extension = jpg

import java.util.Scanner;
public class P92 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // String s="C:\\Users\\admin\\Pictures\\flower.jpg";
        // int slash=s.lastIndexOf('\\');
        // System.out.println("Path = "+s.substring(0,slash+1));
        // 
        // int dot=s.indexOf('.');
        // System.out.println("Filename = "+s.substring(slash+1,dot));
        // 
        // System.out.println("Extension = "+s.substring(dot+1));
    }
}
