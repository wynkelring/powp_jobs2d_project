package edu.kis.powp.command.drivers;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> complexCommands = new ArrayList();

    public ComplexCommand(List<DriverCommand> commands){
        this.complexCommands = commands;
    }

    public ComplexCommand() {

    }

    public void addCommand(DriverCommand command) {
        if(command != null) {
            complexCommands.add(command);
        }
    }

    @Override
    public void execute() {
        if(complexCommands != null) {
            for (DriverCommand command : complexCommands) {
                command.execute();
            }
        }
    }
}
