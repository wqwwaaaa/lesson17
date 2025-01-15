import zad3.FindRepeats;

public class Main {
    public static void main(String[] args) {
        FindRepeats findRepeats = new FindRepeats();
        String text = "abc abc def abc ghi abc";
        String substring = "abc";
        int result = findRepeats.numberOfRepeats(text, substring);
        System.out.println("Количество вхождений: " + result); // Вывод: Количество вхождений: 4

    }
}