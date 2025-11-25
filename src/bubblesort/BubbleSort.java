package bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args)
    {
        int ar[]={64,34,25,12,22,11,90};
        SortArray a=new SortArray();
        a.Asort(ar);
        System.out.println("Assending Order");
        System.out.println(Arrays.toString(ar));
        a.Dsort(ar);
        System.out.println("Desending Order");
        System.out.println(Arrays.toString(ar));
       
    }
    
}
