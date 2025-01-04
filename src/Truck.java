public class  Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем грузовик " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку для колеса #" + (i + 1));
        }
        checkEngine();
        checkTrailer();
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель грузовика.");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика.");
    }

    // Перегрузка метода
    public void checkTrailer(boolean detailedCheck) {
        if (detailedCheck) {
            System.out.println("Проводим детальную проверку прицепа грузовика.");
        } else {
            System.out.println("Проверяем прицеп на базовом уровне.");
        }
    }
}
