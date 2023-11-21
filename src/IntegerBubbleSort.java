import java.util.Arrays;

public class IntegerBubbleSort {
    
    public static void main(String[] args){
        int[] intArray = {96, 69, 143 ,21, 66};
        
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        
        bubbleSort(intArray);
        
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));
    }
    
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                }
            }
        }
    }
}