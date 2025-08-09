public class Main4{
    static void sum(int[] arr,int l){
        if(l==arr.length)
        {
            return;
        }
        System.out.println(arr[l]);
        sum(arr,++l);
    }
    public static void main(String[]args)
    {
        int[] arr={2,5,6,7,8,9};
        sum(arr,0);
    }
}
    

