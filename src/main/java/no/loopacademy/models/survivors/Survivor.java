package no.loopacademy.models.survivors;

import no.loopacademy.models.actions.Action;

import java.util.List;

public abstract class Survivor {

    private String name;



    public Survivor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }
}
