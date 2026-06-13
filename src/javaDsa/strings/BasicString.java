package javaDsa.strings;

public class BasicString {
    public static void main(String[] args) {
        String str = "Hello World";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        System.out.println("Length of string : " + count);

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed string : " + reversed);

        if (str.equals(reversed)) {
            System.out.println("Palindrome+ ");
        } else {
            System.out.println("Not a Palindrome ");
        }
    }
}
