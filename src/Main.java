import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {-1,1,3,4,2,3,3,4,5,2,3,4,-1,1,3,4,4,2,5,4,0,-1,-10,3};
        countingSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void countingSort(int[] arr) {
        int leng = arr.length;
        int maxEl = arr[0];
        int minEl = arr[0];

        for (int i = 0; i < leng; i++) {
            if (arr[i] < minEl) {
                minEl = arr[i];
            }
            if (arr[i] > maxEl) {
                maxEl = arr[i];
            }
        }

        int[] tempArray = new int[maxEl - minEl + 1];
        for (int i = 0; i < leng; i++) {
            tempArray[arr[i] - minEl]++;
        }

        int currentIndex = 0;
        for (int i = 0; i < tempArray.length; i++)
        {
            for (int j = tempArray[i]; j > 0; j--)
            {
                arr[currentIndex] = i + minEl;
                currentIndex++;
            }
        }
    }
}