package _2023._01_Singleton.use_enum;

public class App {

    public static void main(String[] args) {
        Settings settings = Settings.INSTANCE;
        System.out.println(settings == Settings.INSTANCE);
    }
}
