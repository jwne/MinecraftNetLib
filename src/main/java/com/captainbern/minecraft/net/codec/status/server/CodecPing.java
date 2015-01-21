package com.captainbern.minecraft.net.codec.status.server;

import com.captainbern.minecraft.net.codec.Codec;
import com.captainbern.minecraft.net.packet.status.server.PacketPing;
import io.netty.buffer.ByteBuf;

public class CodecPing implements Codec<PacketPing> {

    @Override
    public ByteBuf encode(ByteBuf byteBuf, PacketPing packet) {
        return byteBuf.writeLong(packet.getTime());
    }

    @Override
    public PacketPing decode(ByteBuf byteBuf) {
        return new PacketPing(byteBuf.readLong());
    }
}
