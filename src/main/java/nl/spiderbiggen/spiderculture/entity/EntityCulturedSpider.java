package nl.spiderbiggen.spiderculture.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.world.World;

/**
 * Created by Spiderbiggen on 2-9-2014.
 */
public class EntityCulturedSpider extends EntityTameable {
    public EntityCulturedSpider(World world) {
        super(world);
        this.setSize(0.9f, 1.3f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);

    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound() {
        return "mob.spider.say";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound() {
        return "mob.spider.say";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound() {
        return "mob.spider.death";
    }

    @Override
    protected float getSoundVolume() {
        return 0.2F;
    }

    @Override
    public EntityAgeable createChild(EntityAgeable p_90011_1_) {
        return null;
    }
}
