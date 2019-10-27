package edu.kis.powp.command.events;

import edu.kis.powp.command.drivers.DriverCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private int x, y;
    private Job2dDriver jdriver;

    public OperateToCommand(Job2dDriver driver, int x, int y){
        this.x = x;
        this.y = y;
        this.jdriver = driver;
    }

    @Override
    public void execute() {
        jdriver.operateTo(x, y);
    }
}
