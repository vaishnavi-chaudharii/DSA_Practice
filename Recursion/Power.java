package Recursion;

class Power {

    static int isPower(int n, int e){
        if(e == 0 || e == 1){
            return n;
        }
        else{
            return n * isPower(n, e-1);
        }
    }

    public static void main(String[] args) {
        int pow = isPower(10, 2);
        System.out.println(pow);
    }
}
