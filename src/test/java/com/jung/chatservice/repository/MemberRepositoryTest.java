package com.jung.chatservice.repository;

import com.jung.chatservice.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
@Transactional
class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 회원_생성() {
        Member member = new Member();
        member.setNickname("정이");

        memberRepository.save(member);

        List<Member> memberList = memberRepository.findMemberByMemberId(member.getMemberId());

        for (Member findMember : memberList) {
            System.out.println(findMember);
        }

    }
}