public class largePrint {
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
        System.out.println("small" + ' ' +  ch[0]);
        System.out.println("large" + ' ' + ch[4]);
        
    }
    
}
