public class B {
    public static void main(String args[]){
        for(int x=0;x<9;x++){
            for(int y=0;y<10;y++){


                if((x%2==1 && ( (y>1 && y<7) || (y>8) )) || ((x==2 || x==6) && y>1 && y<8) || (x%4==0 && y>6)){
                    System.out.print(" ");
                }
                else if(y==0 || y==1){
                    System.out.print("*");
                }
                else{
                    System.out.print("#");
                }












                // if(y==1 || y==0){
                //     System.out.print("*");
                // }
                // // else if((y>1 && y<7 && (x==0 || x==4 || x==8)) || (y-x==7 || y-x==)){
                //     System.out.print("#");
                // }
                // else{
                //     System.out.print(" ");
                // }
            }
            System.out.println();
        }
    }   
}