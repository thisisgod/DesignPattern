package _2023._01_Singleton.multi_threads;

public class App {

    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        System.out.println(settings == Settings.getInstance());
    }
}