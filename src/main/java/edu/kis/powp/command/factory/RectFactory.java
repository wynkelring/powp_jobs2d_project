package edu.kis.powp.command.factory;

import edu.kis.powp.command.drivers.DriverCommand;
import edu.kis.powp.command.drivers.ComplexCommand;
import edu.kis.powp.command.events.OperateToCommand;
import edu.kis.powp.command.events.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;


public class RectFactory implements FigureFactory {
    private ComplexCommand complexCommand = new ComplexCommand();

    public DriverCommand getShape(DriverManager driver){
        complexCommand.addCommand(new SetPositionCommand(driver.getCurrentDriver(), -200, -200));
        complexCommand.addCommand(new OperateToCommand(driver.getCurrentDriver(), -200, 200));
        complexCommand.addCommand(new OperateToCommand(driver.getCurrentDriver(), 200, 200));
        complexCommand.addCommand(new OperateToCommand(driver.getCurrentDriver(), 200, -200));
        complexCommand.addCommand(new OperateToCommand(driver.getCurrentDriver(), -200, -200));

        return complexCommand;
    }

}
