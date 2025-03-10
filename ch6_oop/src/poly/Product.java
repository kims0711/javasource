package poly;

public class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }

}

class Tv extends Product { // 처음에 만들면 default 생성자랑 super 갖고 있다

    public Tv() {

        super(1000);
    }

    @Override
    public String toString() {
        return "Tv";
    }

}

class Computer extends Product {

    public Computer() {
        super(5000);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    public Audio() {
        super(1500);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}
