public class FunctionEvenOdd{
    static String evenodd(int a){
        
        if(a%2==0)
        {
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static void main(String[]args){
        System.out.println (evenodd(30));
    }
}
