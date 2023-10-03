class A
{
    public static void main(String args[])
    {
        for(int x=1;x<=7;x++){
            for(int y=1;y<=7;y++){
                if(x==4){
                    System.out.print("*");
                }
                else if(x+y==5){
                    System.out.print("*");
                }
                else if(y-x==3){
                    System.out.print("*");
                }
                else if(x>4 && (y==1 || y==7)){
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