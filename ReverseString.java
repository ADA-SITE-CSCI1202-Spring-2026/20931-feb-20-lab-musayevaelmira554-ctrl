public class Main {

    public static String reverseString(String input) {

        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        if (args.length > 0) {
            String original = args[0];
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reverseString(original));
        } else {
            String original = "Hello";
            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reverseString(original));
        }
    }
}
