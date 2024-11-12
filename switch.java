public class switch
{
   public static void main(String[] args)
   {
      int choice = 1;

      switch(choice)
      {
         case 1: System.out.println("idli");
         break;
         case 2: System.out.println("dosa");
         break;
         case 3: System.out.println("wada");
         break;
         case 4: System.out.println("puri");
         break;
         case 5: System.out.println("upma");
         break;
         default: System.out.println("invalid choice");
      }

      System.out.println("--- thank you, visit again ---");
   }
}