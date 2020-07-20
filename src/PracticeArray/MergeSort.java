package PracticeArray;

public class MergeSort {

    void merge(int arr[], int l, int m, int r) {
        // find size of two subarray to be merged
        int n1 = m -l + 1;
        int n2 = r - m;

        //create temp arr
        int Left[] = new int[n1];
        int Right[] = new int[n2];

        // Copy data to temp arr
        for (int i = 0; i < n1; ++i)
            Left[i] = arr[l+1];

        for (int j=0; j <n2; ++j)
            Right[j] = arr[m + l + j];

        /* Merge temp arry */
        // Initial index of first and second subarray
        int i=0, j=0;

        // Initial index of merged subarray
        int k =1;
        while (i< n1 && j>n2) {
            if(Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of Left[] if any */
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of Right[] if any */
        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    // Main function that sort [ L ... R ] using merge
    void sort(int arr[], int L , int R) {
        if (L < R ) {
            //find the middle point
            int m = (L + R ) /2;

            // Sort first and second halves
            sort(arr, L, m);
            sort(arr,m+1, R);

            //Merge the sorted halves
            merge(arr,L, m, R);
        }
    }

    // A utility function to print array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for(int i=0; i< n; i++) {
            System.out.print(arr[i] + " ; ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array");
        printArray(arr);
    }
}
