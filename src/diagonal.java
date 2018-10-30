import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                arr[i][j] = (int) Math.floor(Math.random()*10);
            }
        }
        System.out.println("list index in array: ");
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sumOne = 0;
        int a = 0;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < i + 1; j++){
                a = j;
            }
            sumOne = sumOne + arr[i][a];
        }

        int sumTwo = 0;
        int b = 0;
        for (int i = size; i > 0 ; i--){
            int c = size - i;
            for (int j = 0 ; j < i; j++){
                b = j;
            }
            sumTwo = sumTwo + arr[c][b];
        }

        System.out.println("Sum two of diagonal line: " + (sumTwo + sumOne));
    }
}
