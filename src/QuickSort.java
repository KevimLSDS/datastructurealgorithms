public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2) {
            return;
        }

        int pivotIndex = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pivotIndex);
        quickSort(input, pivotIndex + 1, endIndex);

    }

    private static int partition(int[] input, int startIndex, int endIndex) {
        int pivot = input[startIndex];
        int i = startIndex;
        int j = endIndex;

        while (i < j) {

            /*
             * NOTE: Empty body while loop
             * Will loop until it finds input[j] that are greater than or equal to the pivot,
             * then it breaks
             */
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            /*
             * NOTE: Empty body while loop
             * Will loop until it finds input[i] that are less than or equal to the pivot,
             * then it breaks
             */
            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;

        return j;
    }
}
