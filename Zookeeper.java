public class Zookeeper {

    public void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }

    public static void main(String[] args){
        Zookeeper zooKeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
        zooKeeper.feed(crocodile);
    }
}
