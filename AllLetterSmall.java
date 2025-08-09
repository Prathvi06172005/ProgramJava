public class AllLetterSmall{
    public static void main(String[]args)
    {
        String str="ViCky";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=65&&str.charAt(i)<=90)
            {
                int ch=(int)str.charAt(i)+32;
                System.out.print((char)ch);
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
    }
    
}