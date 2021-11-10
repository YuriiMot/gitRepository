import com.company.solvd.taxi_company.Main;
import org.apache.log4j.Logger;

class SelectionSort {

    protected static final Logger LOGGER = Logger.getLogger(SelectionSort.class);

    void sort(int arr[]) {  // Сортування масиву
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_id = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_id])
                    min_id = j;

            int temp = arr[min_id];
            arr[min_id] = arr[i];
            arr[i] = temp;
        }
    }

    void printArr(int arr[]) {   // Виведення масиву на екран
        int n = arr.length;
        LOGGER.info("Sorted array: ");
        for (int i = 0; i < n; ++i)
            LOGGER.info(arr[i] + " ");
        LOGGER.info("");
    }

    public static void main(String arg[]) {
        SelectionSort sort1 = new SelectionSort();
        int arr[] = {15, 8, 11, 25, 12};
        sort1.sort(arr);
        sort1.printArr(arr);
    }
}
