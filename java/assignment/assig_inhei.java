import java.util.Scanner;
class radius{
    int r;
    radius(){
        System.out.println("Enter the Radius : ");
        Scanner s=new Scanner(System.in);
        r=s.nextInt();
    }
}
class cir_area extends radius{
    double area(){
        double a=3.14*r*r;
        System.out.println("Area of Circle = "+a);
        return a;
    }
}
class cir_cir extends radius{
    
    void cir(){
        double c=2*3.14*r;
        System.out.println("Perimeter = "+c);
    }
}
class sec_cir extends cir_area{
    double ar=this.area();
    double sector;
    void sec(){
        System.out.println("Enter the angle : ");
        Scanner s=new Scanner(System.in);
        double an=s.nextFloat();

        sector =(an/360.00000000)*ar;
        System.out.println("Sector of circle : "+sector);
    }
}
public class assig_inhei {

    public static void main(String[] args) {
        sec_cir s=new sec_cir();
        s.sec();
        cir_cir c=new cir_cir();
        c.cir();
        System.out.println();

    }
}