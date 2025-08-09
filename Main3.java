public class Main3 {
    static void sum(int[] n,int l){
        if(l<0)
        {
            return;
        }
        System.out.println(n[l]);
        sum(n,--l);
    }
    public static void main(String[]args)
    {
        int[] arr={2,5,6,7,8,9};
        sum(arr,arr.length-1);
        
        

    }
    
}
