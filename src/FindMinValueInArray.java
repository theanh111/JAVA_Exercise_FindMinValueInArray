public class FindMinValueInArray {
    public static void main(String[] args) {
        int[] array = {8, 5, 7, 6, -12, 55, 1, 6, 464};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min = " + min);
    }
}
