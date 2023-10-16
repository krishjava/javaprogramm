public class Data_shadowing {
    String name;
    int age;
    Data_shadowing(String name,int age){
        name=name;
        age=age;
        // But local variable is print
            //System.out.println(name);
            //System.out.println(age);
    }
    void show(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        Data_shadowing d=new Data_shadowing("krishan",20);
        d.show();
    }
}