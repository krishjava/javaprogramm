import java.util.ArrayList;
import java.util.LinkedList;

/**
 * compersion
 */
public class compersion {

    public static void main(String[] args) {
        ArrayList a= new ArrayList();
        LinkedList l= new LinkedList();
        long st=System.nanoTime();
        for(int i=1; i<=100000; i++){
             a.add(i);
        }
        long end=System.nanoTime();
        System.out.println("Time in Insertion (ArrayList) = "+(end-st)+" Nano Second");
        System.out.println();

        long st1=System.nanoTime();
        for(int i=1; i<=100000; i++){
             l.add(i);
        }
        long end1=System.nanoTime();
        System.out.println("Time in Insertion (LinkedList) = "+(end1-st1)+" Nano Second");
        System.out.println();

        System.out.println("Fatching....................");
        long st11=System.nanoTime();
        for(int i=1; i<100000; i++){
            a.get(i);
       }

        long end11=System.nanoTime();
        System.out.println("Time in Fatching (ArrayList) = "+(end11-st11)+" Nano Second");
        System.out.println();

        long st22=System.nanoTime();
        for(int i=1; i<100000; i++){
             l.get(i);
        }
        long end22=System.nanoTime();
        System.out.println("Time in Fatching (LinkedList) = "+(end22-st22)+" Nano Second");
    }
}