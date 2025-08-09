public class Armstrong {
    public static void main(String[] args){
        int n=153,org=n;
        int sum=0;
        while(n>0){
            int mod=n%10;
            int cube=mod*mod*mod;
            sum+=cube;
            n=n/10;
        }
        System.out.println(sum);
        if(sum==org){
            System.out.println("Armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}