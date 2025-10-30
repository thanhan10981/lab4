package agency;

import core.*;

public class BBCAgency extends NewsAgency {
    @Override
    protected News createNews(String type) {
        switch (type.toLowerCase()) {
            case "politics":
                return new PoliticsNews("UK Parliament", "New policy on education.");
            case "sports":
                return new SportsNews("Premier League", "Manchester United wins!");
            case "tech":
                return new TechNews("Space Tech", "NASA announces Mars mission.");
            default:
                return new News("General News", "No specific type.") {};
        }
    }
}
