
public class palindrome {
    public static void Palind(String name) {
        name = name.toLowerCase();
        String result = "";
        int len = name.length();
        System.out.printf("Given String is: %s", name);
        for (int i = len - 1; i >= 0; i--) {
            result = result + name.charAt(i);
        }
        if (name.contentEquals(result)) {
            System.out.println("\nIt is a Palindrome");
        } else {
            System.out.println("\nNot a Palindrome");
        }
    }

    public static void main(String[] args) {
        String name = "Eye";
        Palind(name);
    }
}