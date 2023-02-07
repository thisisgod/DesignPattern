# lock 방식
```java
    public static synchronized Settings getInstance(){
        if (instance == null) {
            return new Settings();
        }
        return instance;
    }
```
- synchronized 키워드를 통해 lock 의 효과를 얻는 대신 성능 저하 발생 가능성 있음

# 이른 초기화 (eager initialization) 방식
```java
    private static final Settings INSTANCE = new Settings();

    public static Settings getInstance(){
        return INSTANCE;
    }
```
- lock 방식과 비교했을때, 성능 저하 없음.
- 단순히 상수 객체를 리턴해주기 때문에 쓰레드 안전성을 해치지 않음
- 미리 만들어 놓기 때문에, 자주 사용하는 객체가 아닌 경우 비효율적일 수 있음

# double checked locking 방식
```java
    private static volatile Settings instance;

    public static Settings getInstance(){
        if (instance == null){
            synchronized (Settings.class){
                if (instance==null){
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
```
- lock 방식에 비해 쓰레드가 실질적으로 여러개가 들어왔을 때만 synchronized 키워드를 쓰기 때문에 평소에는 lock 방식에 비해 성능면에서 뛰어남

# static inner 클래스 사용
```java
    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings  getInstance(){
        return  SettingsHolder.INSTANCE;
    }
```
- 멀티쓰레드 환경에서도 안전
- getInstance가 호출 될 때, SettingHolder 클래스를 호출 하고, 호출 될 때 Instance를 생성하기 때문에 lazy loading 가능