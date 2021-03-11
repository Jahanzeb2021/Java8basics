package Class15;

public class SplitMethod {
    public static void main(String[] args) {
        String name="Burju*Maria*Qasim";
        String [] array = name.split("[^A-Z a-z]");
        for (String name1: array) {
            System.out.println(name1);
        }
    }
}
