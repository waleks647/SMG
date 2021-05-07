package me.waleks.simplematerialgenerators;

import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.updater.GitHubBuildsUpdater;
import me.mrCookieSlime.Slimefun.cscorelib2.updater.Updater;

import me.waleks.simplematerialgenerators.SMGItemSetup;

import javax.annotation.Nonnull;

public class SimpleMaterialGenerators extends JavaPlugin implements SlimefunAddon {

    private static SimpleMaterialGenerators instance;

    @Override
    public void onEnable() {
        instance = this;

        Config cfg = new Config(this);

         if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("DEV - ")) {
            Updater updater = new GitHubBuildsUpdater(this, getFile(), "waleks647/SMG/master");
            updater.start();
        }

        SMGItemSetup.setup(this);

    }

    @Override
    public void onDisable() {
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/waleks647/SMG/issues";
    }

    @Nonnull
    public static SimpleMaterialGenerators getInstance() {
        return instance;
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

}
