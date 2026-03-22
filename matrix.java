import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int sum = 0;
        int avg = 0;
        int min;
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int result[][] = new int[3][col];

        for (int j = 0; j < col; j++) {
            min = arr[0][j];
            sum = 0;
            avg = 0;
            for (int i = 0; i < row; i++) {
                sum += arr[i][j];
                min = Math.min(min, arr[i][j]);
                avg += arr[i][j];
            }
            result[0][j] = sum;
            result[1][j] = avg / row;
            result[2][j] = min;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < col; i++) {
                System.out.print(result[j][i] + " ");
            }
            System.out.println();
        }

    }
}
