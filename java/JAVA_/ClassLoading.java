/* ======================== Ex. of Static Loading ====================== */

/* =====================Scenario of Static Class Loding================== 
    1. In Inheritance 
    2. object Creartion(Other class)
    3. When calling a Static D.M. in Other class*/ 

/* =========== object Creartion(Other class) ================ */

class A{
    static{
        System.out.println("A Static Block");
    }
}
class B{
    static{
        System.out.println("B Static Block");
    }
}
class ClassLoading{
    static{
        System.out.println("ClassLoading Static Block");
    }
    public static void main(String[] args) {
        A a=new A(); // This is Static Loading bcz here compiler alreay  
        B b=new B(); // Know which class is load
    }
}

/*============================ OR =================================*/

    /* ===================== Inheritance ========================= */

/*
class A{
    static{
        System.out.println("A Static Block");
    }
}
class B extends A{
    static{
        System.out.println("B Static Block");
    }
}
class ClassLoading extends B {
    static{
        System.out.println("ClassLoading Static Block");
    }
    public static void main(String[] args) {
        
    }
}
*/

/* ===================== Calling Static D.M. ====================== */

/*

class A{
    static int x=10;
    static{
        System.out.println("A Static Block");
    }
}
 
class ClassLoading{
    static{
        System.out.println("ClassLoading Static Block");
    }
    public static void main(String[] args) {
        System.out.println(A.x);
    }
}

*/