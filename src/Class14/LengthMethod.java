package Class14;

public class LengthMethod {
    public static void main(String[] args) {
        String name="Qasim";
        System.out.println(name.length());
        name="";
        System.out.println(name.length());
        name="Ahmad Qasim";
        System.out.println(name.length());
        name="   Qasim    ";
        System.out.println(name.length());

        if(name.length()>10) {
            System.out.println("You are great ! ");

        }
        System.out.println("-----NextExample-----");
        name=" Qasim  ";
        System.out.println(name.length());

        if(name.length()<8) {
            System.out.println("you are bad boy! ");
        }else{
            System.out.println("you are good boy! ");
        }
    }

}
