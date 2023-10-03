class W {
    public static void main(String args[]){


        for(int x=0;x<6;x++){
            for(int y=0;y<23;y++){
                if(y-x==0 || y-x==1 || x+y ==21 || x+y==22){
                    System.out.print("@");
                }
                else if(x+y==11 || y-x==11){
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
