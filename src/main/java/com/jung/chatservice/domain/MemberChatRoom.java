package com.jung.chatservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class MemberChatRoom {

    @Id
    @GeneratedValue
    private Long memberChatRoomId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "chat_room_id")
    private ChatRoom chatRoom;

    private String isUse;
}
