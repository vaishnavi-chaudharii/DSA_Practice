class Palindrome{
    public static void main(String a[]){
        int num = 121, temp, sum = 0;
        temp = num;
        while(num > 0){
            sum = sum * 10 + num % 10;
            num = num / 10;
        }
        if(temp == sum)
            System.out.println("Palindrome");
        else
        System.out.println(" Not A Palindrome");
    }
}