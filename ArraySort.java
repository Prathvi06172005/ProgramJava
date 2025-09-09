public class ArraySort {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        // int[] arr = {5, 3, 4, 1, 2};

        int i;
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Not Sorted");
                break;
            }
        }

        if (i == arr.length - 1) {
            System.out.println("Sorted");
        }
    }
}

