package agency;

import core.*;

public class CNNAgency extends NewsAgency {
    @Override
    protected News createNews(String type) {
        switch (type.toLowerCase()) {
            case "politics":
                return new PoliticsNews("US Election", "New president elected.");
            case "sports":
                return new SportsNews("World Cup", "Team USA wins gold medal!");
            case "tech":
                return new TechNews("AI Revolution", "AI surpasses human IQ!");
            default:
                return new News("General News", "No specific type.") {};
        }
    }
}
