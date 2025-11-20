public class Main {
    public static void main(String[] args) {
        try {
            int x = 10 / 0; // Error: division by zero
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
