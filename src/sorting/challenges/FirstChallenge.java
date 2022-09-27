package sorting.challenges;

public class FirstChallenge {

    /*
     * Do a merge sort in descending order
     */

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for (int number : intArray) {
            System.out.println(number);
        }

    }

    public static void mergeSort(int[] input, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2) {
            return;
        }

        int midIndex = (startIndex + endIndex) / 2;

        mergeSort(input, startIndex, midIndex);
        mergeSort(input, midIndex, endIndex);
        merge(input, startIndex, midIndex, endIndex);


    }

    private static void merge(int[] input, int startIndex, int midIndex, int endIndex) {
        if (input[midIndex - 1] >= input[midIndex]) {
            return;
        }

        int i = startIndex;
        int j = midIndex;
        int tempIndex = 0;

        int[] temp = new int[endIndex - startIndex];

        while (i < midIndex && j < endIndex) {
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, startIndex + tempIndex, midIndex - i);
        System.arraycopy(temp, 0, input, startIndex, tempIndex);

    }
}
