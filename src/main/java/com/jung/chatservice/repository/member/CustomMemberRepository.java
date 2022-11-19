package com.jung.chatservice.repository.member;

import com.jung.chatservice.domain.Member;

import java.util.List;

public interface CustomMemberRepository {
    List<Member> findMemberByMemberId(Long memberId);
}
