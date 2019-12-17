public class main_overload {
    public static void main(String  ...args)  // Variable length Argument
    {
       System.err.println("In A");
       main(5);
   }
   public static void main(int a) {
       System.out.println(a);
   }
    
} 