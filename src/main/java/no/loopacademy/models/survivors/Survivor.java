package no.loopacademy.models.survivors;

import no.loopacademy.models.attributes.SurvivorAttributes;
import no.loopacademy.models.items.Item;
import no.loopacademy.models.skills.Skill;
import no.loopacademy.models.actions.Action;

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

        for (Item i : gear) {
            currentLoad += i.getWeight();
        }

        if (currentLoad + item.getWeight() > currentMaxLoadCapacity) {
            throw new Exception("Too much weight");
        } else {
            gear.add(item);
        }
    }

    private double getMaxLoad() {
        return 10 + attributes.getStrength() * 3;
    }

    public double performAction(Action action) {

        double effectiveness = 0.0;

        double strengthContrib = attributes.getStrength() * action.getAttributeWeights().getStrength();
        double agilityContrib = attributes.getAgility() * action.getAttributeWeights().getAgility();
        double trustContrib = attributes.getTrustworthiness() * action.getAttributeWeights().getTrustworthiness();
        double intelContrib = attributes.getIntelligence() * action.getAttributeWeights().getIntelligence();
        double courContrib = attributes.getCourage() * action.getAttributeWeights().getCourage();
        double enduranceContrib = attributes.getEndurance() * action.getAttributeWeights().getEndurance();
        double leadContrib = attributes.getLeadership() * action.getAttributeWeights().getLeadership();

        effectiveness += (strengthContrib + agilityContrib + trustContrib + intelContrib + courContrib + enduranceContrib + leadContrib) * 10;

        return effectiveness;
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
