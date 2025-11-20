public class Main {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Print the elements of the array using a loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Example of modifying an array element
        numbers[2] = 35; // Change the value at index 2 (originally 30)
        System.out.println("\nModified array:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Example of finding the sum of all elements in the array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of array elements: " + sum);
    }
}
