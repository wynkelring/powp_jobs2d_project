package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.factory.FigureFactory;
import edu.kis.powp.command.factory.RectFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCommandRectOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestCommandRectOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FigureFactory ff = new RectFactory();
		ff.getShape(driverManager).execute();
	}
}
