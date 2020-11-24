package ru.minetown.command.flag.command.flag.menu;

import java.util.Arrays;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryMenuCreator {

    public Inventory getInventoryMenu() {
        Inventory inventory = Bukkit.createInventory(null, 9, "Выберите флаг");
        return initInventory(inventory);
    }

    private Inventory initInventory(Inventory inventory) {
        inventory.addItem(createMenuItem(Material.BLACK_BANNER, "Установить черный флаг", "??!!"));
        inventory.addItem(createMenuItem(Material.BLUE_BANNER, "Установить синий флаг", "!!??"));
        return inventory;
    }

    private ItemStack createMenuItem(Material material, String name, String... lore) {
        ItemStack item = new ItemStack(material, 1);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(name);
            meta.setLore(Arrays.asList(lore));
            item.setItemMeta(meta);
        }
        return item;
    }

}
