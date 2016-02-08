package pkg1.insertion_sort;

/**
 *
 * @author Yasser Alaa Eldin
 */
public class Insertion_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A= {5,2,4,6,1,3};
        
        int key,j;
        
        for (int i = 1; i < A.length; i++) {
            key = A[i];
            j=i-1;
            while(j>=0 && A[j]>key)
            {
                A[j+1] = A[j];
                j=j-1;
            }
            A[j+1] = key;
        }
        
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
            
        System.out.println();
    }
    
}
