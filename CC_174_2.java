import java.util.*;
class CC_174_2{
    public static void main(String args[]){
        int c=0;
        for(int x=100;x<1000;x++){
            int s=0;
            for(int y=x;y!=0;y/=10){
                int d=y%10;
                s+=d;
            }
            if(s==10){
                c++;
            }
        }
        System.out.println(c);
    }
}