class MultiDemEven{
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int sum=0;int rd=0;int ld=0;
        int[][] arr={{12,14,16},
                     {17,22,34},
                     {45,32,41}};
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++)
                {
                 if(i==j&&arr[i][j]%2==0){
                    rd=rd+arr[i][j];
                    
                }
                if(i+j==2&&arr[i][j]%2==0)
                {
                 ld=ld+arr[i][j];
                }
            }
         }
             System.out.println(rd);
             System.out.println(ld);
        
   }
}