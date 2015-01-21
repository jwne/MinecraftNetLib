package com.captainbern.minecraft.net.protocol.types;

import com.captainbern.minecraft.net.protocol.MinecraftProtocol;
import com.captainbern.minecraft.net.protocol.ProtocolState;
import com.captainbern.minecraft.net.protocol.Side;

public class PlayProtocol extends MinecraftProtocol {

    public PlayProtocol(Side side) {
        super(side, ProtocolState.PLAY);

        registerClient(0x0, PacketKeepAlive.class, CodecKeepAlive.class);
        registerClient(0x01, PacketClientChatMessage.class, CodecClientChatMessage.class);
        registerClient(0x02, PacketUseEntity.class, CodecUseEntity.class);
        registerClient(0x03, PacketPlayerUpdate.class, CodecPlayerUpdate.class);
        registerClient(0x04, PacketPlayerUpdatePosition.class, CodecPlayerUpdatePosition.class);
        registerClient(0x05, PacketPlayerUpdateLook.class, CodecPlayerUpdateLook.class);
        registerClient(0x06, PacketPlayerUpdatePositionAndLook.class, CodecPlayerUpdatePositionLook.class);
        registerClient(0x07, PacketDigging.class, CodecDigging.class);
        registerClient(0x08, PacketPlaceBlock.class, CodecPlaceBlock.class);
        registerClient(0x09, PacketHeldItemChange.class, CodecHeldItemChange.class);
        registerClient(0x0a, PacketSwingArm.class, CodecSwingArm.class);
        registerClient(0x0b, PacketEntityAction.class, CodecEntityAction.class);
        registerClient(0x0c, PacketSteerVehicle.class, CodecSteerVehicle.class);
        registerClient(0x0d, PacketCloseWindow.class, CodecCloseWindow.class);
        registerClient(0x0e, PacketClickWindow.class, CodecClickWindow.class);
        registerClient(0x0f, PacketConfirmTransation.class, CodecConfirmTransation.class);
        registerClient(0x10, PacketCreativeInventoryAction.class, CodecCreativeInventoryAction.class);
        registerClient(0x11, PacketEnchantItem.class, CodecEnchantItem.class);
        registerClient(0x12, PacketUpdateSign.class, CodecUpdateSign.class);
        registerClient(0x13, PacketPlayerAbilities.class, CodecPlayerAbilities.class);
        registerClient(0x14, PacketTabComplete.class, CodecTabComplete.class);
        registerClient(0x15, PacketClientSettings.class, CodecClientSettings.class);
        registerClient(0x16, PacketClientStatus.class, CodecClientStatus.class);
        registerClient(0x17, PacketPluginMessage.class, CodecPluginMessage.class);
        registerClient(0x18, PacketSpectate.class, CodecSpectate.class);
        registerClient(0x19, PacketResourcePackStatus.class, CodecResourcePackStatus.class);

        registerServer(0x0, com.captainbern.litebot.net.packet.play.server.PacketKeepAlive.class, com.captainbern.litebot.net.codec.play.server.CodecKeepAlive.class, HandlerKeepAlive.class);
        registerServer(0x1, PacketJoinGame.class, CodecJoinGame.class, HandlerJoinGame.class);
        registerServer(0x2, PacketServerChatMessage.class, CodecServerChatMessage.class, HandlerServerChatMessage.class);
        registerServer(0x3, PacketTimeUpdate.class, CodecTimeUpdate.class, HandlerTimeUpdate.class);
        registerServer(0x4, PacketEntityEquipment.class, CodecEntityEquipment.class, HandlerEntityEquipment.class);
        registerServer(0x5, PacketSpawnPosition.class, CodecSpawnPosition.class, HandlerSpawnPosition.class);
        registerServer(0x6, PacketUpdateHealth.class, CodecUpdateHealth.class, HandlerUpdateHealth.class);
        registerServer(0x7, PacketRespawn.class, CodecRespawn.class, HandlerRespawn.class);
        registerServer(0x8, PacketPlayerPositionAndLook.class, CodecPlayerPositionAndLook.class, HandlerPlayerPositionAndLook.class);
        registerServer(0x9, com.captainbern.litebot.net.packet.play.server.PacketHeldItemChange.class, com.captainbern.litebot.net.codec.play.server.CodecHeldItemChange.class, HandlerHeldItemChange.class);
        registerServer(0xa, PacketUseBed.class, CodecUseBed.class, HandlerUseBed.class);
        registerServer(0xb, PacketAnimation.class, CodecAnimation.class, HandlerAnimation.class);
        registerServer(0xc, PacketSpawnPlayer.class, CodecSpawnPlayer.class, HandlerSpawnPlayer.class);
        registerServer(0xd, PacketCollectItem.class, CodecCollectItem.class, HandlerCollectItem.class);
        registerServer(0xe, PacketSpawnObject.class, CodecSpawnObject.class, HandlerSpawnObject.class);
        registerServer(0xf, PacketSpawnMob.class, CodecSpawnMob.class, HandlerSpawnMob.class);
        registerServer(0x10, PacketSpawnPainting.class, CodecSpawnPainting.class, HandlerSpawnPainting.class);
        registerServer(0x11, PacketSpawnExperienceOrb.class, CodecSpawnExperienceOrb.class, HandlerSpawnExperienceOrb.class);
        registerServer(0x12, PacketEntityVelocity.class, CodecEntityVelocity.class, HandlerEntityVelocity.class);
        registerServer(0x13, PacketDestroyEntities.class, CodecDestroyEntities.class, HandlerDestroyEntities.class);
        registerServer(0x14, PacketEntity.class, CodecEntity.class, HandlerEntity.class);
        registerServer(0x15, PacketEntityRelativeMove.class, CodecEntityRelativeMove.class, HandlerEntityRelativeMove.class);
        registerServer(0x16, PacketEntityLook.class, CodecEntityLook.class, HandlerEntityLook.class);
        registerServer(0x17, PacketEntityLookAndRelativeMove.class, CodecEntityLookandRelativeMove.class, HandlerEntityLookandRelativeMove.class);
        registerServer(0x18, PacketEntityTeleport.class, CodecEntityTeleport.class, HandlerEntityTeleport.class);
        registerServer(0x19, PacketEntityHeadLook.class, CodecEntityHeadLook.class, HandlerEntityHeadLook.class);
        registerServer(0x1a, PacketEntityStatus.class, CodecEntityStatus.class, HandlerEntityStatus.class);
        registerServer(0x1b, PacketAttachEntity.class, CodecAttachEntity.class, HandlerAttachEntity.class);
        registerServer(0x1c, PacketEntityMetadata.class, CodecEntityMetadata.class, HandlerEntityMetadata.class);
        registerServer(0x1d, PacketEntityEffect.class, CodecEntityEffect.class, HandlerEntityEffect.class);
        registerServer(0x1e, PacketRemoveEntityEffect.class, CodecRemoveEntityEffect.class, HandlerRemoveEntityEffect.class);
        registerServer(0x1f, PacketSetExperience.class, CodecSetExperience.class, HandlerSetExperience.class);
        registerServer(0x20, PacketEntityProperties.class, CodecEntityProperties.class, HandlerEntityProperties.class);
        registerServer(0x21, PacketChunkData.class, CodecChunkData.class, HandlerChunkData.class);
        registerServer(0x22, PacketMultiBlockChange.class, CodecMultiBlockChange.class, HandlerMultiBlockChange.class);
        registerServer(0x23, PacketBlockChange.class, CodecBlockChange.class, HandlerBlockChange.class);
        registerServer(0x24, PacketBlockAction.class, CodecBlockAction.class, HandlerBlockAction.class);
        registerServer(0x25, PacketBlockBreakAnimation.class, CodecBlockBreakAnimation.class, HandlerBlockBreakAnimation.class);
        registerServer(0x26, PacketMapChunkBulk.class, CodecMapChunkBulk.class, HandlerMapChunkBulk.class);
        registerServer(0x27, PacketExplosion.class, CodecExplosion.class, HandlerExplosion.class);
        registerServer(0x28, PacketEffect.class, CodecEffect.class, HandlerEffect.class);
        registerServer(0x29, PacketSoundEffect.class, CodecSoundEffect.class, HandlerSoundEffect.class);
        registerServer(0x2a, PacketParticle.class, CodecParticle.class, HandlerParticle.class);
        registerServer(0x2b, PacketChangeGameState.class, CodecChangeGameState.class, HandlerChangeGameState.class);
        registerServer(0x2c, PacketSpawnGlobalEntity.class, CodecSpawnGlobalEntity.class, HandlerSpawnGlobalEntity.class);
        registerServer(0x2d, PacketOpenWindow.class, CodecOpenWindow.class, HandlerOpenWindow.class);
        registerServer(0x2e, com.captainbern.litebot.net.packet.play.server.PacketCloseWindow.class, com.captainbern.litebot.net.codec.play.server.CodecCloseWindow.class, HandlerCloseWindow.class);
        registerServer(0x2f, PacketSetSlot.class, CodecSetSlot.class, HandlerSetSlot.class);
        registerServer(0x30, PacketWindowItems.class, CodecWindowItems.class, HandlerWindowItems.class);
        registerServer(0x31, PacketWindowProperty.class, CodecWindowProperty.class, HandlerWindowProperty.class);
        registerServer(0x32, com.captainbern.litebot.net.packet.play.server.PacketConfirmTransaction.class, CodecConfirmTransaction.class, HandlerConfirmTransaction.class);
        registerServer(0x33, com.captainbern.litebot.net.packet.play.server.PacketUpdateSign.class, com.captainbern.litebot.net.codec.play.server.CodecUpdateSign.class, HandlerUpdateSign.class);
        registerServer(0x34, PacketMaps.class, CodecMaps.class, HandlerMaps.class);
        registerServer(0x35, PacketUpdateBlockEntity.class, CodecUpdateBlockEntity.class, HandlerUpdateBlockEntity.class);
        registerServer(0x36, PacketSignEditorOpen.class, CodecSignEditorOpen.class, HandlerSignEditorOpen.class);
        registerServer(0x37, PacketStatistics.class, CodecStatistics.class, HandlerStatistics.class);
        registerServer(0x38, PacketPlayerListItem.class, CodecPlayerListItem.class, HandlerPlayerListItem.class);
        registerServer(0x39, com.captainbern.litebot.net.packet.play.server.PacketPlayerAbilities.class, com.captainbern.litebot.net.codec.play.server.CodecPlayerAbilities.class, HandlerPlayerAbilities.class);
        registerServer(0x3a, com.captainbern.litebot.net.packet.play.server.PacketTabComplete.class, com.captainbern.litebot.net.codec.play.server.CodecTabComplete.class, HandlerTabComplete.class);
        registerServer(0x3b, PacketScoreboardObjective.class, CodecScoreboardObjective.class, HandlerScoreboardObjective.class);
        registerServer(0x3c, PacketUpdateScore.class, CodecUpdateScore.class, HandlerUpdateScore.class);
        registerServer(0x3d, PacketDisplayScoreboard.class, CodecDisplayScoreboard.class, HandlerDisplayScoreboard.class);
        registerServer(0x3e, PacketTeams.class, CodecTeams.class, HandlerTeams.class);
        registerServer(0x3f, com.captainbern.litebot.net.packet.play.server.PacketPluginMessage.class, com.captainbern.litebot.net.codec.play.server.CodecPluginMessage.class, HandlerPluginMessage.class);
        registerServer(0x40, PacketDisconnect.class, CodecDisconnect.class, HandlerDisconnect.class);
        registerServer(0x41, PacketServerDifficulty.class, CodecServerDifficulty.class, HandlerServerDifficulty.class);
        registerServer(0x42, PacketCombatEvent.class, CodecCombatEvent.class, HandlerCombatEvent.class);
        registerServer(0x43, PacketCamera.class, CodecCamera.class, HandlerCamera.class);
        registerServer(0x44, PacketWorldBorder.class, CodecWorldBorder.class, HandlerWorldBorder.class);
        registerServer(0x45, PacketTitle.class, CodecTitle.class, HandlerTitle.class);
        registerServer(0x46, PacketSetCompression.class, CodecSetCompression.class, HandlerSetCompression.class);
        registerServer(0x47, PacketPlayerListHeaderFooter.class, CodecPlayerListHeaderFooter.class, HandlerPlayerListHeaderFooter.class);
        registerServer(0x48, PacketResourcePackSend.class, CodecResourcePackSend.class, HandlerResourcePackSend.class);
        registerServer(0x49, PacketUpdateEntityNBT.class, CodecUpdateEntityNBT.class, HandlerUpdateEntityNBT.class);
    }
}
