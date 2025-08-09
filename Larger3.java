public class Larger3 {
    static String largeris(int a,int b,int c){
        if(a>b&&a<c)
        {
            return a+" "+ " greater";
        }
        else if(b>c){
            return b+" "+  "greater";
        }
        else{
            return c+" "+" greater";
        }
    }
    public static void main(String[]args){
        System.out.println(largeris(10,20,30));
    }
}
    