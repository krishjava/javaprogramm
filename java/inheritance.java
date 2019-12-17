import java.Math.*;
import java.util.Scanner;
class cordinates{
    int a,b;
    static int count=0;
    public cordinates input(){
        count++;
        System.out.println("Enter the "+count+" cordinates :");
        Scanner s= new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        return this;
    }
}
class distance extends cordinates{
    double [] dis= new double[3];
    float h,b;
    distance init(){
        System.out.println("Enter the height & base of triangle :");
        Scanner s = new Scanner(System.in);
        h = s.nextFloat();
        b = s.nextFloat();
        return this;
    }
    double[] find_dis(){
        cordinates crd = new distance();
        cordinates crd1 = new distance();
        cordinates crd2 = new distance();
        crd = crd.input();
        crd1 = crd1.input();
        crd2 = crd2.input();
        System.out.println("Cordinates :"+crd.a);
        System.out.println("Cordinates :"+crd.b);
        System.out.println("Cordinates :"+crd1.a);
        System.out.println("Cordinates :"+crd1.b);
        System.out.println("Cordinates :"+crd2.a);
        System.out.println("Cordinates :"+crd2.b);    
        dis[0] = ((crd1.a-crd.a)*(crd1.a-crd.a)+(crd1.b-crd.b)*(crd1.b-crd.b));
        dis[1] = ((crd2.a-crd.a)*(crd2.a-crd.a)+(crd2.b-crd.b)*(crd2.b-crd.b));
        dis[2] = ((crd1.a-crd2.a)*(crd1.a-crd2.a)+(crd1.b-crd2.b)*(crd1.b-crd2.b));
        return dis;
    }
}
class triangle extends distance{
    double[]dst = new double[3];
    void area(){
        distance d = new triangle();
        double dst[] = d.find_dis();
        System.out.println("Distance1 = "+dst[0]);
        System.out.println("Distance2 ="+dst[1]);
        System.out.println("Distance3 = "+dst[2]);
        if(dst[0] > dst[1] && dst[0]> dst[2]){
            if(dst[0]== (dst[1]+dst[2]))
                System.out.println("Triangle is Right angle :");
            else
                System.out.println("This is not triangle");
        }
        else if(dst[1] > dst[0] && dst[1] > dst[2]){
            if(dst[2] == (dst[1]+dst[0])){
                System.out.println("Triangle is Rigth Angle:");
            }
            else{
                System.out.println("This is not Triangle:");
            }
        }
        else if(dst[0]== dst[1] || dst[1]== dst[2] || dst[2]==dst[0]){
            System.out.println("This is not Triangle :");
        }
    }
}
class area extends distance{
    void tri_area(){
        distance ds = new area();
        ds = ds.init();
        System.out.println("Area Of Triangle = "+((ds.h*ds.b)/2));
    }
}
public class inheritance {

    public static void main(String[] args) {
        triangle t = new triangle();
        t.area();
        area a= new area();
        a.tri_area();;
    }
}