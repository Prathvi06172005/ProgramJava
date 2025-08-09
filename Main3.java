    class Main3{
    public static void main(String[] args){
        
        int n=3874;
        int real=n;
        int min=9;
        int sum=0;
        while(n>0)
        {
            int mod=n%10;
            if(mod<min)
            {
                min=mod;
            }
            n=n/10;
        }
        String str=" ";
        while(real>0)
        {
            int mod1=real%10;
            sum=min+mod1;
            str=str+sum;
            real=real/10;
        }
         System.out.print(str);
        
    }
}
   