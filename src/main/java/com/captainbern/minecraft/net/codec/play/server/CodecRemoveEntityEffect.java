package com.captainbern.minecraft.net.codec.play.server;

import com.captainbern.litebot.net.codec.Codec;
import com.captainbern.litebot.net.packet.play.server.PacketRemoveEntityEffect;
import com.captainbern.litebot.net.utils.ByteBufUtils;
import io.netty.buffer.ByteBuf;

public class CodecRemoveEntityEffect implements Codec<PacketRemoveEntityEffect> {

    public ByteBuf encode(ByteBuf byteBuf, PacketRemoveEntityEffect packet) {
        ByteBufUtils.writeVarInt(byteBuf, packet.getEntityId());
        byteBuf.writeByte(packet.getEffectId());
        
        return byteBuf;
    }

    public PacketRemoveEntityEffect decode(ByteBuf byteBuf) {
        int entityId = ByteBufUtils.readVarInt(byteBuf);
        byte effectId = byteBuf.readByte();
        
        return new PacketRemoveEntityEffect(entityId, effectId);
    }
}
