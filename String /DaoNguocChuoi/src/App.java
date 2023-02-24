import java.util.Scanner;

public class App {
    // Đề bài: Đảo ngược chuỗi
    public static void main(String[] args) {
        String chuoi = new String();
        System.out.println("Nhap vao mot chuoi");
        Scanner scanner = new Scanner(System.in);
        chuoi = scanner.nextLine();
        String newChuoi = "";
        for(int i = chuoi.length() - 1; i >= 0;i--)
        {
            newChuoi += chuoi.charAt(i);
        }
        System.out.println("Reversed string: " + newChuoi);
    }
}
