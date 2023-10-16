public class final_array {
    public static void main(String[] args) {
        final int []a={1,2,3};
        int a1[]={};
        a=a1;
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]*10);
        }
    }
}