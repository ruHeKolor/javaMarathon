import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DZ_3_3_BinarySearch {
    public DZ_3_3_BinarySearch(int[] sortedIntArray, int searchingNumber, int i, int i1) {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите заранее отсортированный массив: ");
        String[] inputStringArray = reader.readLine().split(" ");
        int[] sortedIntArray = Arrays.stream(inputStringArray).mapToInt(Integer::parseInt).toArray();
        System.out.print("Введите искомое число: ");
        int searchingNumber = Integer.parseInt(reader.readLine());

        int index = -1;
        int low = 0;
        int high = sortedIntArray.length - 1;
        int valueToFind = searchingNumber;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (sortedIntArray[mid] < valueToFind) {
                    low = mid + 1;
                } else if (sortedIntArray[mid] > valueToFind) {
                    high = mid - 1;
                } else if (sortedIntArray[mid] == valueToFind) {
                    index = mid;
                    break;
                }
            }
            if (index >= 0) {
                System.out.println("Индекс искомого элемента массива: " + index);
            }
            else {
                System.out.println("Искомый элемент не обнаружен");
                System.exit(0);
            }
    }
}
