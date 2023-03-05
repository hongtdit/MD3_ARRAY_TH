import java.util.Scanner;

public class Xoa_Phan_Tu {
    public static void main(String[] args) {
        int size;
        int arr[];
        int arr1[];
        int x;
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Độ dài yêu cầu nhỏ hơn 20!");
        } while (size > 20);
        arr = new int[size];
        arr1 = new int[size - 1 ];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Các phần tử trong mảng:", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println("Nhập phần tử cần xóa:");
        x = sc.nextInt();

        for (int j = 0; j < arr1.length; j++) {
            if (arr[j] == x) {
                check = true;
                System.out.println("Giá trị " + x + " có trong mảng ở vị trí thứ:" + j);
            }
           if (check) {
               arr1[j]=arr[j+1];
           } else {
               arr1[j]=arr[j];
           }
        }
        if (!check)
            System.out.println("Giá trị không có trong mảng");

        System.out.printf("%-20s%s", "Các phần tử trong mảng:", "");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + "\t");
        }

    }
}
