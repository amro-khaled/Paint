package eg.edu.alexu.csd.oop.draw.controller;

import eg.edu.alexu.csd.oop.draw.DrawingEngine;
import eg.edu.alexu.csd.oop.draw.view.PaintWindow;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorModifierListener implements ChangeListener {

    private final DrawingEngine engine;
    private final JColorChooser chooser;
    private final PaintWindow paintWindow;


    public ColorModifierListener(PaintWindow paintWindow, DrawingEngine engine, JColorChooser chooser){
        this.paintWindow = paintWindow;
        this.engine = engine;
        this.chooser = chooser;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // TODO Auto-generated method stub
        engine.setColor(chooser.getColor());
        paintWindow.repaint();
    }

}
