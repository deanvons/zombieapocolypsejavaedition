package no.loopacademy.models.survivors;

import no.loopacademy.models.actions.Action;
import no.loopacademy.models.skills.Skill;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Survivor {

    private String name;

    private List<Skill> skills = new ArrayList<>();

    public Survivor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
