public class Overclock {

    void increaseCpuClock(Computer computer, double clockSignal) {
        computer.processor.clockSignal= computer.processor.clockSignal + clockSignal;
    }

    void decreaseCpuClock(Computer computer, double clockSignal) {
        computer.processor.clockSignal = computer.processor.clockSignal - clockSignal;
    }
}
