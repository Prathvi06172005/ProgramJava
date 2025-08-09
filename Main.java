class Main {
    public static void main(String[] args){
        
        int n=1551;
        int su=n;
        int reverse=0;
        while(n>0)
        {
            int mod=n%10;
            reverse=reverse*10+mod;
            n=n/10;
        }
        if(reverse==su)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}