package edu.kis.powp.command.factory;

import edu.kis.powp.command.drivers.DriverCommand;
import edu.kis.powp.command.drivers.ComplexCommand;
import edu.kis.powp.command.events.OperateToCommand;
import edu.kis.powp.command.events.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.util.ArrayList;
import java.util.List;


public class FigureFactory {

    public static DriverCommand getRect(DriverManager driver){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(driver.getCurrentDriver(), -200, -200));
        complexCommand.addCommand(new OperateToCommand(driver.getCurrentDriver(), -200, 200));
        complexCommand.addCommand(new OperateToCommand(driver.getCurrentDriver(), 200, 200));
        complexCommand.addCommand(new OperateToCommand(driver.getCurrentDriver(), 200, -200));
        complexCommand.addCommand(new OperateToCommand(driver.getCurrentDriver(), -200, -200));

        return complexCommand;
    }

    public static DriverCommand getCircle(DriverManager driver){
        List<DriverCommand> driverCommands = new ArrayList<>();

        int r = 100;

        driverCommands.add(new SetPositionCommand(driver.getCurrentDriver(),r, 0));

        for(int i = 0;  i < 360;  i++) {
            int x = (int)(r * Math.cos(i));
            int y = (int)(r * Math.sin(i));
            driverCommands.add(new OperateToCommand(driver.getCurrentDriver(), x, y));
        }

        driverCommands.add(new OperateToCommand(driver.getCurrentDriver(), r, 0));

        ComplexCommand complexCommand = new ComplexCommand(driverCommands);

        return complexCommand;
    }
}
