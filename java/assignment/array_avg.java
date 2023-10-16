import java.util.Scanner;

/**
 * array_avg
 */
public class array_avg {
    static float average(int arr[]){
        float sum=0;
        for(int i=0; i<arr.length;i++){
            sum=arr[i]+sum;
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Size of Array : ");
        Scanner s=new Scanner(System.in);
        int size =s.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the "+(i+1)+" Element : ");
            arr[i]=s.nextInt();
        }
        System.out.println("Average = "+average(arr));

    }
}