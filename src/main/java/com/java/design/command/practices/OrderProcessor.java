package com.java.design.command.practices;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date 9:39 AM 4/19/2023
 */
public class OrderProcessor {
    private List<OrderCommand> commandList = new ArrayList<>();

    public void addCommand(OrderCommand command) {
        commandList.add(command);
    }

    public void processCommands() {
        for (OrderCommand command : commandList) {
            command.execute();
        }
        commandList.clear();
    }

    public void undoLastCommand() {
        if (commandList.size() > 0) {
            OrderCommand lastCommand = commandList.get(commandList.size() - 1);
            lastCommand.undo();
            commandList.remove(lastCommand);
        }
    }
}
