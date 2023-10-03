public class P221{
    public static void main(String args[]){
        for(int x=9;x>=1;x-=2){
            for(int y=9;y>x;y-=2){
                System.out.print(" ");
            }
            for(int y=x;y>=1;y--){
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
