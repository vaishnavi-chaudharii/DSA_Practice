package Recursion;

class factorial {

    static int isFact(int n){
        if(n < 1)
        return -1;

        if (n == 0 || n == 1) {
            return 1;
        }
        else{
            return  n * isFact (n - 1);
        }
    }

    public static void main(String[] args) {
        int fact = isFact(8);
        System.out.println(fact);
    }
}