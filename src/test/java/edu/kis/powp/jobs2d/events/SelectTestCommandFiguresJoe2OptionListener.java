package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.factory.FigureJoeFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCommandFiguresJoe2OptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestCommandFiguresJoe2OptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FigureJoeFactory.figureScript2(driverManager.getCurrentDriver());
	}
}
