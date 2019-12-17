class A{
    static{
        System.out.println("Static Block Of A Class");
    }
    A(){
        System.out.println("A cons..");
    }
}
class B{
    static{
        System.out.println("Static Block of B Class");
    }
    B(){
        System.out.println("B cons...");
    }
}
class Load{
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);   // This is Run Time Class Loading 
            c.newInstance(); //  Is is Run Time Object creation      
        } catch (Exception e) {
           System.out.println(e);
        }
        

    }
}