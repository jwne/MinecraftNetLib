package com.captainbern.minecraft.net.handler.play.server;

import com.captainbern.minecraft.net.handler.Handler;
import com.captainbern.minecraft.net.packet.play.server.PacketDisplayScoreboard;
import com.captainbern.minecraft.net.session.Session;

public class HandlerDisplayScoreboard implements Handler<Session, PacketDisplayScoreboard> {

    @Override
    public void handle(Session session, PacketDisplayScoreboard packet) {

    }    
}
