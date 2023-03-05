import java.util.Scanner;

public class MAX_OF_ARRAY {
    public static void main(String[] args) {
        int d,c,max=0;
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

        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j]>max) {
                    max=arr[i][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Giá trị lớn nhất của mảng là:"+max);

    }
}
