import jdk.jshell.Diag;

/**
 * emp
 */
public class emp {
    String name,cmpname;
    int age,id;
    emp(String name,String cmpnam,int age,int id){
        this.name=name;
        this.cmpname=cmpnam;
        this.age=age;
        this.id=id;
    }
    void show(){
        System.out.println(name);
        System.out.println(cmpname);
        System.out.println(id);
        System.out.println(age);
    }
    public String toString(){
        return name+" "+cmpname+" "+id+" "+age;
    }
}