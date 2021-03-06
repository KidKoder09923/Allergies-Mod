package net.kidkoder.allergies.capability.allergies;

import net.kidkoder.allergies.system.allergy.PlayerAllergies;
import net.minecraft.entity.player.PlayerEntity;

public class CapabilityAllergies implements IAllergies {

    private PlayerAllergies allergies;
    private PlayerEntity player;
    private boolean rolled;

    @Override
    public PlayerAllergies getAllergens() {
        return allergies;
    }

    @Override
    public boolean hasAllergies() {
        return allergies.hasAllergies();
    }

    @Override
    public void setAllergens(PlayerAllergies allergens) {
        this.allergies = allergens;
    }

    @Override
    public PlayerEntity getPlayer() {
        return null;
    }

    @Override
    public void setPlayer(PlayerEntity player) {
        this.player = player;
    }

    @Override
    public boolean rolled() {
        return this.rolled;
    }

    @Override
    public void setRolled() {
        this.rolled = true;
    }
}
