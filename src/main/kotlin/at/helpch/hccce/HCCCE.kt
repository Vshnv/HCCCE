package at.helpch.hccce

import org.bukkit.plugin.java.JavaPlugin

class HCCCE : JavaPlugin() {

    override fun onEnable() {
        firstTime()
        // TODO: Register command, would have done but I would have gone over character limit with CommandExecutor implementation
    }
}
