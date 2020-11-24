package ru.minetown.command.flag.command.flag.service;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import ru.minetown.command.flag.command.flag.listener.CommandFlagListener;
import ru.minetown.command.flag.command.flag.menu.InventoryMenuCreator;

public class CommandFlagService {

    private final InventoryMenuCreator inventoryMenuCreator;
    private final Inventory inventoryMenu;

    public CommandFlagService() {
        inventoryMenuCreator = new InventoryMenuCreator();
        inventoryMenu = inventoryMenuCreator.getInventoryMenu();
        new CommandFlagListener(inventoryMenu);
    }

    public void openMenu(Player player) {
        player.openInventory(inventoryMenu);
    }
}
