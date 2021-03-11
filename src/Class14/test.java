package Class14;

public class test {
    public static void main(String args[]) {
        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

        System.out.print(replace);

    }
}