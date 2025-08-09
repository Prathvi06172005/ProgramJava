public class SumAdd {
    static int sum(int[] arr,int l,int sumarray){
        if(l==arr.length)
        {
            return sumarray;
        }
        sumarray=sumarray+arr[l];
        return sum(arr,++l,sumarray);

        
    }
    public static void main(String[]args)
    {
        int[] arr={2,5,6,7,8,9};
        int s=0;
        System.out.println(sum(arr,0,s));
    }
}
        
        

