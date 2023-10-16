import java.util.Random;
import java.util.Scanner;

/**
 * captcha
 */
public class captcha {
    public static String Mycaptcha() {
        Random random=new Random();
        int length = 7 + (Math.abs(random.nextInt()) % 3);
    
        StringBuffer captchaStringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int baseCharNumber = Math.abs(random.nextInt()) % 62;
            int charNumber = 0;
            if (baseCharNumber < 26) {
                charNumber = 65 + baseCharNumber;
            }
            else if (baseCharNumber < 52){
                charNumber = 97 + (baseCharNumber - 26);
            }
            else {
                charNumber = 48 + (baseCharNumber - 52);
            }
            captchaStringBuffer.append((char)charNumber);
        }
    
        return captchaStringBuffer.toString();
    }
    
    public static void main(String[] args) {
        String cap=Mycaptcha();
        System.out.println("Enter the captcha displayed on your screen :"+cap);
         
        Scanner s=new Scanner(System.in);
        String match=s.nextLine();
        System.out.println(match.equals(cap));
        if(match.equals(cap)){
            System.out.println("Successful loggedin....");
        }
        else{
            System.out.println("Login failure");
        }
    }
}