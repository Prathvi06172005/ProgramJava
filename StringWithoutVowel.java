public class StringWithoutVowel {
   public StringWithoutVowel() {
   }

   public static void main(String[] var0) {
      String var1 = "prathvi";
      boolean var2 = false;

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         if (var1.charAt(var3) != 'a' && var1.charAt(var3) != 'e' && var1.charAt(var3) != 'i' && var1.charAt(var3) != 'o' && var1.charAt(var3) != 'u') {
            System.out.println(var1.charAt(var3));
         }
      }

   }
}
