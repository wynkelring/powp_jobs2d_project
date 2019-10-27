package edu.kis.powp.command;

import edu.kis.powp.command.DriverCommand;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> complexCommands = new ArrayList();

    public ComplexCommand(List<DriverCommand> commands){
        this.complexCommands = commands;
    }

    public void addCommand(DriverCommand command) {
        complexCommands.add(command);
    }

    @Override
    public void execute() {
        for(DriverCommand command : complexCommands){
            command.execute();
        }
    }
}
