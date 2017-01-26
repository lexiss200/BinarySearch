/**
 * Created by KroL on 26.01.2017.
 */
public class First {
    public static void main(String[] args) {
        int s;
        BinarySearch array = new BinarySearch(new int[]{-16, -9, -5, 0, 3, 7, 12, 18, 20, 24, 30, 32, 38, 47, 50});
        s = array.find(-5);
        System.out.print(s);
    }
}
