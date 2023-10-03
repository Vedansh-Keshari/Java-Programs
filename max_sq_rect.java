import java.util.Scanner;
//input N cuts and find the maximum number of squares or rectangles which can be carved out of a single square sheet
import javax.print.event.PrintJobListener;
class max_sq_rect{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int f=(int)Math.floor(N/2.0);
        int c=(int)Math.ceil(N/2.0);
        System.out.println((f+1)*(c+1));
    }
}
//A carpet manufacturing industry has newly ventured into the carpet installation business. All the carpets manufactured are large squares in shape. To install, each carpet has to be cut into shapes of squares or rectangles. The number of slits to be made is given as N.The task is to find the maximum number of equal squares or rectangles that can be achieved using N slits. Note The square carpet can be cut only using horizontal or vertical slits.Cuttings are done on a single carpet which should be rolled out completely i.e. no folding or stacking is allowed. Squares or rectangles cut should be equal size.