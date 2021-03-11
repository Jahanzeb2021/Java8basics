package Class15;

public class ReplaceAll {
    public static void main(String[] args) {
        String mix="43566787Hello 89  World3545 *&***##&";
        System.out.println(mix.replaceAll("[0-9]","--"));
        System.out.println("------------------------------------------");
        System.out.println(mix.replaceAll("[a-z]","--small--"));
        System.out.println("-------------------------------------------");
        System.out.println(mix.replaceAll("[a-z A-Z]",""));
        System.out.println("-----------------------------------------------");
        System.out.println(mix.replaceAll("[A-Za-z0-9]",""));
        System.out.println("-------------------------------------------------");
        System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));
        System.out.println("---------End of Code----------");
    }
}

