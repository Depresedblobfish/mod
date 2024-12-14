package net.luke.blobfirstmod.datagen;

import net.luke.blobfirstmod.BlobFirstMod;
import net.luke.blobfirstmod.block.ModBlocks;
import net.luke.blobfirstmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.html.HTML;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BlobFirstMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.SAPPHIRE_STAIRS.get())
                .add(ModBlocks.SAPPHIRE_SLAB.get())
                .add(ModBlocks.SAPPHIRE_BUTTON.get())
                .add(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get())
                .add(ModBlocks.SAPPHIRE_FENCE.get())
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get())
                .add(ModBlocks.SAPPHIRE_WALL.get())
                .add(ModBlocks.SAPPHIRE_DOOR.get())
                .add(ModBlocks.SAPPHIRE_TRAPDOOR.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
                .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get())
                .add(ModBlocks.SOUND_BLOCK .get())
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get());


        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_STAIRS.get())
                .add(ModBlocks.SAPPHIRE_SLAB.get())
                .add(ModBlocks.SAPPHIRE_BUTTON.get())
                .add(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get())
                .add(ModBlocks.SAPPHIRE_FENCE.get())
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get())
                .add(ModBlocks.SAPPHIRE_WALL.get())
                .add(ModBlocks.SAPPHIRE_DOOR.get())
                .add(ModBlocks.SAPPHIRE_TRAPDOOR.get());
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL.get());



    }
}
