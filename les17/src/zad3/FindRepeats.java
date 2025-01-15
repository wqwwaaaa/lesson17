package zad3;

public class FindRepeats {
    public int numberOfRepeats(String text, String substring) {
        StringBuilder sb = new StringBuilder(text);
        int count = 0;
        int index = 0;
        while ((index = sb.indexOf(substring) ) != -1) {
            count++;
            sb.delete(0, index + substring.length());
        }
        return count;
    }
}
