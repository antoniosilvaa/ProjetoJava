package Streams.Class;

public class LightNovel {
    private String titel;
    private double price;

    public LightNovel(String titel, double price) {
        this.titel = titel;
        this.price = price;
    }



    @Override
    public String toString() {
        return "LightNovel{" +
                "titel='" + titel + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitel() {
        return titel;
    }

    public double getPrice() {
        return price;
    }
}
