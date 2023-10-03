import java.util.Scanner;
// check repeated pdf from Java hmmm...
interface increment{
    public void update(int time);
    public void display(int time);
}

interface set{
    public void setTime(int time);
}


public class Interface_Brinda implements increment,set{
    // This is your class Digital_clock
    int time;
    public void update(){
        time++;
    }
    public static void main(String args[]){
        Interface_Brinda ib=new Interface_Brinda();
        int t=ib.time;
        int hr=(int)(t/3600.0);
        int min=(int)((t-(hr*60))/60.0);
        int sec=(int)(t-(hr*3600)-(min*60));
        System.out.println(hr+"/"+min+"/"+sec);
    }
}

public class MinuteClock{
    public static void main(String args[]){
        System.out.println(hr+"/"+min);
    }

}

class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println();
    }
}