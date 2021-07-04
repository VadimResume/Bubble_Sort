import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] array = {12, 4, 9, 0, 32, -12, 22};

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i;  j--) {
                if (array[j] < array[j - 1]){
                    int x = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
