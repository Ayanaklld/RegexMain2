import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask1 {
    public static void main(String[] args) {
        String text = "a 78 3 11 b c 15 9 z z";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        int sum = 0;

        while(matcher.find()){
            int number = Integer.parseInt(matcher.group());
            sum += number;
        }

        System.out.println("Sum of numbers in the string: " + sum);



        String text1 = "a 78 3 z 11 7 b z d s 15 22 m n z 22 34 8 l 2 z 5";

        Pattern pattern1 = Pattern.compile("z (\\d+)");
        Matcher matcher1 = pattern1.matcher(text1);
        int sum1 = 0;

        while (matcher1.find()) {
            int number = Integer.parseInt(matcher1.group(1));
            sum1 += number;
        }

        System.out.println("Sum of numbers after 'z' occurrences: " + sum1);

    }
}
