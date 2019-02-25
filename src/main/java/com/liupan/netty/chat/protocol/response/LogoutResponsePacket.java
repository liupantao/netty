package com.liupan.netty.chat.protocol.response;

import com.liupan.netty.chat.protocol.Packet;
import lombok.Data;

import static com.liupan.netty.chat.protocol.command.Command.LOGOUT_RESPONSE;


@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGOUT_RESPONSE;
    }
}
