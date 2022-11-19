package com.jung.chatservice.repository.chatRoom;

import com.jung.chatservice.domain.ChatRoom;
import com.jung.chatservice.domain.Member;
import com.jung.chatservice.domain.MemberChatRoom;
import com.jung.chatservice.repository.member.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@SpringBootTest
@Transactional
class MemberChatRoomRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private ChatRoomRepository chatRoomRepository;

    @Autowired
    private MemberChatRoomRepository memberChatRoomRepository;

    @Autowired
    private EntityManager entityManager;

    @Test
    public void 회원_채팅방_조인 (){
        Member member = new Member();
        member.setNickname("정이");

        memberRepository.save(member);

        ChatRoom chatRoom = new ChatRoom();
        chatRoom.setRoomId(UUID.randomUUID().toString());
        chatRoom.setRoomName("정이 채팅방");

        chatRoomRepository.save(chatRoom);

        entityManager.flush();

        MemberChatRoom memberChatRoom = new MemberChatRoom();
        memberChatRoom.setMember(member);
        memberChatRoom.setChatRoom(chatRoom);
        memberChatRoom.setIsUse("Y");

        memberChatRoomRepository.save(memberChatRoom);

        System.out.println(memberChatRoom);

        List<MemberChatRoom> all = memberChatRoomRepository.findAll();

        for (MemberChatRoom room : all) {
            System.out.println(room);
        }

    }
}