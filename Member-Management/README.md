## Member-Menagement

### 📌 소개
- 회원관리 시스템을 개발한다.



### 📌 기획
- 회원 정보(id, name)을 저장하는 시스템을 개발.


### 📌 domain
1. class : Member
- 멤버변수 : id, name


### 📌 repository
1. interface : MemberRepository

2. 구현 class : MemoryMemberRepository
> Optional<Member> : NPE(NullPointerException)을 효율적으로 대처하기 위해 Optional로 감싸준다.
