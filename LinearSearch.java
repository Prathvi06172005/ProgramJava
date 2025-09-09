
    public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int key = 70;int i;

    
        for ( i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                break; 
            }
        }

        if (i == arr.length) {
            System.out.println("Element not found");
        }
    }
}

