import java.util.Scanner;

public class MIN_OF_ARRAY {
    public static void main(String[] args) {
        int d,c,min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng:");
        d= sc.nextInt();
        System.out.println("Nhập vào số cột:");
        c = sc.nextInt();

        int [][] arr = new int[d][c];

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Nhập phần tử thứ ["+i+","+j+"]:");
                arr[i][j] = sc.nextInt();
            }
        }

        min = arr[0][0];
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j]<min) {
                    min=arr[i][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Giá trị nhỏ nhất của mảng là:"+min);
    }
}
