package com.jung.chatservice.repository.chatRoom;

import com.jung.chatservice.domain.Member;
import com.jung.chatservice.domain.MemberChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberChatRoomRepository extends JpaRepository<MemberChatRoom, Long> {

}
