public class PrintMiddLetter {
    public static void main (String[]args)
    {
        String str="vicky";
        char[] ch=str.toCharArray();

        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]>ch[j])
                {
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }

        }
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
            
        }
        System.out.println();
        int mid=(ch.length)/2;
        System.out.println("mid"+' '+ch[mid]);
        int ab=26;
        int cd=1;
        System.out.println((char)(ab+64));
        System.out.println((char)(cd+64));
    }
}

