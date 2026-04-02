import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find the frequency of characters:");
        String str = sc.nextLine();
        int count;
        for(int i = 0; i < str.length(); i++){
            count = 0;
            for(int j =1; j <str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }

            System.out.println("Frequency of " + str.charAt(i) + " is: " + count);
        }
    }
}