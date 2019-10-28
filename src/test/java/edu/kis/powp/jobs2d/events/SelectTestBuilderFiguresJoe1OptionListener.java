package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.builder.BuildJoeScript1;
import edu.kis.powp.command.builder.FigureJoeBuilder;
import edu.kis.powp.command.builder.FigureJoeDirector;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestBuilderFiguresJoe1OptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestBuilderFiguresJoe1OptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FigureJoeDirector director = new FigureJoeDirector();
		FigureJoeBuilder script1 = new BuildJoeScript1();
		director.setFigureJoeBuilder(script1);
		director.constructFigureJoe(driverManager);
	}
}
