public class ComputerAssembly {


    Computer assembly(String computerName, String processorName, String make, double clockSignal,
                      String memoryProducer, String memoryMake, String quantity, double memoryClockSignal) {
        return new Computer(computerName, new Procesor(processorName, make, clockSignal),
                new Memory(memoryProducer, memoryMake, quantity, memoryClockSignal));
    }
}
