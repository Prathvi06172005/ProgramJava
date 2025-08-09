public class Recurrsion {
    static void name(int n){
        if(n==11){
            return;
        }
        System.out.println(n);
        name(++n);
    }
    static void reverse(int a){
    if(a==0){
        return;
    }
    System.out.println(a);
    reverse(--a);
}
    public static void main(String[]args)
    {
        name(1);
        reverse(10);
    }
}
