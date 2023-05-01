package ToyGames;

 
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class StoreToys {
    public List<Toy> toys;


    public StoreToys(List<Toy> toys) {
        this.toys = toys;
    }
    
    public Toy getToyPrice() {
        RandomaysToy random = new RandomaysToy();
        Toy toy = random.chooseOnWeight(toys);
        return toy;
    }


    public void saveLottery() {
        Toy toy = getToyPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("ToyGames/ToysList.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {


            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }


}

