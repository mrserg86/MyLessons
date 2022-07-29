public class Runner {

    public static void main(String[] args) {

        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        //event subscribe
        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        switcher.addElectricityListener( () -> System.out.println("Пожар") );

        switcher.switchOn();

    }

}
