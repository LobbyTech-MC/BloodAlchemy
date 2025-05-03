package io.github.mooy1.bloodalchemy;

import javax.annotation.Nonnull;

import org.bukkit.NamespacedKey;

import io.github.mooy1.bloodalchemy.implementation.Items;
import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.mooy1.infinitylib.metrics.bukkit.Metrics;

public final class BloodAlchemy extends AbstractAddon {
    
    public BloodAlchemy(String githubUserName, String githubRepo, String autoUpdateBranch, String autoUpdateKey) {
		super("LobbyTech-MC", "BloodAlchemy", "master", "auto-update");
		// TODO Auto-generated constructor stub
	}

	private static BloodAlchemy instance;
    private static NamespacedKey key = new NamespacedKey(instance, "blood_alchemy");
    
    public static BloodAlchemy inst() {
        return instance;
    }
    
    protected void onAddonEnable() {
        // All of the config and auto update stuff is taken care of in AbstractAddon#onEnable
        Items.setup(instance = this);
    }

    protected void onAddonDisable() {
        instance = null;
    }

    protected Metrics setupMetrics() {
        return new Metrics(this, 11483);
    }

    @Nonnull
    protected String getGithubPath() {
        return "Mooy1/BloodAlchemy/master";
    }

	public NamespacedKey getKey(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public NamespacedKey getKey() {
		// TODO Auto-generated method stub
		return new NamespacedKey(instance, "blood_alchemy");
	}

	@Override
	protected void enable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void disable() {
		// TODO Auto-generated method stub
		
	}
    
}
