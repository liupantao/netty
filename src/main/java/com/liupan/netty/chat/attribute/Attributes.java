package com.liupan.netty.chat.attribute;

import com.liupan.netty.chat.session.Session;
import io.netty.util.AttributeKey;

public interface Attributes {

    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
