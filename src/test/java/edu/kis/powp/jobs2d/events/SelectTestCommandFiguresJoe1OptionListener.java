package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.factory.FigureFactory;
import edu.kis.powp.command.factory.FigureJoe1Factory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCommandFiguresJoe1OptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestCommandFiguresJoe1OptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FigureFactory ff = new FigureJoe1Factory();
		ff.getShape(driverManager);
	}
}
