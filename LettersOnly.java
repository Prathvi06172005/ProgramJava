public class LettersOnly {
    public static void main(String[] args){
        String str="Sugar2025guy";
        for(int i=0;i<str.length();i++)
        {
            if((int)str.charAt(i)>=65&&str.charAt(i)<=90||str.charAt(i)>=97&&str.charAt(i)<=122)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
    
}
