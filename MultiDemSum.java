class MultiDemSum{
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int sum=0;int top=0;int bottom=0;
        int[][] arr={{12,14,16},
                     {17,22,34},
                     {45,32,41}};
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(i==0||i==2){
                    top=top+arr[i][j];
                    System.out.print(arr[i][j]+ " ");
                }
                else{
                      System.out.print("  ");
                }
             }
             System.out.print(" ");
             for(int j=0;j<row;j++){
                if(j==0||j==2){
                    bottom=bottom+arr[i][j];
                    System.out.print(arr[i][j]+ " ");
                }
                else{
                      System.out.print("  ");
                }
             }
             System.out.println();
             
        }
        System.out.println(top);
        System.out.println(bottom);
        if(top>bottom)
        {
         System.out.println("top is greater");
        }
        else{
           System.out.println("bottom is greater");
       }
   }
}