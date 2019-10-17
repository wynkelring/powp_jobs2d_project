package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.legacy.drawer.shape.line.AbstractLine;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.LineGeneratorFeature;

import javax.swing.*;
import java.awt.*;

/**
 * driver adapter to drawer with several bugs.
 */
public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = new LineGeneratorFeature(Color.RED, 1.0f, true);
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        this.setPosition(x, y);
        DrawerFeature.getDrawerController().drawLine(line);
    }

    @Override
    public String toString() {
        return "LineDrawerAdapter";
    }
}
