package MemberManagement.MemberManagement.repository;

import MemberManagement.MemberManagement.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{ //mac-option+Enter하면 구현클래스 자동세팅

    private static Map<Long,Member> store= new HashMap<>(); //지금은 멀티쓰레드에 따른 concurrency 문제를 고려하지 않겠음.
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }
}
