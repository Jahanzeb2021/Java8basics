package Class15;

import java.io.InputStream;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String momsname,dadsname,gender,babyname;

        System.out.println("Please enter moms name");
        momsname = scanner.nextLine();

        System.out.println("Please enter dads name");
        dadsname = scanner.nextLine();
        System.out.println("Is it a boy or girl");
        gender=scanner.nextLine();

        if(gender.toLowerCase().startsWith("b")) {
            String firstpart = dadsname.substring(0,dadsname.length()/2);
            String lastpart =  momsname.substring(momsname.length()/2);
            babyname = firstpart +lastpart;
            System.out.println(babyname);

        }else if (gender.toLowerCase().startsWith("g")){
            String firstpart = momsname.substring(0,momsname.length()/2);
            String lastpart =  dadsname.substring(dadsname.length()/2);
            babyname = firstpart +lastpart;
        }else{
            babyname ="No suggestions";
        }

        System.out.println(babyname);
    }
}
