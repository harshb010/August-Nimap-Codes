public class charFreq {
    public static void main(String[] args) {
        String str = "engineering";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0 && i != ' ') {
                System.out.print((char) i +""+ freq[i]);
            }
        }
    }
}
