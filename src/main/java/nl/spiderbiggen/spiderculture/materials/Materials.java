package nl.spiderbiggen.spiderculture.materials;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

/**
 * Created by Spiderbiggen on 15-8-2014.
 */
public class Materials {
    public static final Material materialMobEgg = new MaterialMobEgg();

}

class MaterialMobEgg extends Material {
    public MaterialMobEgg() {
        super(MapColor.stoneColor);
        this.setRequiresTool();
        setImmovableMobility();
    }
}