public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    public int tacoRemaining() {
        return this.tacos;
    }

    public void eat() {
        this.tacos -= 1;
    }
}
