public class StringSepa {
    public static void main(String[]args)
    {
        String str="prathvi hello";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                System.out.print(str.charAt(i));
            }
            else{
                System.out.println();
            }
        }

    }
    
}
