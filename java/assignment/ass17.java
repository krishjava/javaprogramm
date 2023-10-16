import java.util.Scanner;

/**
 * ass17
 */
public class ass17 {
    static float perimeter(float r,float pi){
        return 2*pi*r;
    }
    static float area(float r,float pi){
        return pi*r*r;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Redius of  Circle : ");
        Scanner s=new Scanner(System.in);
        float r=s.nextFloat();
        System.out.println("Perimeter = "+perimeter(r,3.14f));
        System.out.println("Area = "+area(r,3.14f));
    }
}