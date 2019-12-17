/**
 * init_block
 */
class Employee{
    String name;
    int age;
    Employee(int a,String n){
        name= n;
        age = a;
    }
    Address ar;
    {
     ar = new Address();
    }
    void show(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Address = "+ar.city+" "+ar.state+" "+ar.country);
    }
}
class Address{
    String city,country,state;
    {
        city="jaipur";
        state="Rajasthan";
        country= "India";
    }
}
public class init_block {

    public static void main(String[] args) {
     Employee e = new Employee(23,"krishan");  
     e.show(); 
    }
}