import java.util.Scanner;

public class CONG_GIA_TRI_1COT {
    public static void main(String[] args) {
        int d, c,x, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng:");
        d = sc.nextInt();
        System.out.println("Nhập vào số cột:");
        c = sc.nextInt();

        int[][] arr = new int[d][c];

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "," + j + "]:");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        do {
            System.out.println("Nhập vào cột cần cộng:");
             x = sc.nextInt();
            if (x > arr[0].length) {
                System.out.println("Vượt quá số cột của mảng");
            }
        } while ( x > arr[0].length);

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                if (j == x-1) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("Tổng các giá trị tại cột "+x+" là:" +sum);

    }
}
