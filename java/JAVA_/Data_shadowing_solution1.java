/*
public class Data_shadowing_solution1 {
    int age=10;
    void show(int age){
        System.out.println(age);
        System.out.println(age);

    }
    public static void main(String[] args) {
        Data_shadowing_solution1 d=new Data_shadowing_solution1();
        d.show(20);
    }
}
*/

// ==================== Solution1 ==================

/*

public class Data_shadowing_solution1 {
    int age=10;
    void show(int age,Data_shadowing_solution1 d){
        System.out.println(age);
        System.out.println(d.age);

    }
    public static void main(String[] args) {
        Data_shadowing_solution1 d=new Data_shadowing_solution1();
        d.show(20,d);
    }
}

*/

// ==================== Solution2 ==================

/*
public class Data_shadowing_solution1 {
    int age=10;
    static Data_shadowing_solution1 d;
    void show(int age){
        System.out.println(age);
        System.out.println(d.age);

    }
    public static void main(String[] args) {
        d=new Data_shadowing_solution1();
        d.show(20);
    }
}
*/

// ==================== Solution3 ==== 'this keyword' ==============


public class Data_shadowing_solution1 {
    int age=10;
    void show(){
        int age=20;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(this);// reference id is same 'this' and 'd'

    }
    public static void main(String[] args) {
        Data_shadowing_solution1 d=new Data_shadowing_solution1();
        System.out.println(d);
        d.show();
    }
}