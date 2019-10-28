package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.factory.CircleFactory;
import edu.kis.powp.command.factory.FigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCommandCircleOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestCommandCircleOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FigureFactory ff = new CircleFactory();
		ff.getShape(driverManager).execute();
	}
}
