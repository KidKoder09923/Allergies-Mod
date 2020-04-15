/*
 * Koded by Kid Koder :)
 *
 *  % : ° ° : %
 *       O
 */

package net.kidkoder.allergies.capability.allergies;

import net.kidkoder.allergies.nbt.ObjectNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;

public class AllergiesStorage implements Capability.IStorage<IAllergies> {
    @Nullable
    @Override
    public INBT writeNBT(Capability<IAllergies> capability, IAllergies instance, Direction side) {
        return new ObjectNBT(instance.getAllergens());
    }

    @Override
    public void readNBT(Capability<IAllergies> capability, IAllergies instance, Direction side, INBT nbt) {
    }
}
