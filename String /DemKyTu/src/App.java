import java.util.Scanner;

public class App {
  // Đề bài: Nhập một sâu ký tự. Viết chương trình đếm số từ trong một chuỗi trong Java. Mỗi từ cách nhau bởi một khoảng trắng (tab, space, ...) Ví dụ ” hoc java co ban den nang cao ” có 7 từ.
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String str = input.nextLine();
      System.out.print("Số từ của chuỗi đã cho là: " + countWords(str));
    }
  
    public static int countWords(String input) {
      if (input == null) {
        return - 1;
      }
      int count = 0;
      int size = input.length();
      boolean notCounted = true;
      for (int i = 0; i < size; i++) {
        if (input.charAt(i) != SPACE && input.charAt(i) != TAB && input.charAt(i) != BREAK_LINE) {
          if (notCounted) {
            count++;
            notCounted = false;
          }
        } else {
          notCounted = true;
        }
      }
      return count;
    }
}
