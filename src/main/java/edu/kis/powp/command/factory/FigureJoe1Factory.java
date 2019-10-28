package edu.kis.powp.command.factory;

import edu.kis.powp.command.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;


public class FigureJoe1Factory implements FigureFactory {

    @Override
    public DriverCommand getShape(DriverManager driver) {
        FiguresJoe.figureScript1(driver.getCurrentDriver());
        return null;
    }
}
