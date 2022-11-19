package com.jung.chatservice.repository.member;

import com.jung.chatservice.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Long>, CustomMemberRepository {
}
