public class Main {
   public static void main(String[] args) {
         ElectricGuitar guitar = new ElectricGuitar();
         guitar.play();
         guitar = new ElectricGuitar(7);
         guitar.play();
    }
}