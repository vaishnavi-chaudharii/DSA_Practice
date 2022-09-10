package Arrays;

import java.util.Arrays;

public class ArrayUdemy2 {
    int[] arr;
    int size;
    int length;

    public ArrayUdemy2(int size, int length){
        arr = new int[size];
    }

    public void append(int val){
        arr[length] = val;
        length++;
    }

    public void getLength(){
        System.out.println(length);
    }

    public void insert(int index, int val){
        if(index >= 0 && index < length){
            for(int i = length; i > index; i--){
                arr[i] = arr[i - 1];
            }
            arr[index] = val;
            length++;
        }
    }

    public int delete(int index){
        int temp = 0;
        if(index >= 0 && index < length){
            temp = arr[index];
            for(int i = index; i < length; i++){
                arr[i] = arr[i + 1];
            }
            length--;
            return temp;
        }
        return -1;
    }

    public void pop(){
        int temp = arr[length - 1];
        for(int i = length - 1; i < length; i++){
            arr[length - 1] = arr[length]; 
        }
        System.out.println(temp);
        length--;
    }

    public void display(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        ArrayUdemy2 au = new ArrayUdemy2(10, 0);
        au.append(10);
        au.append(20);
        au.append(30);
        au.append(40);
        au.append(50);
        au.insert(1, 44);
        au.getLength();
        au.display();
        au.delete(0);
        au.getLength();
        au.display();
        au.pop();
        au.getLength();
        au.display();
    }
}
