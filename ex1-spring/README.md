> ## Setting
> - MacOS
> - Spring Boot 3.0.5
> - IntelliJ

---

# 1. Spring 웹개발 기초 설명

## 📌 spring 프레임워크 뜯어보기.
<img width="653" alt="스크린샷 2023-03-30 오후 7 10 13" src="https://user-images.githubusercontent.com/84169614/228803888-5ca206cf-0822-49c9-9399-268e559c0f07.png">

1) gradle이란
- 빌드 자동화도구로, 라이브러리 정보를 담고 컴파일부터 빌드까지 도와주는 역할을 한다. vscode의 task의 역할을 포함한다고 생각하면 이해하기 쉽다.
- 이외에도 테스트, 배포 등의 역할을 담당한다.


## 📌 welcome page 
<img width="339" alt="스크린샷 2023-03-30 오후 7 59 14" src="https://user-images.githubusercontent.com/84169614/228815728-94a75df0-c011-4807-9759-958705f7fd8c.png">

1) localhost:8080으로 들어갈 때 처음 마주하는 페이지
- static/index.html을 찾아 인식한다. 
- [spring reference](https://docs.spring.io/spring-boot/docs/current/reference/html/web.html#web) <img width="966" alt="스크린샷 2023-03-30 오후 8 00 39" src="https://user-images.githubusercontent.com/84169614/228816049-656dee83-75c3-4e6c-a0a6-88a864209697.png">




## 📌 MVC와 API
### 1) MVC와 thymeleaf 엔진
- MVC는 디자인 패턴의 한 종류로 Model-View-Controller로 각 기능을 역할에 맞게 나누어 설계하는 방식이다.

#### Model
- Model은 데이터와 비즈니스 로직을 담당한다. 아래에서 Model 객체로 활용하였다. <img width="681" alt="스크린샷 2023-04-01 오후 6 58 42" src="https://user-images.githubusercontent.com/84169614/229279462-1fa36c9d-2fde-42c2-af0f-24ecc733da5d.png">

#### View
- View는 화면에 띄우는 기능을 전담하며, thymeleaf엔진은 이를 전담하는 템플릿 엔진이다. <img width="486" alt="스크린샷 2023-04-01 오후 7 00 52" src="https://user-images.githubusercontent.com/84169614/229279555-7ee534b2-e29f-47b6-a285-7272fcc93aff.png">

#### Controller
- Controller는 Model과 View에 작동을 관여하는 명령 등을 수행하는 명령을 담당한다. 
- Controller 패키지안에서 @Controller 어노테이션을 통해 지정할 수 있고, 이후 각종 데이터 호출, 처리 등의 코드를 여기에 입력한다.<img width="692" alt="스크린샷 2023-04-01 오후 7 04 06" src="https://user-images.githubusercontent.com/84169614/229279692-0f98c127-3bb2-48e1-8adb-725dda6b5cc6.png">


### 2) API방식
- 객체 혹은 String등을 반환하고, Json형식으로 전달한다. 
<img width="472" alt="스크린샷 2023-04-01 오후 7 06 05" src="https://user-images.githubusercontent.com/84169614/229279799-115e52bb-59f7-44ac-b91f-fd1f3f9e6377.png">

- @ResponseBody 어노테이션을 통해 http body에 객체 자체를 전달하며, Json으로 변환되어 화면에는 Json 객체가 그대로 전달 되는 특징이 있다.<img width="405" alt="스크린샷 2023-04-01 오후 7 07 26" src="https://user-images.githubusercontent.com/84169614/229279862-25ae43f6-b119-4141-bba4-14db24cb08b8.png">

