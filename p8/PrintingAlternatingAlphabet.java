public class PrintingAlternatingAlphabet {
    public static void main(String[] args) {
        String[] alphabets = new String[26];

        for (int i = 0; i < 26; i++) {
            alphabets[i] = String.valueOf((char) ('a' + i));
        }

        int j = 25; 
        for (int i = 0; i < 26 && j >= 0; i++, j--) {
            if (i == j) {
                System.out.print(alphabets[i] + " ");
            }
            else{
                System.out.print(alphabets[i]+ " ");
                System.out.print(alphabets[j] + " ");
            }
        }
    }
}
