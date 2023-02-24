import java.util.Scanner;

public class App {
    // Đề bài: Tìm vị trí của một từ trong mảng nhập từ bàn phím
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhạp vao 1 chuoi");
        String str = input.nextLine();
        System.out.println("Nhạp vao 1 tu can tim");
        String word = input.nextLine();
        System.out.println("tu can tim o vi tri:" + searchWord(str, word));
    }
    public static int searchWord(String str, String word) {
        int lenStr = str.length();
        int lenWord = word.length();
        for (int i = 0; i <= lenStr - lenWord; i++) {
            int j;
            for (j = 0; j < lenWord; j++) {
                if (str.charAt(i + j) != word.charAt(j)) {
                    break;
                }
            }
            if (j == lenWord) {
                return i;
            }
        }
        return -1;
    }
    
}
