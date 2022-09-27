public class CountingSort {

    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);

        for (int number : intArray) {
            System.out.println(number);
        }
    }

    public static void countingSort(int[] input, int minValue, int maxValue) {
        int[] countArray = new int[(maxValue - minValue) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - minValue]++;
        }

        int j = 0;
        for (int i = minValue; i <= maxValue; i++) {
            while (countArray[i - minValue] > 0) {
                input[j++] = i;
                countArray[i - minValue]--;
            }
        }
    }
}
