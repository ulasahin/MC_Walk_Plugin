package org.walkplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public class YuruCommand implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command yuru, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("Bu komutu konsolda kullanamassınız.");
            return true;
        }
        if (args.length > 1) {
            sender.sendMessage(ChatColor.RED + "Bu komutun kullanımı '/yuru <on/off>' şeklindedir.");
            return true;
        }
        if(args[0].equals("on")){
            player.setWalkSpeed(0.1F);
        }
        if(args[0].equals("off")){
            player.setWalkSpeed(0.2F);
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        return List.of();
    }
}
