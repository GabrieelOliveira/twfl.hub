package br.com.twinsflammer.hub.bungee.data;

import lombok.Builder;
import lombok.Data;
import org.bukkit.inventory.ItemStack;

/**
 * @author Gabrieel
 */
@Builder
@Data
public class BungeeServer {

    private final String server;
    private final String displayName;
    private final ItemStack displayItem;
    private final int slot;

}