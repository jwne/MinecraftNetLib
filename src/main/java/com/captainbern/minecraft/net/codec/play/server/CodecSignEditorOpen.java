package com.captainbern.minecraft.net.codec.play.server;

import com.captainbern.litebot.net.codec.Codec;
import com.captainbern.litebot.net.packet.play.server.PacketSignEditorOpen;
import com.captainbern.litebot.net.utils.ByteBufUtils;
import com.captainbern.litebot.world.block.BlockVector;
import io.netty.buffer.ByteBuf;

public class CodecSignEditorOpen implements Codec<PacketSignEditorOpen> {

    public ByteBuf encode(ByteBuf byteBuf, PacketSignEditorOpen packet) {
        ByteBufUtils.writeBlockPosition(byteBuf, packet.getX(), packet.getY(), packet.getZ());

        return byteBuf;
    }

    public PacketSignEditorOpen decode(ByteBuf byteBuf) {
        BlockVector blockVector = ByteBufUtils.readBlockPosition(byteBuf);

        return new PacketSignEditorOpen(blockVector.getX(), blockVector.getY(), blockVector.getZ());
    }
}
