public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int squares() {
        return this.squares;
    }

    public int pricePerSquare() {
        return this.pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares <= compared.squares()) {
            return false;
        }
        return true;
    }

    public int totalPrice() {
        return this.squares * this.pricePerSquare;
    }

    public int priceDifference(Apartment compared) {
        if (totalPrice() < compared.totalPrice()) {
            return compared.totalPrice() - totalPrice();
        }
        return totalPrice() - compared.totalPrice();
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (totalPrice() <= compared.totalPrice()) {
            return false;
        }
        return true;
    }
}
