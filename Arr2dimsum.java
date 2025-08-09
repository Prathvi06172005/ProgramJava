public class Arr2dimsum {
    public static void main(String[] args){
        int row=3,col=3;
        int tb=0,lr=0;
        int[][] arr={{12,14,16},{17,22,34},{45,32,41}};
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||i==2){
                    tb+=arr[i][j];
                }
                if(j==0||j==2){
                    lr+=arr[i][j];
                }
                
            }
        }
        System.out.println(tb);
        System.out.println(lr);
        if(tb>lr){
            System.out.println("top bottom is greater");
        }else{
            System.out.println("left right is greater");
        }
    }
}
