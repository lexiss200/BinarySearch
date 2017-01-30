import java.io.*;
import java.lang.*;

/**
 * Created by Krol on 26.01.2017.
 */
import java.util.*;

    public class BinarySearch {

        public Objects[] array;

        public BinarySearch(Objects[] array) {
            this.array = array;
        }

        // алгоритм поиска
        public int find(Objects x) {
            int i = -1;
            if (this.array != null) {   // проверяем массив на наличие в нём элементов
                int left = 0, right = this.array.length, mid;
                while (left < right) {
                    mid = left + (right - left) / 2;  // вычисляем индекс среднего элемента
                    if (x == this.array[mid]) {
                        i = mid;
                        break;
                    } else {
                        if (x.compareTo(this.array[mid]) == -1) {
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