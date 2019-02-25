package com.liupan.netty.chat.protocol.request;

import com.liupan.netty.chat.protocol.Packet;
import lombok.Data;

import static com.liupan.netty.chat.protocol.command.Command.LOGOUT_REQUEST;

@Data
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {

        return LOGOUT_REQUEST;
    }
}