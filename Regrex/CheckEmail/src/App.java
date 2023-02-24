import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        String regex = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}[a-zA-Z]+mail.com$";
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập một Email");
        String email = input.nextLine();
        if(Pattern.matches(regex, email) == true){
            System.out.println("định dạng chính xác!");
        }
        else{
            System.out.println("Sai định dạng Email");
        }
    }
}
