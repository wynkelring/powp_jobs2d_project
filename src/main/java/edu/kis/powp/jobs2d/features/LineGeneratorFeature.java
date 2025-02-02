package edu.kis.powp.jobs2d.features;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class LineGeneratorFeature extends AbstractLine {
    public LineGeneratorFeature(){
        super();
        color = Color.BLACK;
        thickness = 3.0f;
        dotted = false;
    }
    public LineGeneratorFeature(Color whatColor, float whatThickness, boolean isDotted) {
        super();
        color = whatColor;
        thickness = whatThickness;
        dotted = isDotted;
    }
}
