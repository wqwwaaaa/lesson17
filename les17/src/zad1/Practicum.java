package zad1;

public class Practicum {
    public static void main(String[] args) {

        String start = "привет! меня зовут ";

        StringBuilder hello = new StringBuilder(); // создайте StringBuilder с началом start
        hello.append("ангелина"); // добавьте подстроку "<ваше имя>"
        hello.append(". я из города ");// добавьте подстроку ". Я из города "
        hello.append("дедовск"); // добавьте подстроку "<ваш город>."



        String asString = start + hello.toString();
        System.out.println(asString);
    }
}