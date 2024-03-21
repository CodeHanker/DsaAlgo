package Competitive_Prog.Common.Additional;

public class GeneratingSubArrays {

    //In general, for an array/string of size n, there are n*(n+1)/2 non-empty subarrays/substrings.
    static void generateSubArrays(int arr[], int n) {
        // Picking one element in each outer loop
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
				/*
				Printing the subarray between the current starting point i.e. i and the current
				ending point i.e. j
				*/
                for (int k = i; k <= j; k++)
                    System.out.print(arr[k] + " ");

                System.out.println();
            }
        }
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3 };
        System.out.println("All the subarrays are: ");
        generateSubArrays(arr, arr.length);
    }
}
