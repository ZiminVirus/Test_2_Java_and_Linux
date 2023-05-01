package ToyGames;


public class Toy {
    int id;
    String name;
    double weight;
    int quantity;
    static int num;

    static {
        int num = 0;
    }


    public Toy(String name, double weight, int quantity) {
        this.id = id + 1 + num;
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
        num = id;
    }


    public void setWeight(float weight) {
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }

    public double changeWeight (double newWeight) {
        weight = newWeight;
        return weight;

    }

    public double addToy (String name, int quantity, double Weight) {
        new Toy(name, Weight, quantity);

        return weight;

    }


    @Override
    public String toString() {
        return "Toy [id=" + id + ", name=" + name + ", quantity=" + quantity + ", weight=" + weight + "]";
    }
}

