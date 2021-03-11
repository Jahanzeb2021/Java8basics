package Class13;

public class Laptop {
    String make;
    String model;
    int storage;
    int RAMCapacity;
    String color;
    String processor;
    String GPU;

    void playMovies() {
        System.out.println("play movies");
    }
    void borowseInternet(){
        System.out.println("browsing the Internet");
    }
    void makeVideoCall(String contact){
        System.out.println("Video calling to "+contact);
    }
    public String getModel(){
        return model;
    }
    int getRAMCapacity(){
        return RAMCapacity*2;
    }
}
