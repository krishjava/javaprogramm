/**
 * constructor_chain
 */
public class constructor_chain {
    constructor_chain(){
        this(4);
        System.out.println("default cons..");
        
    }
    constructor_chain(int x)
    {
        this(46,5);
        System.out.println(x);
    }
    constructor_chain(int x,int y){
        System.err.println(x);
        System.err.println(y);
    }
    public static void main(String[] args) {
        constructor_chain c = new constructor_chain();
    }
}