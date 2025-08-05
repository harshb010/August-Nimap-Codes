import java.util.Scanner;

public class StringDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        String[] words = extractWords(input);

        boolean[] checked = new boolean[words.length];

        System.out.println("Duplicate words and their counts:");
        for(int i = 0; i < words.length; i++) {
            if (words[i].isEmpty() || checked[i]) continue;
            int count = 1;
            for(int j = i + 1; j < words.length; j++) {
                if(words[i].equals(words[j])){
                    count++;
                    checked[j] = true;
                }
            }
            if(count > 1){
                System.out.println(words[i] + ": " + count);
            }
        }
    }

    public static String[] extractWords(String sentence) {
        char[] chars = sentence.toCharArray();
        StringBuilder word = new StringBuilder();
        String[] tempWords = new String[chars.length];
        int wordCount = 0;

        for (char c : chars) {
            if (Character.isLetter(c)) {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    tempWords[wordCount++] = word.toString();
                    word.setLength(0);
                }
            }
        }

        if (word.length() > 0) {
            tempWords[wordCount++] = word.toString();
        }

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = tempWords[i];
        }
        return words;
    }
}
