package ToyGames;

import java.util.ArrayList;
import java.util.List;

public class StartGames {
    public static void main(String[] args) {


        Toy toy1 = new Toy("Robot", 10, 1);
        Toy toy2 = new Toy("Cars", 25, 1);
        Toy toy3 = new Toy("Pistole", 15, 1);
        Toy toy4 = new Toy("Play_staition", 2, 1);

        toy1.changeWeight(80);



        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);


        StoreToys toyStore = new StoreToys(toys);
        toyStore.saveLottery();





    }

}
