package edu.kis.powp.command.builder;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public abstract class FigureJoeBuilder {
    protected FiguresJoe figuresJoe;

    public FiguresJoe getFiguresJoe(){
        return figuresJoe;
    }

    public void createNewFigureJoe(){
        figuresJoe = new FiguresJoe();
    }

    public abstract void buildDriver(DriverManager dm);
    public abstract void buildScript();
}
