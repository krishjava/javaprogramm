public class final_ref {
    int p=20;
    public static void main(String[] args) {
        final final_ref f=new final_ref();
        final_ref f1=new final_ref();
        // f=f1;
        System.out.println(f.p);
        f.p=40;
        System.out.println(f1.p);
    }
}