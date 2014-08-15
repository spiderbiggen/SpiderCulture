package nl.spiderbiggen.spiderculture.materials;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by Spiderbiggen on 15-8-2014.
 */
public class MaterialMobEgg extends Material {
    public MaterialMobEgg(boolean noHarvest) {
        super(MapColor.stoneColor);
        if (noHarvest) {
            this.setRequiresTool();
        }
        setImmovableMobility();
    }

    public MaterialMobEgg() {
        super(MapColor.stoneColor);
        this.setRequiresTool();
        setImmovableMobility();
    }
}
