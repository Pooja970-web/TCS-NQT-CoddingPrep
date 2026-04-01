import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            int count = 1;

            if(str.charAt(i) == '*') continue;

            for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                    str = str.substring(0,j) + '*' + str.substring(j+1);
                }
            }

            System.out.println(str.charAt(i) + " -> " + count);
        }
    }
}