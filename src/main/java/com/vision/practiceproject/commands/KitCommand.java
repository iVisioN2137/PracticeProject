package com.vision.practiceproject.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class KitCommand implements CommandExecutor {

        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (!(sender instanceof Player)) {
                return false;
            }

            if (args.length == 1) {
                sender.sendMessage("Choose kit you want to get");
                return false;
            }

            if (sender instanceof Player) {
                Player player = (Player) sender;

                if(args[1].equals("warrior")) {
                    ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD);
                    ItemStack leatherHelmet = new ItemStack(Material.LEATHER_HELMET);

                    player.getInventory().addItem(diamondSword, leatherHelmet);

                    return false;
                }
            }

            return true;
        }
    }
}
