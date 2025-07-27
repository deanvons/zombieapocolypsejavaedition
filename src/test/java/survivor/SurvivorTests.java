package survivor;

import no.loopacademy.models.Survivor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurvivorTests {

    @Test
    void SurvivorShouldBeCreatedWithCorrectName() {

        // Arrange
        String expectedName = "Mervin";

        // Act
        Survivor testSurvivor = new Survivor(expectedName);

        // Assert
        assertEquals(expectedName,testSurvivor.getName());

    }
}
