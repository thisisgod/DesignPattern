package _2023._01_Singleton.naive_code;

public class App {

    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        System.out.println(settings == Settings.getInstance());
    }
}
