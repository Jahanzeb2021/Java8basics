package Class13;

public class ClassesinJava {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();

        laptop.make="Mac";
        laptop.model="pro 16";
        laptop.storage=1;
        laptop.RAMCapacity=16;
        laptop.color="color";
        laptop.processor="core i7";
        laptop.GPU="Nvidia RTX 3090 12GB DDR6x";
        laptop.playMovies();
        laptop.borowseInternet();
        laptop.makeVideoCall("Mike");
        String model = laptop.getModel();
        System.out.println(model);
        System.out.println(laptop.getRAMCapacity());

    }
}
