package me.john000708.slimexpansion;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;


/**
 * Created by John on 14.04.2016.
 */

public class Items {

    //Items
    public static final SlimefunItemStack UU_MATTER = new SlimefunItemStack("UU_MATTER", Material.PINK_DYE, "&dUU " +
        "物质", "", "&7&o\"纯净能源物质的结晶!\"");
    public static final SlimefunItemStack BEDROCK_DUST = new SlimefunItemStack("BEDROCK_DUST", Material.GUNPOWDER,
        "&8基岩粉");
    public static final SlimefunItemStack LINKER = new SlimefunItemStack("LINKER", Material.CLOCK, "&6连接器", "",
        "&f一个用来连接能量/红石", "&f发射器和连接器的装置.", "");
    public static final SlimefunItemStack MAG_THOR = new SlimefunItemStack("MAG_THOR", Material.IRON_INGOT, "&b&l镁钍合金"
            , "", "&7&o\"一种非常耐用的合金", "&7&o只有在最先进的机器中才能获得\"");

    //Machines
    public static final SlimefunItemStack REDSTONE_RECEIVER = new SlimefunItemStack("REDSTONE_RECEIVER",
        Material.HEAVY_WEIGHTED_PRESSURE_PLATE, "&6红石接收器", "", "&f发出红石信号到",
        "&f已经连接的发射器上");
    public static final SlimefunItemStack REDSTONE_TRANSMITTER = new SlimefunItemStack("REDSTONE_TRANSMITTER",
        Material.IRON_BLOCK, "&c红石发信器", "", "&f发送信号到任何已连接的的红石信号接收器");
    public static final SlimefunItemStack REDSTONE_CLOCK = new SlimefunItemStack("REDSTONE_CLOCK",
        Material.LIGHT_WEIGHTED_PRESSURE_PLATE, "&c红石表", "", "&f功能:", "&f每秒散发出强烈的红石信号");
    public static final SlimefunItemStack UU_FABRICATOR = new SlimefunItemStack("UU_FABRICATOR",
        Material.PURPLE_STAINED_GLASS, "&5物质创造者", "", "&f从纯净能源中提取并创造UU物质", "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &74098 J Buffer", "&8" +
        "\u21E8 &e\u26A1 &71024 J/s");
    public static final SlimefunItemStack UU_TRANSMUTATOR = new SlimefunItemStack("UU_TRANSMUTATOR",
        Material.PINK_STAINED_GLASS, "&cUU反物质突变器", "", "&f用UU物质来形成物品", "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &74098 J Buffer", "&8" +
        "\u21E8 &e\u26A1 &71024 J/s");
    public static final SlimefunItemStack RECYCLER = new SlimefunItemStack("RECYCLER", Material.IRON_BLOCK,
        "&6回收机", "", "&f回收材料到 &6废料盒&f中", "", LoreBuilder.machine(MachineTier.AVERAGE,
        MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7512 J Buffer", "&8\u21E8 &e\u26A1 &732 J/s");
    public static final SlimefunItemStack WIRELESS_CHARGER = new SlimefunItemStack("WIRELESS_CHARGER",
        Material.CYAN_TERRACOTTA, "&b无线充能器", "", "&f无线地给你的物品充能", "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7100 J/s", "&8\u21E8 " +
        "&7Power Loss: &c98%");
    public static final SlimefunItemStack RAIN_MAKER = new SlimefunItemStack("RAIN_MAKER", Material.BLUE_TERRACOTTA,
        "&3制雨机", "", "&f能够掌控天气的机器", "", LoreBuilder.machine(MachineTier.END_GAME,
        MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7512 J/s");
    public static final SlimefunItemStack BEDROCK_BREAKER = new SlimefunItemStack("BEDROCK_BREAKER",
        Material.IRON_BLOCK, "&4基岩毁灭者", "", "&f十分强大的机器", "&f足以破坏&8基岩 &f并碾成碎片", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8" +
        "\u21E8 &e\u26A1 &74096 J/s", "&8⇨ &7需要一个&c基岩钻头 &7来运行");
    public static final SlimefunItemStack DEEP_DEPTH_MINER = new SlimefunItemStack("DEEP_DEPTH_MINER",
        Material.DIAMOND_BLOCK, "&4终极挖矿机", "", "&f这个机器直接从", "&8基岩 &f中提取矿石 还能挖掘一种稀有的放射性物质", "&f元素:&2钍", "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &71024 J/s", "&8\u21E8 " +
        "&7需要一个&c基岩钻头 &7来运行");
    public static final SlimefunItemStack CHUNK_LOADER = new SlimefunItemStack("CHUNK_LOADER",
        Material.ENCHANTING_TABLE, "&5区块加载器", "", "&f一个能够提取", "&2钍&f的能量来使区块加载的机器.", ChatColor.DARK_GRAY +"鸡牌的力量！我的最爱");
    public static final SlimefunItemStack ENERGY_TRANSMITTER = new SlimefunItemStack("ENERGY_TRANSMITTER",
        Material.RED_TERRACOTTA, "&c能量发射器", "", "&f这个发射器可以输出能量", "&f到 &a能量接收器", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Transfer" +
        " Rate: 200 J/s", "&8\u21E8 &c75% Efficiency");
    public static final SlimefunItemStack ENERGY_RECEIVER = new SlimefunItemStack("ENERGY_RECEIVER",
        Material.LIME_TERRACOTTA, "&a能量接收器", "", "&f从&c能量发射器", "&f接收能量 ","", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE));

    //Weapons
    public static final SlimefunItemStack NANO_BLADE = new SlimefunItemStack("NANO_BLADE", Material.DIAMOND_SWORD,
        "&2纳米剑", "", "&f先进科技的结晶", "&f能轻易地穿透任何有机组织.",
        "", "&f开启: &aShift+右键", "", "&8\u21E8 &7Consumes &e2.5J &7per hit", "", "&c&o&8\u21E8 &e\u26A1" +
        " &70 / 500 J");

    //Armor
    public static final SlimefunItemStack ELECTRIC_CHESTPLATE = new SlimefunItemStack("ELECTRIC_CHESTPLATE",
        Material.LEATHER_CHESTPLATE, Color.TEAL, "&9电力装甲", "",
        "&8⇨ &7无视所有玩家受到的伤害", "", "&c&o&8\u21E8 &e\u26A1 &70 / 250 J");

    //Custom Items
    public static final SlimefunItemStack SCRAP_BOX = new SlimefunItemStack("SCRAP_BOX",
        "f34da0cf7eb776ddf29b3e3d7fbd1e32738885229b1a34766e66823c34705552", "&6废料盒");
    public static final SlimefunItemStack EMPTY_CAPSULE = new SlimefunItemStack("EMPTY_CAPSULE",
        "8af2fc9b53a31eb1d574e1759438ad972f1533fb457f1de32bbaea1e7c70", "&3空胶囊");
    public static final SlimefunItemStack IODINE_CHARGE = new SlimefunItemStack("IODINE_CHARGE",
        "ce395bdaf632dcae3951dac1ed473c2541ca27fb1c36183a8dabf7fca58e9e0", "&4充能碘");
    public static final SlimefunItemStack DISSIPATION_CHARGE = new SlimefunItemStack("DISSIPATION_CHARGE",
        "8a50dfd09aef49406f3d953e418dc94841f9d0465aec8d7c858069fc31b4385", "&6充能分散器");
    public static final SlimefunItemStack BEDROCK_DRILL = new SlimefunItemStack("BEDROCK_DRILL",
        "4921f88b35bf1e531ea4d53be83a1ba5dca883743d16d9b1efc69446b62894d4", "&c钻头", "&f特殊的钻头,用来合成 &4基岩毁灭者", "&f来把基岩碾成碎片.", "", "&7Durability: 1024/1024");
    public static final SlimefunItemStack LASER_CHARGE = new SlimefunItemStack("LASER_CHARGE",
        "279f57c68b7a90e0d8850e794ade5b8e810d338e2459eeef9babd6832ca169a", "&c激光充能器", "&f必要的物品来合成", "&4终极挖矿机来 &f挖矿.", "", "&7Durability: 1024/1024");
    public static final SlimefunItemStack THORIUM = new SlimefunItemStack("THORIUM",
        "427d1a6184c62d4c4a67f862b8e19ec001abe4c7d889f23349e8dafe6d033", "&8钍", "",
        LoreBuilder.radioactive(Radioactivity.HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack FOOD_SYNTHESIZER = new SlimefunItemStack("FOOD_SYNTHESIZER",
        "a11a2df7d37af40ed5ce442fd2d78cd8ebcdcdc029d2ae691a2b64395cdf", "&d食品合成器", "", "&f喂食你人造食物.", "&f有两种口味哦!", "", "&c&o&8\u21E8 &e\u26A1 &70 / 100 J");

    static {
        ItemMeta nanoBladeMeta = NANO_BLADE.getItemMeta();
        nanoBladeMeta.setUnbreakable(true);
        NANO_BLADE.setItemMeta(nanoBladeMeta);
    }
}


