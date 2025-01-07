interface Animal {
    void sound();
    void swim();
}

interface Swimmer {
    void swim();
}

abstract class Mammal {
    abstract  void sound();
}

class Dolphin extends Mammal implements Animal, Swimmer {
    public void sound() {
        System.out.println("Dolphin makes a sound");
    }

    public void swim() {
        System.out.println("Dolphin swims");
    }
}

public class Test {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        dolphin.sound();  // Outputs: Dolphin makes a sound
        dolphin.swim();   // Outputs: Dolphin swims
    }
}