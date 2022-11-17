package com.jung.chatservice.repository;

import com.jung.chatservice.domain.Member;
import com.jung.chatservice.domain.QMember;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import java.util.List;

import static com.jung.chatservice.domain.QMember.member;

public class MemberRepositoryImpl implements CustomMemberRepository{
    private final JPAQueryFactory queryFactory;

    public MemberRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<Member> findMemberByMemberId(Long memberId) {
        return queryFactory.select(member).from(member).where(member.memberId.eq(memberId)).fetch();
    }
}
