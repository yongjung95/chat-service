package com.jung.chatservice.repository.chatRoom;

import com.jung.chatservice.domain.ChatRoom;
import com.jung.chatservice.domain.Member;
import com.jung.chatservice.repository.member.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ChatRoomRepositoryTest {

    @Autowired
    private ChatRoomRepository chatRoomRepository;

    @Test
    public void 채팅방_생성 () {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.setRoomId(UUID.randomUUID().toString());
        chatRoom.setRoomName("새로운 채팅방");

        chatRoomRepository.save(chatRoom);

        List<ChatRoom> roomList = chatRoomRepository.findAll();

        for (ChatRoom room : roomList) {
            System.out.println(room);
        }
    }

}