package SS03_Mang_va_phuong_thuc_trong_Java.Thuc_hanh;

import java.util.Scanner;

public class Tim_max_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        while (size <= 0) {
            System.out.print("Nhập sai, xin nhập lại kích thước của mảng: ");
            size = scanner.nextInt();
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: " + max);
    }
}
