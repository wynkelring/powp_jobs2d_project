package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.builder.BuildJoeScript2;
import edu.kis.powp.command.builder.FigureJoeBuilder;
import edu.kis.powp.command.builder.FigureJoeDirector;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestBuilderFiguresJoe2OptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestBuilderFiguresJoe2OptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FigureJoeDirector director = new FigureJoeDirector();
		FigureJoeBuilder script2 = new BuildJoeScript2();
		director.setFigureJoeBuilder(script2);
		director.constructFigureJoe(driverManager);
	}
}
