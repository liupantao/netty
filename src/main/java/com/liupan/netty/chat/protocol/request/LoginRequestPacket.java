package com.liupan.netty.chat.protocol.request;

import com.liupan.netty.chat.protocol.Packet;
import lombok.Data;

import static com.liupan.netty.chat.protocol.command.Command.LOGIN_REQUEST;


@Data
public class LoginRequestPacket extends Packet {
    private String userName;

    private String password;

    @Override
    public Byte getCommand() {

        return LOGIN_REQUEST;
    }
}
