package edu.kis.powp.command.builder;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class BuildJoeScript1 extends FigureJoeBuilder {
    DriverManager driverManager;

    @Override
    public void buildDriver(DriverManager dm) {
        driverManager = dm;
    }

    @Override
    public void buildScript() {
        figuresJoe.figureScript1(driverManager.getCurrentDriver());
    }
}
