public class Askii {
    public static void main(String[] args){
        String str="Vignesh2025";
        for(int i=0;i<str.length();i++)
        {
            if((int)str.charAt(i)>=48&&str.charAt(i)<=57)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
    
}
