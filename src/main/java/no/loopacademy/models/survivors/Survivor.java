package no.loopacademy.models.survivors;

import no.loopacademy.models.attributes.SurvivorAttributes;
import no.loopacademy.models.items.Item;
import no.loopacademy.models.skills.Skill;

import java.util.ArrayList;
import java.util.List;

public abstract class Survivor {

    private String name;

    private List<Skill> skills = new ArrayList<>();

    private List<Item> gear = new ArrayList<>();

    SurvivorAttributes attributes;

    public Survivor(String name) {
        this.name = name;
    }

    public void load(Item item) throws Exception {
        double currentMaxLoadCapacity = getMaxLoad();
        double currentLoad = 0;

        for(Item i : gear) {
            currentLoad += i.getWeight();
        }

        if(currentLoad + item.getWeight() > currentMaxLoadCapacity) {
            throw new Exception("Too much weight");
        } else {
            gear.add(item);
        }
    }

    private double getMaxLoad() {
        return 10 + attributes.getStrength()*3;
    }

    // Getters and setters
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

    public List<Item> getGear() {
        return gear;
    }

    public void setGear(List<Item> gear) {
        this.gear = gear;
    }
}
