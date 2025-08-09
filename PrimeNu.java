public class PrimeNu {
    static String isPrime(int n){
        for(int i=2;i<=-1;i++){
            if(n%i==0)
            {
                return "not prime";
            }
        }
            return "is prime";
        }
        public static void main(String[]args){
            System.out.println(isPrime(18));
        }
    }

    

    

