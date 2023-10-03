public class P240{
    public static void main(String args[]){
        for(int x=1;x<=7;x++){
            for(int y=1;y<=7;y++){
                if((x+y)<=5 || (x+y)>=11 || (x-y)>=3 || (y-x)>=3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}