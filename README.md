
${\color{red}Red}$


[![](https://img.shields.io/badge/github-blue?style=for-the-badge)](https://github.com/hamzamohdzubair/redant)
[![](https://img.shields.io/badge/book-blueviolet?style=for-the-badge)](https://hamzamohdzubair.github.io/redant/)
[![](https://img.shields.io/badge/API-yellow?style=for-the-badge)](https://docs.rs/crate/redant/latest)
[![](https://img.shields.io/badge/Crates.io-orange?style=for-the-badge)](https://crates.io/crates/redant)
[![](https://img.shields.io/badge/Lib.rs-lightgrey?style=for-the-badge)](https://lib.rs/crates/redant)

> [!NOTE]  
> Highlights information that users should take into account, even when skimming.




# XML (eXtensible Markup Language)
- 데이터를 나타낼 수 있는 방식 중 대표적인 것이 XML과 JSON 입니다.
- XML 은 W3C에서 개발된, 다른 특수한 목적을 갖는 마크업 언어를 만드는데 사용하도록 권창하는 다목적 마크업 언어입니다.

# XML 문법

# 안드로이드
- 구글이 공개한 개방형 운영 체제로 리눅스의 커널 위에서 동작, 자바와 코들린으로 애플리케이션을 작성하며 휴대용 장치에서 주로 사용
- 운영 체제와 미들웨어, 사용자 인터페이스(UI), 브라우저, 애플리케이션 등으로 구성되어 있고, 터치스크린 기능 ,쿼티 자판, 웹 서핑, 지도 검색, 온라인 인스턴스 메신저 등 다영한 기능을 제공

# 인덱스 생성 명령어
- CREATE [UNIQUE] INDEX <index_name> ON <table name> (<column(s)>);
- ex) CREATE INDEX idx_name ON student(name)  : student 테이블의 name 속성에 idx_name 이름으로 인덱스로 생성하는 명령어
  
# SOAP
- XML과 HTTP 통신을 기반으로 하여 네트워크 상에 존재하는 각종 컴포넌트 간 호출을 효율적으로 실현하기 위한 방법을 제시하는 규약
- 네트워크상에서 Client와 Service 간에 메시지를 요청하고 이에 응답해주는 방법을 제공합니다
  
# SOAP 의 특징
- 표준 공개성, 유연성, 확장성, 분산 컴퓨팅, 독립성, 저용랑 미들웨어

# SQL Injection
- SQL 삽입을 뜻하며, 웹 응용 프로그램에 강제로 SQL 구문을 삽입하여 내부 데이터베이스 서베의 데이터를 유출 및 변조하고 관리자 인증을 우회하는 공격 기법
  
# 소프트웨어 취약점
- 메모리 보안 칩입
  - 버퍼 오버플로 : 메모리를 다루는 데에 오류가 발생하여 잘못된 동작을 하는 프로그램 취약점
                   컴퓨터 보안과 프로그래밍에서는 프로세스가 데이터를 버퍼에 저장할 때 프로그래머가 지정한 곳 외에 저장
  - 허상 포인트 : 컴퓨터 프로그래밍에서 적절한 타입의 유효한 객체를 가리키고 있지 않은 포인터로 인한 취약점
  - Null Pointer 역참조 : Null로 설정된 변수의 주소 값을 참조했을 때 발생하는 보안 취약점
- 입력 확인 오류
  - 포맷 스트링 버그 : 포맷팅을 수행하는 printf() 같은 특정한 C 함수들에서 검사되지 않은 사용자 입력을 포맷 스트링 파라미터로 사용하는 공격 기법
  - SQL 삽입 : 위 설명
  - 코드 삽입 : 유효하지 않은 데이터를 실행함으로써 야기되는 소프트웨어 버그의 부당한 사용
  - 이메일 삽입 : 웹 어플리케이션의 메일 송신 기능에 공격자가 임의의 To 및 Subject 등의 메일 헤더를 부정하게 추가하는 공격 기법
  - 디렉터리 접근 공격 : 비공개 디렉토리의 파일에 대해서 부정하게 디렉토리 경로를 가로질러 액세스하는 공격 기법
  - 웹 사이트 간 스크립팅 : 취약성이 있는 웹 사이트를 방문한 사용자의 브라우저에서 부정한 HTML 태그나 JavaScript를 동작시키는 공격 기법
  - HTTP 헤더 인젝션 : 공격자가 응답 헤더의 필드에 개행 문자 등을 삽입함으로써 임의의 응답 헤더 필드나 바다에 내용을 추가하는 수동적 공격 기법
  - HTTP 응답 분할 : 공격자가 HTTP 요청에 삽입한 인자 값이 HTTP 응답헤더에 포함되어 사용자에게 다시 전달될 때 개행 문자를 이용하여 첫 번째 응답을 종료시키고 두 번째 응답에 악의적인 코드를 주입하는 공격 기법


# TestCode
- Given-When-Then 패턴
    - Given
        
        테스트를 수행하기 전에 테스트에 필요한 환경을 설정하는 단계
        테스트에 필요한 변수를 정의하거나 Mock 객체를 통해 특정 상황에 대한 행동을 정의
        
    - When
        
        테스트의 목적을 보여주는 단계
        
        실제 테스트 코드가 포함되며, 테스트를 통한 결괏값을 가져옴
        
    - Then
        
        테스트의 결과를 검증하는 단계
        
        일반적으로 When 단계에서 나온 결괏값을 검증하는 작업을 수행
        
        결괏값이 아니더라도 이 테스트를 통해 나온 결과에서 검증해야 하는 부분이 있다면 이 단계에 포함

# 관심사의 분리
- 개발자가 객체를 설계할 때 가장 염두에 둬야 할 사항은 바로 미래의 변화를 어떻게 대비할 것인가이다.
- 객체지향 설계와 프로그래밍이 이전의 절차적 프로그래밍 패러다임에 비해 초기에 좀 더 많은, 번거로운 작업을 요구하는 이유는 객체지향 기술 자체가 지니는, 변화에 효과적으로 대처할 수 있다는 기술적인 특징 때문이다
- 관심사의 분리(Sepereation of Concerns) : 소프트웨어 시스템의 각 부분이 서로 다른 책임을 갖도록 설계하는 것을 의미. 이를 통해 각 부분의 개발과 유지보수를 보다 쉽게 하고, 시스템의 복잡성을 줄일 수 있다.

+ 추가적으로 
스프링 관련 지식 추가할 예정