package Recursion;

class ProductofArray {
    static int product(int A[], int N) 
        { 
            if (N <= 0) 
                return 1; 
            return (product(A, N-1) * A[N - 1]); 
        } 

        public static void main(String[] args) {
            int arr[] = {11,2,3,4,5};
            System.out.println(product(arr, arr.length));

        }
    
    }

