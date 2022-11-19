package com.jung.chatservice.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class ChatRoom {

    @Id
    private String roomId;

    private String roomName;

}
