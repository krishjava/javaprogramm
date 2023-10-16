public class ass19 {

    public static void main(String[] args) {
      StringBuffer s=new StringBuffer("krishan");
      System.out.println(s.length());
      System.out.println(s.capacity());
      s.ensureCapacity(50);
      System.out.println(s.capacity());
      System.out.println(s.charAt(1));
      s.setCharAt(0,'d');
      System.out.println(s);
    //System.out.println();
      System.out.println(s.insert(1,"Hello"));
      System.out.println(s.reverse());
      System.out.println(s.delete(1, 3));
      s.deleteCharAt(0);
      System.out.println(s);
    }
}