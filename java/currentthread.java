import java.lang.*;
public class currentthread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread:"+t);
        t.setName("name");
        System.out.println("Current Thread:"+t);
        t.setPriority(8);
        System.out.println("Current Thread:"+t);
        try{
            for(int i=0; i<6; i++){
                Thread.sleep(200);
                System.out.println("Sleep"+i);
            }
        }catch(Exception e){
            System.out.println("Exception in Current Thread:"+e);
        }
    }
    
}