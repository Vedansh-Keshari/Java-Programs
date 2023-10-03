class Z{
    public static void main(String args[]){


        for(int x=0;x<8;x++){
            for(int y=0;y<9;y++){
                if(x==0 || x==7){
                    System.out.print("@");
                }
                else if(x+y==7 || x+y==8){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}