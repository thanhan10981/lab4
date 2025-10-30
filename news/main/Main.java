package main;

import agency.*;
import adapter.JSONNewsAdapter;
import observer.Subscriber;

public class Main {
    public static void main(String[] args) {
        // Tạo các cơ quan báo chí
        NewsAgency cnn = new CNNAgency();
        NewsAgency bbc = new BBCAgency();
        NewsAgency jsonAgency = new JSONNewsAdapter();

        // Tạo subscriber
        Subscriber s1 = new Subscriber("Alice");
        Subscriber s2 = new Subscriber("Bob");
        Subscriber s3 = new Subscriber("Charlie");

        // Đăng ký theo dõi
        cnn.attach(s1);
        cnn.attach(s2);
        bbc.attach(s2);
        bbc.attach(s3);
        jsonAgency.attach(s1);
        jsonAgency.attach(s3);

        // Đăng tin
        cnn.publishNews("politics");
        bbc.publishNews("tech");
        jsonAgency.publishNews("any");
    }
}
