package me.john000708.slimexpansion;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import org.bukkit.Material;

/**
 * Created by John on 17.04.2016.
 */
public class CustomRecipeType {

    public static final RecipeType RECYCLER;
    public static final RecipeType UU_FABRICATOR;
    public static final RecipeType DEEP_MINER;
    public static final RecipeType BEDROCK_BREAKER;

    static {
        RECYCLER = new RecipeType(new CustomItem(Material.IRON_BLOCK, "&c回收机", 1, new String[]{"", "&a&o把任何材料放进去,你就会得到废料"}));
        DEEP_MINER = new RecipeType(new CustomItem(Material.BEACON, "&a终极挖矿机", 1, new String[]{"", "&a&o挖取沉淀在矿物上的钍"}));
        BEDROCK_BREAKER = new RecipeType(new CustomItem(Material.IRON_BLOCK, "&a基岩毁灭者", 1, new String[]{"", "&a&o用基岩毁灭者来挖掘获得"}));
        UU_FABRICATOR = new RecipeType(new CustomItem(Material.PURPLE_STAINED_GLASS, "&a物质创造者", new String[]{"", "&a&o由物质创造者产生"}));
    }
}
