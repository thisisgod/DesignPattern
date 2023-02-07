package _2023._01_Singleton.multi_threads;

public class Settings {

//    private static volatile Settings instance;
    private static Settings instance;
//    private static final Settings INSTANCE = new Settings();

    private Settings() {}

//    lock
//    public static synchronized Settings getInstance(){
//        if (instance == null) {
//            return new Settings();
//        }
//        return instance;
//    }

//    eager initialization
//    public static Settings getInstance(){
//        return INSTANCE;
//    }
//    double checked locking
//    public static Settings getInstance(){
//        if (instance == null){
//            synchronized (Settings.class){
//                if (instance==null){
//                    instance = new Settings();
//                }
//            }
//        }
//        return instance;
//    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings  getInstance(){
        return  SettingsHolder.INSTANCE;
    }
}
