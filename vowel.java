public class vowel {
    static String   isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return "it is vowel";
        }
        return "not vowel";
    }
    public static void main(String[]args)
    {
        System.out.println(isvowel('b'));
    }
    
}
