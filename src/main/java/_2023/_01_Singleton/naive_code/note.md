# 이 코드가 멀티 쓰레드 환경에서 안전하지 않은 이유

```java
public static Settings getInstance(){
    if (instance == null) {
        return new Settings();
    }
    return instance;
}
```
- 이 코드에서 if문을 이미 통과한 A 쓰레드가 return 되기 전에 B라는 쓰레드가 if문에 진입하게 된다면 동시접근이 되어 스레드 안정성을 해친다.