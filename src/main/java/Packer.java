public class Packer {
    private Factory factory;

    public Packer() {
        this.factory = new Factory();
    }

    public Box givABoxOfThings() {
        Box box = new Box(100.0);

        int i = 0;
        while (i < 10) {
            Packable newThing = factory.produceNew();
            box.add(newThing);

            i += 1;
        }
        return box;
    }
}
