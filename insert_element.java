import java.util.Arrays;
import java.util.Scanner;

public class Chen_Phan_Tu {
    public static void main(String[] args) {
        int size;
        int arr[];
        int tempArr[];
        int ind;
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
        tempArr = new int[size+1];
        int i = 0;
        while (i < arr.length ) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.println("Nhập giá trị phần tử cần thay thế:");
        x = sc.nextInt();
        System.out.println("Nhập vị trí phần tử cần thay thế:");
        ind = sc.nextInt();

        for (int j = 0; j < tempArr.length ; j++) {
            if (j + 1 == ind) {
                check = true;
                tempArr[j]=x;
                continue;
            }
            if (check) {
                tempArr[j]=arr[j-1];
            } else {
                tempArr[j]=arr[j];
            }

        }

        System.out.printf("%-20s%s", "Các phần tử trong mảng:", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        String str= Arrays.toString(tempArr);
        System.out.println(str);
    }
}
