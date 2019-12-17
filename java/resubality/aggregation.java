class Emp{
    String name;
    int id,age;
    Sal s; // Aggregation
    Emp(String name,int id,int age){
        s = new Sal(100,120, 1200);
        //  --------This Part----------
        //  Composition          
        this.name= name;
        this.id= id;
        this.age=age;
    }
    void show(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Id = "+id);
        System.out.println("Salary = "+s.da+" "+s.ta+" "+s.hra);
    }
    public static void main(String[] args) {
        Emp e = new Emp("krishan", 4, 20);
        e.show();
    }
}
class Sal{
    int ta,da,hra;
    Sal(int da,int ta,int hra){
        this.da=da;
        this.hra=hra;
        this.ta=ta;
    }
}