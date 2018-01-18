public class ComputerTest {

    public static void main(String[] args) {

        // first computer
        Procesor processor1 = new Procesor("Intel Celeron", "G3930", 2900);
        Memory memory1 = new Memory("Goodram", "DDR3 DIMM ", "4 GB", 1333);
        Computer computer1 = new Computer("Intel", processor1, memory1);

        // second computer
        Procesor processor2 = new Procesor("AMD FX ", "FX-6300", 3500);
        Memory memory2 = new Memory("Kingston","DDR3 DIMM", "8 GB", 1333);
        Computer computer2 = new Computer("Acer", processor2, memory2);

        Overclock over = new Overclock();

        // print objects
        System.out.println("Computers before changes:");
        System.out.println(computer1.name + ", " + computer1.processor.clockSignal);
        System.out.println(computer2.name + ", " + computer2.processor.clockSignal);
        System.out.println("");
        System.out.println("Increase computers clock signal:");
        over.increaseCpuClock(computer1, 100);
        over.increaseCpuClock(computer2, 100);
        System.out.println(computer1.name + ", " + computer1.processor.clockSignal);
        System.out.println(computer2.name + ", " + computer2.processor.clockSignal);
        System.out.println("");
        System.out.println("Decrease computers clock signal:");
        over.decreaseCpuClock(computer1, 100);
        over.decreaseCpuClock(computer2, 100);
        System.out.println(computer1.name + ", " + computer1.processor.clockSignal);
        System.out.println(computer2.name + ", " + computer2.processor.clockSignal);
        System.out.println("");

        // create computer with help of assembly method
        ComputerAssembly ass = new ComputerAssembly();
        ass.assembly("Acer", "Intel", "G3930", 3500,
                "Kingston", "G4567", "8 GB", 1333);

        // print the result of assembly computer
    }

}
