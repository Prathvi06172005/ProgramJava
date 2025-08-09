public class FindLarge {
    static String larger(int a,int b){
        if(a>b)
        {
            return a+" "+ " greater";
        }
        else{
            return b+" "+  "greater";
        }
    }
    public static void main(String[]args){
        System.out.println(larger(10,20));
    }
    
}
