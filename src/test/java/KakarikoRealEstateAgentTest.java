import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.KakarikoRealEstateAgent;

public class KakarikoRealEstateAgentTest {

    private KakarikoRealEstateAgent agent;

    @BeforeEach
    void setUp() {
        agent = new KakarikoRealEstateAgent("Impa's Apprentice", "Sheikah Realty", 5, "Sheikah-inspired architecture");
    }

    @Test
    void testListProperty() {
        agent.listProperty("Cozy Cottage", 500);
        // Since the method only prints, verify manually or refactor to add verifiable functionality.
    }

    @Test
    void testSellProperty() {
        agent.sellProperty("Link", 450);
        assertEquals(450, agent.getRupeesEarned());
    }

    @Test
    void testOfferDiscount() {
        agent.offerDiscount(50);
        // Verify manually or adapt method to track discounts for automated tests.
    }

    @Test
    void testProfileDetails() {
        assertEquals("Impa's Apprentice", agent.getName());
        assertEquals("Sheikah Realty", agent.getAgencyName());
        assertEquals(5, agent.getExperienceYears());
        assertEquals("Sheikah-inspired architecture", agent.getSpecialty());
    }
}
