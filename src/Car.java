public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку для машины.");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины.");
    }

    public void checkEngine(boolean detailedCheck) {
        if (detailedCheck) {
            System.out.println("Проводим детальную проверку двигателя.");
        } else {
            System.out.println("Проверяем двигатель на базовом уровне.");
        }
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем машину " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку для колеса #" + (i + 1));
        }
        System.out.println("Проверяем двигатель машины.");
    }
}
