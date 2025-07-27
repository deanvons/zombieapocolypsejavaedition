package survivor;

import no.loopacademy.models.survivors.CareGiver;
import no.loopacademy.models.survivors.Survivor;
import no.loopacademy.models.attributes.SurvivorAttributes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurvivorTests {

    @Test
    void survivorShouldBeCreatedWithCorrectName() {

        // Arrange
        String expectedName = "Mervin";

        // Act
        Survivor testSurvivor = new Survivor(expectedName);

        // Assert
        assertEquals(expectedName,testSurvivor.getName());
    }

    @Test
    void caregiverShouldBeCreatedWithCorrectName() {
        // Arrange
        String expectedName = "Melvin";
        // Act
        CareGiver c = new CareGiver(expectedName);
        String actualName = c.getName();
        // Assert
        assertEquals(expectedName,actualName);
    }

    @Test
    void caregiverShouldBeCreatedWithCorrectAttributes() {
        // Arrange
        SurvivorAttributes expectedAttributes = new SurvivorAttributes();
        expectedAttributes.setStrength(2);
        expectedAttributes.setEndurance(6);
        expectedAttributes.setAgility(3);
        expectedAttributes.setCourage(5);
        expectedAttributes.setIntelligence(8);
        expectedAttributes.setLeadership(5);
        expectedAttributes.setTrustworthiness(8);

        // Act
        CareGiver john = new CareGiver("John");
        SurvivorAttributes actualAttributes = john.getAttributes();

        // Assert
        assertEquals(expectedAttributes,actualAttributes);
    }
}
