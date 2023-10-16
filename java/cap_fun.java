import java.util.Random;

/**
 * cap_fun
 */
public class cap_fun {
     // public static String Mycaptcha() {
    //     Random random=new Random();
    //     int length = 7 + (Math.abs(random.nextInt()) % 3);
    
    //     StringBuffer captchaStringBuffer = new StringBuffer();
    //     for (int i = 0; i < length; i++) {
    //         int baseCharNumber = Math.abs(random.nextInt()) % 62;
    //         int charNumber = 0;
    //         if (baseCharNumber < 26) {
    //             charNumber = 65 + baseCharNumber;
    //         }
    //         else if (baseCharNumber < 52){
    //             charNumber = 97 + (baseCharNumber - 26);
    //         }
    //         else {
    //             charNumber = 48 + (baseCharNumber - 52);
    //         }
    //         captchaStringBuffer.append((char)charNumber);
    //     }
    
    //     return captchaStringBuffer.toString();
    // }
    public static void main(String[] args) {
        StringBuffer b=new StringBuffer("NJ");
        System.out.println(b.append((char)112));

        // Random random=new Random();
        // int length = 7 + (Math.abs(random.nextInt()) % 3);
        // System.out.println("length="+length);
        // StringBuffer captchaStringBuffer = new StringBuffer();
        // for (int i = 0; i < length; i++) {
        //     int baseCharNumber = Math.abs(random.nextInt()) % 62;
        //     System.out.println(" i = "+i+" baseCharNumber = "+baseCharNumber);
        //     int charNumber = 0;
        //     if (baseCharNumber < 26) {
        //         charNumber = 65 + baseCharNumber;
        //     System.out.println(" i = "+i+" charNUmber = I = "+charNumber);
        //     }
            
        //     else if (baseCharNumber < 52){
        //         charNumber = 97 + (baseCharNumber - 26);
        //         System.out.println(" i = "+i+" charNUmber = II = "+charNumber);
        //     }
        //     else {
        //         charNumber = 48 + (baseCharNumber - 52);
        //         System.out.println(" i = "+i+" charNUmber = III = "+charNumber);
        //     }
        //     System.out.println("Final = "+charNumber);
        //     System.out.println(captchaStringBuffer.append((char)charNumber));
        // }
    }
}