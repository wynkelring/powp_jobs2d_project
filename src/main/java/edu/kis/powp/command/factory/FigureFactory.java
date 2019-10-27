package edu.kis.powp.command.factory;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.events.OperateToCommand;
import edu.kis.powp.jobs2d.Job2dDriver;


public class FigureFactory {
    private ComplexCommand complexCommand;
    private Job2dDriver j2d;

    public DriverCommand getRect(){
        complexCommand.addCommand(new OperateToCommand(j2d, 0, 0));
        complexCommand.addCommand(new OperateToCommand(j2d, 0, 30));
        complexCommand.addCommand(new OperateToCommand(j2d, 30, 0));
        complexCommand.addCommand(new OperateToCommand(j2d, 20, 20));

        return complexCommand;
    }

    public void getCircle(){

    }
}
