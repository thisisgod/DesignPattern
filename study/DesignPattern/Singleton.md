# 싱글톤(Singleton) 패턴
- 인스턴스를 오직 한개만 제공하는 클래스


```java
// 간단하게 구현하기

public class Settings{
    private Settings(){}

    public static Settings getInstance(){
        if (instance == null){
            instance = new Settings();
        }
        
        return instance;
    }
}
```
```java
// double checked locking 방법

public class Settings{
    private Settings() {}
    
    public static Settings getInstance(){
        if (instance == null){
            synchronized (Settings.class) {
                if (instance == null){
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}

```
```java
// static inner 클래스 사용하는 방법
// 싱글톤 구현 시 권장되는 방법 1

public class Settings {
    private Settings() {
    }

    private static class SettingsHolder {
        private static final Settings SETTINGS = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.SETTINGS;
    }
}
```

## 싱글톤 패턴 구현 방법을 깨트리는 방법
1. 리플렉션 (enum으로 구현하여 막을 수 있다.)
2. 직렬화 & 역직렬화 (Object 타입의 readResolve 메소드를 선언해 역직렬화 시 싱글톤 파훼를 막을 수 있고, enum 역시 막을 수 있다.)

```java
// enum을 사용하는 방법
// 싱글톤 구현 시 권장되는 방법 2

public enum Settings{
    INSTANCE;
}
```

## QnA
```
# Q1) 자바에서 enum을 사용하지 않고 싱글톤 패턴을 구현하는 방법은?
# A) synchronized, double checked locking, static inner class
```
```
# Q2) private 생성자와 static 메소드를 사용하는 방법의 단점은?
# A) 멀티스레드 환경에서 동시접근으로 인해 싱글톤 패턴이 무너질 수 있다.
# ex) A와 B쓰레드가 차례대로 if(instance == null) 문을 통과 한 후 A부터 다시 instance를 생성하려고 할 때, instance 가 두개 만들어 질 수 있다.
```
```
# Q3) enum을 사용해 싱글톤 패턴을 구현하는 방법의 장점과 단점은?
# A) 싱글톤 패턴 구현시 권장되는 방법 중 하나로, 리플렉션과 직렬화 & 역직렬화를 모두 막을 수 있다는 장점이 있지만,
     미리 만들어지고, 클래스를 상속받지 못한다는 단점이 있다. 
```
```java
// Q4) static inner 클래스를 사용해 싱글톤 패턴을 구현하라.
// A)
public class Settings {
    private Settings() {
    }

    private static class SettingsHolder {
        private static final Settings SETTINGS = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.SETTINGS;
    }
}
```