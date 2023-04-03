package MemberManagement.MemberManagement.repository;

import MemberManagement.MemberManagement.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원 저장
    Optional<Member> findById(Long id); //null인 경우 Optional로 감싸서 처리하기 위함.
    Optional<Member> findByName(String name);
    List<Member> findAll(); //모든 회원 출력
}
