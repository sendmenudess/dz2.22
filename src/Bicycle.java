public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку для велосипеда.");
    }


    public void updateTyre(int wheelIndex) {
        System.out.println("Меняем покрышку для колеса №" + wheelIndex);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем велосипед " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку для колеса #" + (i + 1));
        }
    }
}
