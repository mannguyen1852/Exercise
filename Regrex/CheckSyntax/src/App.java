import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Viết gì đó đi để kiểm tra xem phải In hoa không");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z]");
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) {
            System.out.println("Chữ đầu là In hoa");
          }
          else {
            System.out.println("Chữ đầu không phải là In hoa");
          }
    }
}
