package de.erdlet.controller;

import javax.mvc.RedirectScoped;
import java.io.Serializable;

@RedirectScoped
public class RedirectValues implements Serializable {

    private static final long serialVersionUID = -7328415091734793229L;

    private double output;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(final double output) {
        this.output = output;
    }
}
