public class AddEven {
    static int sumeven(int[] arr,int l){
        if(l>arr.length-1)
        {
            return 0;
        }
        if(arr[l]%2==0)
        {
            return arr[l]+sumeven(arr,++l);
        }
        else{
            return sumeven(arr,++l);
        }
    }
    public static void main(String[]args)
    {
        int [] arr={2,5,8,1,4,9,7,6};
        System.out.println(sumeven(arr,0));
    }
}
        
       