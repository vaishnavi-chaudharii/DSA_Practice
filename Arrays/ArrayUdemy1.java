package Arrays;

public class ArrayUdemy1 {
    int arr[] = null;
    
    public ArrayUdemy1(int size){
        arr = new int[size];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = Integer.MIN_VALUE; 
        }
    }

    public void insert(int location, int newEle){
        try {
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = newEle;
                System.out.println("Successfully inserted");
            }
            else{
                System.out.println("The cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid");

        }
        
    }
}

class Main{
    public static void main(String[] args) {
        ArrayUdemy1 au = new ArrayUdemy1(10);
        au. insert(0, 0);
        au. insert(1, 10);
        au. insert(2, 20);
        au. insert(1, 30);
        au. insert(12, 120);
    }
}
