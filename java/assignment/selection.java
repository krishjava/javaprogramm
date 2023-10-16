/**
 * selection
 */
import java.util.Scanner;
public class selection {
    static int MIN(int a[],int k,int size){
        int index,i,min;
        min=a[k];
        index=k;
        for(i=k+1; i<size; i++){
            if(min>a[i]){
                min=a[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of Array : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" Element : ");
            a[i]=s.nextInt();
        }
        int index,temp;
        for(int k=0; k<n-2; k++){
            index=MIN(a,k,n);
            temp=a[k];
            a[k]=a[index];
            a[index]=temp;
        }
        for(int k=0; k<n; k++){
            System.out.println(a[k]);
        }
    }
    
    
}