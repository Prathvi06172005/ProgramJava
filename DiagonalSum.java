public class DiagonalSum {
    
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = a.length;
        int first = 0, second = 0;

        for (int i = 0; i < n; i++) {
            first += a[i][i];              
            second += a[i][n - 1 - i];    
        }

        System.out.println("first Diagonal Sum: " + first);
        System.out.println("Second Diagonal Sum: " + second);
    }
}
