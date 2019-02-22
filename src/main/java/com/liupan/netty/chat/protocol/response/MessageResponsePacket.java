package com.liupan.netty.chat.protocol.response;

import com.liupan.netty.chat.protocol.Packet;
import lombok.Data;

import static com.liupan.netty.chat.protocol.command.Command.MESSAGE_RESPONSE;


@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
