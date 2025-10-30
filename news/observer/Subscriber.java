package observer;


import core.News;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(News news) {
        System.out.println("👤 " + name + " nhận tin mới: " + news.getTitle());
    }
}
