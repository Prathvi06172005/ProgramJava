public class Numbersystem5 {
    public static void main(String[] args){
        int n=7984;
        int seven=8,sodd=9,leven=0,lodd=1;
        while(n>0){
            int mod=n%10;
            if(mod%2==0){
                if(mod<seven){
                    seven=mod;
                }
                if(mod>leven){
                    leven=mod;
                }
            }else{
                if(mod<sodd){
                    sodd=mod;
                }
                if(mod>lodd){
                    lodd=mod;
                }
            }
            n=n/10;
        }
        System.out.println(seven+" "+sodd+" "+leven+" "+lodd);
        int small,large,sum;
        small=seven+sodd;
        large=leven+lodd;
        sum=large+small;
        System.out.println(sum);
        if(sum%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}