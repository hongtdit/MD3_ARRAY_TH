import java.util.Scanner;

public class DEM_KYTU {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String line = sc.nextLine();
        System.out.println("Chuỗi bạn vừa nhập là: " + line);
        String x;
        do {
            System.out.println("Nhập vào ký tự bạn muốn tìm: ");
            x = sc.nextLine();
            if (x.length() > 1)
                System.out.println("Vui lòng nhập 1 ký tự.");
        } while (x.length() > 1);
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == x.charAt(0)) {
                count += 1;
            }
        }
        System.out.println("Tổng số lần ký tự xuất hiện trong chuỗi trên là: " + count + " lần.");
    }
}
