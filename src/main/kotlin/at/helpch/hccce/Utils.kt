package at.helpch.hccce

import org.bukkit.ChatColor
import org.bukkit.command.CommandSender

// start Jaims
fun String.colorize() = ChatColor.translateAlternateColorCodes('&', this)
fun String.chat(sender: CommandSender) = sender.sendMessage(this.colorize())
fun String.log(plugin: HCCCE) = plugin.logger.info(this.colorize())
// end Jaims