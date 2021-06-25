package me.waqe.plugin.cmds

import org.bukkit.ChatColor
import org.bukkit.Statistic
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class StatsCmd : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender !is Player) return true
        if (args.isEmpty()) {
            sender.sendMessage("Usage: /mystats {deaths/logins/mobKills/playerKills}")
            return true
        }
        if (args.size >= 1) {
            if (args[0].equals("deaths", true)) {
                sender.sendMessage("${ChatColor.AQUA} You have "
                        + sender.getStatistic(Statistic.DEATHS)
                        + " deaths.")
                return true
            }
            if (args[0].equals("logins", true)) {
                sender.sendMessage("${ChatColor.AQUA} You have "
                        + (sender.getStatistic(Statistic.LEAVE_GAME) + 1)
                        + " logins.")
                return true
            }
            if (args[0].equals("mobKills", true)) {
                sender.sendMessage("${ChatColor.AQUA} You have "
                        + sender.getStatistic(Statistic.MOB_KILLS)
                        + " mob kills.")
                return true
            }
            if (args[0].equals("playerKills", true)) {
                sender.sendMessage("${ChatColor.AQUA} You have "
                        + sender.getStatistic(Statistic.PLAYER_KILLS)
                        + " pvp kills.")
                return true
            }
        }

        return false
    }
}