# 추상 팩토리 (Abstract factory) 패턴
- 서로 관련있는 여러 객체를 만들어주는 인터페이스
- Factory Method 패턴과 아주 유사
- 초점이 Client쪽으로 맞춰져있음

## 팩토리 메소드 패턴과의 차이점
```
1. 둘 다 구체적인 객체 생성과정을 추상화하 인터페이스를 제공한다.
2. 관점이 다르다.
- 팩토리 메소드 패턴은 "팩토리를 구현하는 방법 (inheritance)"에 초점을 둔다.
- 추상 팩토리 패턴은 "팩토리를 사용하는 방법 (composition)"에 초점을 둔다.
3. 목적이 조금 다르다.
- 팩토리 메소드 패턴은 구체적인 객체 생성 과정을 하위 또는 구체적인 클래스로 옮기는 것이 목적이다.
- 추상 팩토리 패턴은 관련있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게 해주는 것이 목적이다.
```