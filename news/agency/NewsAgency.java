package agency;

import java.util.ArrayList;
import java.util.List;
import core.News;
import observer.Observer;
import observer.Subject;

public abstract class NewsAgency implements Subject {
    private List<Observer> subscribers = new ArrayList<>();
    protected News latestNews;

    @Override
    public void attach(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void detach(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : subscribers) {
            o.update(latestNews);
        }
    }

    public void publishNews(String type) {
        latestNews = createNews(type);
        System.out.println("\n🏢 " + getClass().getSimpleName() + " đăng tin mới:");
        latestNews.display();
        notifyObservers();
    }

    protected abstract News createNews(String type);
}
