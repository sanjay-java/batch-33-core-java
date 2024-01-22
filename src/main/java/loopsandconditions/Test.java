package loopsandconditions;

public class Test {
    public static void moveZeros(int[] numbers) {
        int nonZeroIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {

                int temp = numbers[i];
                numbers[i] = numbers[nonZeroIndex];
                numbers[nonZeroIndex] = temp;

                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {0,23,0,85,45,0,19};

        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        moveZeros(numbers);

        System.out.println("\nArray after moving zeros to the end:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
