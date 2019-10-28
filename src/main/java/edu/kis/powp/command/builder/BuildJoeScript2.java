package edu.kis.powp.command.builder;

import edu.kis.powp.jobs2d.drivers.DriverManager;

public class BuildJoeScript2 extends FigureJoeBuilder {
    DriverManager driverManager;

    @Override
    public void buildDriver(DriverManager dm) {
        driverManager = dm;
    }

    @Override
    public void buildScript() {
        figuresJoe.figureScript2(driverManager.getCurrentDriver());
    }
}
