package _2023._01_Singleton.naive_code;

public class Settings {

    private static Settings instance;

    private Settings() {}

    public static Settings getInstance(){
        if (instance == null) {
            return new Settings();
        }
        return instance;
    }
}
