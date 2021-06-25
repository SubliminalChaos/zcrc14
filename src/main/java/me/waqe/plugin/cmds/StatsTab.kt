package me.waqe.plugin.cmds

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter

class StatsTab : TabCompleter {

    val arguments: MutableList<String> = ArrayList()

    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        alias: String,
        args: Array<out String>
    ): MutableList<String>? {
        if (arguments.isEmpty()) {
            arguments.add("deaths")
            arguments.add("logins")
            arguments.add("mobKills")
            arguments.add("playerKills")
        }
        val result: MutableList<String> = ArrayList()
        if (args.size == 1) {
            for (a in arguments) {
                if (a.toLowerCase().startsWith(args[0].toLowerCase())) result.add(a)
            }
            return result
        }

        return null
    }
}