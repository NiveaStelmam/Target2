package questoes;

public class Fibonacci {
    public static void main(String[] args) {
        int numberTest = 7;
        if (isInFibonacciSequence(numberTest)) {
            System.out.println(numberTest + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numberTest + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isInFibonacciSequence(int num) {
        int a = 0, b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == num;
    }
}
