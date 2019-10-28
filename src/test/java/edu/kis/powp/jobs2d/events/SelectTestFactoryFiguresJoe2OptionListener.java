package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.factory.FigureFactory;
import edu.kis.powp.command.factory.FigureJoe2Factory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFactoryFiguresJoe2OptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFactoryFiguresJoe2OptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FigureFactory ff = new FigureJoe2Factory();
		ff.getShape(driverManager);
	}
}
