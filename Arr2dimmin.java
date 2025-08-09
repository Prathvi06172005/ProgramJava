public class Arr2dimmin {
    public static void main(String[] args){
        int row=3,col=3;
        int[][] arr={{12,14,16},{17,22,34},{45,32,41}};
        int minl=arr[0][0],minr=arr[0][2];
    
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    if(arr[i][j]<minl){
                        minl=arr[i][j];
                    }
                }
                if(i+j==2){
                    if(arr[i][j]<minr){
                        minr=arr[i][j];
                    }
                }
            }
        }
        if(minl<minr){
        System.out.println(minl);
        }else{
        System.out.println(minr);
        }
    }
}