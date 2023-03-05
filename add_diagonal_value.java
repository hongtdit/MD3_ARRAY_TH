import java.util.Scanner;

public class CONG_GIA_TRI_DUONGCHEO {
    public static void main(String[] args) {
        int d

                , sum1 = 0,sum2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng và cột ma trận vuông:");
        d = sc.nextInt();
        int[][] arr = new int[d][d];

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "," + j + "]:");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
//        do {
//            System.out.println("Nhập vào cột cần cộng:");
//            x = sc.nextInt();
//            if (x > arr[0].length) {
//                System.out.println("Vượt quá số cột của mảng");
//            }
//        } while ( x > arr[0].length);

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                if (j == i) {
                    sum1 += arr[i][j];
                }
                if (j == arr.length -1 -i) {
                    sum2 += arr[i][j];
                }
            }
        }

        System.out.println("Tổng giá trị đường chéo thứ 1 là:" +sum1);
        System.out.println("Tổng giá trị đường chéo thứ 2 là:" +sum2);

    }
}
