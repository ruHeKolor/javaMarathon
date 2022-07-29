import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ_3_2_BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов массива: ");
        String numb = reader.readLine();
        int numberOfElements = Integer.parseInt(numb);

        System.out.println("Введите " + numberOfElements + " чисел для заполнения массива: ");
        int[] mas = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++){
            String elem = reader.readLine();
            mas[i] = Integer.parseInt(elem);
        }
        reader.close();

        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas.length - 1; j++){
                if (mas[j] > mas[j + 1]){
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }
        System.out.print("Отсортированный по возрастанию массив:");
        for (int x : mas){
            System.out.print(" " + x);
        }
    }
}
