package pragya;

public class ReverseVowels {

    public static String reverseVowels(String input) {
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowel = "aeiouAEIOU";

        while (left < right) {
            while (left < right && vowel.indexOf(chars[left]) == -1) {
                left++;
            }
            while (left < right && vowel.indexOf(chars[right]) == -1) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
//this is a codde for reverese vowel string
    public static void main(String[] args) {
        String input = "testproduct";
        String result = reverseVowels(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed Vowels: " + result);
    }
}