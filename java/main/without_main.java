class A{
     public static void main(String[] args)
   // public static void main(String[] ...args) // Variable Length Argument (VARGS)
     {
        System.err.println("In A");
    }
}
/**
 * without_main
 */
public class without_main {

    public static void main(String[] args) {
        String ar[] = {"hello"};
        A.main(ar);
         //A.main(args);
        //A.main(null);
       // Wtihout passing string array
      // A.main();
        System.err.println("In B");
    }
}
 