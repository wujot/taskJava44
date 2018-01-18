public class ComputerTest {

    public static void main(String[] args) {

        // first computer
        Procesor processor1 = new Procesor("Intel Celeron", "G3930", "2900 MHz");
        Memory memory1 = new Memory("Goodram", "DDR3 DIMM ", "4 GB", "1333 MHz");
        Computer computer1 = new Computer("Intel", processor1, memory1);

        // second computer
        Procesor processor2 = new Procesor("AMD FX ", "FX-6300", "3500 MHz");
        Memory memory2 = new Memory("Kingston","DDR3 DIMM", "8 GB", "1333 MHz");
        Computer computer2 = new Computer("Acer", processor2, memory2);
    }

}
