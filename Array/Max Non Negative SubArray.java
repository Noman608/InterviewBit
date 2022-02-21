
import java.util.*;

public class STACK {

    public static void main(String[] args) {
        int[] a = {1, 2, 5, -7, 2, 5};

        int max_Sum = 0, courrent_sum =0,s=0,start=0,end=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0) {
                courrent_sum = 0;
                s = i+1;
            }
            else {
                courrent_sum = courrent_sum+ a[i];
            }
            if(courrent_sum>max_Sum) {
                max_Sum = courrent_sum;
                start = s ;
                end =i;
            }

        }
        int[] x =new  int[end-start+1];
        int X=0;
        for (int i = start;i <= end;i++)
            {
                x[X]=a[i];
                System.out.println(x[X]);
                X++;
            }




    }
}
