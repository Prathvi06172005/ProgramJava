class MultiDem{
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int[][] arr={{12,14,16},
                     {17,22,34},
                     {45,32,41}};
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(i==j||i+j==2){
                    System.out.print(arr[i][j]+ " ");
                }
                else{
                      System.out.print("  ");
                }
             }
             System.out.println();
        }
   }
}