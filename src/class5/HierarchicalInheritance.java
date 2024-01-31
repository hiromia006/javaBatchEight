package class5;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Veloce veloce=new Veloce();
        veloce.speed=20;
        veloce.applyBrake(5);

        Phonix phonix=new Phonix();
        phonix.speed=15;
        phonix.applyBrake(8);
        phonix.speedUp(9);
    }
}
