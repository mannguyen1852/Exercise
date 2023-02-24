import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        String regex = "^0{1}[1-9]{1}[0-9]{8}$";
        System.out.print("Nhập vào số điện thoại");
        Scanner input = new Scanner(System.in);
        String sdt = input.nextLine();
        if(Pattern.matches(regex, sdt) == true)
        {
            System.out.print("đã đúng định dạng");
        }
        else
        {
            System.out.print("sai định dạng");
        }
    }
}
