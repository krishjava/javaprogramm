import java.util.Scanner;
class linear_search{
   static int serach(int arr[],int y,int n){
        for(int i=0; i<n; i++){
            if(arr[i]==y){
                return i;
            }
        }
        return -1;
    }
    public static void main(String ad[]){
         
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size  of Arrray : ");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the "+(i+1)+" Element : ");
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the number which u want to search : ");
        int y =s.nextInt();
        int index=serach(arr,y,n);
        if(index==-1){
            System.out.println("Element not Found ...");
        }
        else{
            System.err.println("Element found at "+index+" Index"
            );
        }
    }
}