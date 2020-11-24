package ru.minetown.command.flag.command.flag.executor;

import com.google.common.base.Optional;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.minetown.command.flag.command.flag.service.CommandFlagService;

public class CommandFlagExecutor implements CommandExecutor {

    private final CommandFlagService commandFlagService;

    public CommandFlagExecutor() {
        commandFlagService = new CommandFlagService();
    }

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Optional<Player> playerOptional = getSenderAsPlayer(commandSender);
        if (playerOptional.isPresent()) {
            commandFlagService.openMenu(playerOptional.get());
            return true;
        } else {
            return false;
        }
    }

    private Optional<Player> getSenderAsPlayer(CommandSender commandSender) {
        try {
            Player player = (Player) commandSender;
            return Optional.of(player);
        } catch (Exception e) {
            return Optional.absent();
        }
    }


}
