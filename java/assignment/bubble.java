import java.util.Scanner;

/**
 * bubble
 */
public class bubble {

    public static void main(String[] args) {
        System.out.println("Enter the size of Array : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" Element : ");
            a[i]=s.nextInt();
        }
        for(int i=0; i<n-1; i++){
            int flag=0;
            for(int j=0; j<n-1-i; j++){
                if(a[j]>a[j+1]){
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
                break;
        }
        System.out.println("Sorted Array is ");
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}