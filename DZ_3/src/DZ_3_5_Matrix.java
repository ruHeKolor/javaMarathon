import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DZ_3_5_Matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите размерность матрицы: ");
        int inputNum = Integer.parseInt(reader.readLine());
        reader.close();
        int[][] matrix = new int[inputNum][inputNum];
        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int dirChanges = 0;
        int visits = inputNum;

        for (int i = 0; i < inputNum * inputNum; i++) {
            matrix[row][col] = i + 1;
            if (--visits == 0) {
                visits = inputNum * (dirChanges % 2) +
                        inputNum * ((dirChanges + 1) % 2) -
                        (dirChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;
            }
            col += dx;
            row += dy;
        }

        for (int i = 0; i < inputNum; i++) {
            for (int j = 0; j < inputNum; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }
}
