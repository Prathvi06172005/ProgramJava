

class Main2{
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
        while(real>0)
        {
            int mod1=real%10;
            sum=min+mod1;
            System.out.print(sum);
            real=real/10;
        }
        
        
    }
}
   