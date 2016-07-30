package lombaurut;

import com.mkdika.Xutil;
import java.io.IOException;

public class Lombaurut {

    public static void main(String[] args) throws IOException {

        // Baca text file, masukan isi text file kedalam variable array.       
        int[] x = Xutil.readTxtFileToArray("random.dat");
        if (x == null || x.length <= 0) {
            System.out.println("Error read text file. try again.");
            return;
        }else {
            System.out.println("Array Length: " + x.length);
        }
        
        long start = Xutil.getTime();
        // BEGIN - YOUR CODE HERE
        // =====================================================================
        
        // Baseline Example - Used Bubble Sort Algorithm
        //int n = x.length, c, d, swap;
        //for (c = 0; c < (n - 1); c++) {
        //    for (d = 0; d < n - c - 1; d++) {
        //        if (x[d] > x[d + 1]) {
        //            swap = x[d];
        //            x[d] = x[d + 1];
        //            x[d + 1] = swap;
        //        }
        //    }
        //}        
        //int j;                     // the number of items sorted so far
        //int key;                // the item to be inserted
        //int i; 
        //Insertion Descending
        //for (j = 1; j < x.length; j++)    // Start with 1 (not 0)
        //{
        //   key = x[ j ];
        //   for(i = j - 1; (i >= 0) && (x[ i ] < key); i--)   // Smaller values are moving up
         // {
        //         x[ i+1 ] = x[ i ];
        //  }
        // x[ i+1 ] = key;    // Put the key in its proper location
        //}
        //Insertion Ascending 10sec
        for (int j = 0; j<x.length; j++) {
            for (int k = 0; k < x.length; k++){
                if (x[j] < x[k]) {
                    int buffer = x[j];
                    x[j] = x[k];
                    x[k] = buffer; 
                }
            }
        }
        // 24sec
        //int temp;
        //for(int i=0; i <x.length-1; i++){
        //    for(int j=1; j< x.length-1; j++){
        //        if(x[j-1] > x[j]){
        //            temp=x[j-1];
        //            x[j-1]=x[j];
        //            x[j]=temp;
        //        }
        //    }
        //}
        
        
        
        // =====================================================================
        // END
        long end = Xutil.getTime();

        System.out.println("Total execution time (nano sec): " + Xutil.executionTime(start, end));       
        Xutil.writeTxtFileFromArray(x, "sorted.dat");
    }

}
