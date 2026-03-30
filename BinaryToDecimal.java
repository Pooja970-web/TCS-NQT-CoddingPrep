import java.util.*;
/*1×2³ + 0×2² + 1×2¹ + 0×2⁰  
= 8 + 0 + 2 + 0 = 10 */
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binary = sc.nextInt();
        int decimal = 0, base = 1;

        while(binary > 0){
            int lastDigit = binary % 10;
            decimal += lastDigit * base;
            base *= 2;
            binary /= 10;
        }

        System.out.println(decimal);
    }
}