package edu.kis.powp.command.factory;

import edu.kis.powp.command.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public interface FigureFactory {
    DriverCommand getShape(DriverManager driver);
}
