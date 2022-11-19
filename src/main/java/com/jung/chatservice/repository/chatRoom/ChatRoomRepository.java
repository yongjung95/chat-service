package com.jung.chatservice.repository.chatRoom;

import com.jung.chatservice.domain.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, String> {
}
