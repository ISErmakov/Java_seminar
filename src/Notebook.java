import java.util.Random;

public class Notebook {
    int ramMemory;
    int storageMemory;
    String OS;
    String color;

    private static final Random rn = new Random();

    public Notebook(int ramMemory, int storageMemory, String OS, String color){
        this.ramMemory = ramMemory;
        this.storageMemory = storageMemory;
        this.OS = OS;
        this.color = color;
    }

    public Notebook(){
        this.ramMemory = Notebook.rn.nextInt(100) + 1;
        this.storageMemory = Notebook.rn.nextInt(1000) + 1;
        this.OS = "Win10";
        this.color = "Black";
    }

    @Override
    public String toString() {
        return String.format("RAM: %d, Storage: %d, OS: %s, Color: %s", this.ramMemory, this.storageMemory, this.OS, this.color);
    }

}
