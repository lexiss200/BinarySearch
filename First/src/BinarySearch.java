import java.io.*;
import java.lang.*;

/**
 * Created by Krol on 26.01.2017.
 */
import java.util.*;

public class BinarySearch {

    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    // алгоритм поиска
    public int find(int x) {
        int i = -1;
        if (this.array != null) {   // проверяем массив на наличие в нём элементов
            int left = 0, right = this.array.length, mid;
            while (left < right) {
                mid = left + (right - left)/2;  // вычисляем индекс среднего элемента
                if (x == this.array[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < this.array[mid]) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
            }
        }
        return i;
    }
}