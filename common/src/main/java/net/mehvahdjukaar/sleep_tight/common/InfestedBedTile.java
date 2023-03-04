package net.mehvahdjukaar.sleep_tight.common;

import net.mehvahdjukaar.sleep_tight.SleepTight;
import net.mehvahdjukaar.sleep_tight.core.BedData;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class InfestedBedTile extends BlockEntity {

    private DyeColor color = DyeColor.WHITE;

    public InfestedBedTile(BlockPos blockPos, BlockState blockState) {
        super(SleepTight.INFESTED_BED_TILE.get(), blockPos, blockState);
    }

    public DyeColor getColor() {
        return this.color;
    }

    public void setColor(DyeColor color) {
        this.color = color;
    }
}