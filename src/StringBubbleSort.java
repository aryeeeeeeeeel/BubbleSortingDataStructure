import java.util.Arrays;

public class StringBubbleSort {
    
    public static void main(String[] args){
        String[] strArray = {"Elena", "Jam", "Ariel", "Mark", "Bosh", "elena", "ariel"};
        
        System.out.println("Original String Array: " + Arrays.toString(strArray));
        
        bubbleSort(strArray);
        
        System.out.println("Sorted String Array: " + Arrays.toString(strArray));
    }
    
    static void bubbleSort(String[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if(arr[j].compareToIgnoreCase(arr[j + 1])> 0){
                String temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                }
            }
        }
    }
}