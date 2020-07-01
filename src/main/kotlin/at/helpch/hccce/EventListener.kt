package at.helpch.hccce

import org.bukkit.event.*
import org.bukkit.plugin.Plugin
import org.bukkit.plugin.RegisteredListener
import kotlin.reflect.KClass

// Yugi Start
private val listener = object: Listener{}

/**
 * Shorter event listener declaration
 */
fun <T, E> T.listenTo(
        eventClass: KClass<E>,
        ignoreCancelled: Boolean = false,
        priority: EventPriority = EventPriority.NORMAL,
        onEvent: (e: E) -> Unit
) where T: Plugin, E: Event {

    val regListener = RegisteredListener(
            listener,
            { _, event ->
                if (event.javaClass == eventClass.java) onEvent(event as E)
            },
            priority,
            this,
            ignoreCancelled)

    HandlerList.getHandlerLists().forEach {
        it.register(regListener)
    }
}
// Yugi End