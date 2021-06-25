package me.waqe.plugin

import me.waqe.plugin.cmds.StatsCmd
import me.waqe.plugin.cmds.StatsTab
import me.waqe.plugin.cmds.VersionCmd
import me.waqe.plugin.events.JoinEvent
import org.bukkit.ChatColor
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin


class App : JavaPlugin(), Listener {
    companion object {
        lateinit var instance: App
    }

    override fun onEnable() {
        instance = this
        //this.reloadConfig()
        //this.saveDefaultConfig()

        server.pluginManager.registerEvents(JoinEvent(this), this)
        getCommand("version")?.setExecutor(VersionCmd())
        getCommand("mystats")?.setExecutor(StatsCmd())
        getCommand("mystats")?.tabCompleter = StatsTab()

    }

    override fun onDisable() {

    }

    @SuppressWarnings
    private fun String.red(): String {
        return this + ChatColor.RED
    }

    @SuppressWarnings
    private fun String.darkgrey(): String {
        return this + ChatColor.DARK_GRAY
    }

    @SuppressWarnings
    private fun String.cyan(): String {
        return this + ChatColor.BLUE
    }

    @SuppressWarnings
    private fun String.darkpurple(): String {
        return this + ChatColor.DARK_PURPLE
    }

    @SuppressWarnings
    private fun String.purple(): String {
        return this + ChatColor.LIGHT_PURPLE
    }

    @SuppressWarnings
    private fun String.gold(): String {
        return this + ChatColor.GOLD
    }

    @SuppressWarnings
    private fun String.green(): String {
        return this + ChatColor.GREEN
    }

    @SuppressWarnings
    private fun String.darkgreen(): String {
        return this + ChatColor.DARK_GREEN
    }

    @SuppressWarnings
    private fun String.darkred(): String {
        return this + ChatColor.DARK_RED
    }

    @SuppressWarnings
    private fun String.gray(): String {
        return this + ChatColor.GRAY
    }

    @SuppressWarnings
    private fun String.darkblue(): String {
        return this + ChatColor.DARK_BLUE
    }

    @SuppressWarnings
    private fun String.bold(): String {
        return this + ChatColor.BOLD
    }

    @SuppressWarnings
    private fun String.blue(): String {
        return this + ChatColor.BLUE
    }

}
