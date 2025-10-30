package adapter;

import agency.NewsAgency;
import core.News;

public class JSONNewsAdapter extends NewsAgency {
    private JSONNewsFeed feed = new JSONNewsFeed();

    @Override
    protected News createNews(String type) {
        String json = feed.fetchJSONNews();
        String title = json.contains("title") ? "JSON Feed News" : "Unknown";
        String content = json.contains("content") ? "Breaking news from JSON API!" : "No content.";
        return new News(title, content) {};
    }
}
