package me.john000708.slimexpansion.machines;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import me.mrCookieSlime.Slimefun.cscorelib2.protection.ProtectableAction;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Created by John on 02.09.2016.
 */
public class EnergyTransmitter extends SlimefunItem {

    public EnergyTransmitter(Category category, ItemStack item, String name, RecipeType recipeType,
                             ItemStack[] recipe) {
        super(category, item, name, recipeType, recipe);

        new BlockMenuPreset(name, "&c能量发射器") {

            @Override
            public void init() {
                constructMenu(this);
            }

            @Override
            public void newInstance(final BlockMenu menu, final Block block) {
                if (BlockStorage.getLocationInfo(block.getLocation(), "enabled") != null) {
                    if (BlockStorage.getLocationInfo(block.getLocation(), "enabled").equalsIgnoreCase("true")) {
                        menu.replaceExistingItem(13, new CustomItem(Material.GREEN_STAINED_GLASS_PANE, "&a激活"));
                        menu.addMenuClickHandler(13, (player, i, itemStack, clickAction) -> {
                            BlockStorage.addBlockInfo(block, "enabled", "false");
                            newInstance(menu, block);
                            return false;
                        });
                    } else {
                        menu.replaceExistingItem(13, new CustomItem(Material.RED_STAINED_GLASS_PANE, "&c未激活"));
                        menu.addMenuClickHandler(13, (player, i, itemStack, clickAction) -> {
                            BlockStorage.addBlockInfo(block, "enabled", "true");
                            newInstance(menu, block);
                            return false;
                        });
                    }
                } else {
                    BlockStorage.addBlockInfo(block, "enabled", "false");
                    newInstance(menu, block);
                }
            }

            @Override
            public int[] getSlotsAccessedByItemTransport(ItemTransportFlow itemTransportFlow) {
                return new int[0];
            }

            @Override
            public boolean canOpen(Block b, Player p) {
                return p.hasPermission("slimefun.inventory.bypass")
                    || SlimefunPlugin.getProtectionManager().hasPermission(p, b.getLocation(),
                    ProtectableAction.ACCESS_INVENTORIES);
            }
        };
    }

    private void constructMenu(BlockMenuPreset preset) {
        for (int i = 0; i <= 26; i++) {
            preset.addItem(i, new CustomItem(Material.GRAY_STAINED_GLASS_PANE, " "), (player, i1, itemStack,
                                                                                      clickAction) -> false);
        }
    }

}
