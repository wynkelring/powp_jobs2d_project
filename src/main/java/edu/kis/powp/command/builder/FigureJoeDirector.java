package edu.kis.powp.command.builder;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class FigureJoeDirector {
    private FigureJoeBuilder figureJoeBuilder;

    public void setFigureJoeBuilder(FigureJoeBuilder joeBuilder){
        figureJoeBuilder = joeBuilder;
    }

    public FiguresJoe getFigureJoe(){
        return figureJoeBuilder.getFiguresJoe();
    }

    public void constructFigureJoe(DriverManager dm){
        figureJoeBuilder.buildDriver(dm);
        figureJoeBuilder.buildScript();
    }


}
