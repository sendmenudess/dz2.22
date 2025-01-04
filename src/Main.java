public class Main {
    public static void main(String[] args) {

        Bicycle bike = new Bicycle("Slels", 2);
        bike.updateTyre();
        bike.updateTyre(1);
        Car car = new Car("Sedan", 4);
        car.updateTyre();
        car.checkEngine();
        car.checkEngine(true); // Перегрузка метода
        ServiceStation station = new ServiceStation();

        Car car1 = new Car("Sedan", 4);
        Bicycle bicycle = new Bicycle("Mountain Bike", 2);
        Truck truck = new Truck("MAN", 6);

        station.check(car1);      // Обслуживаем машину
        station.check(bicycle);  // Обслуживаем велосипед
        station.check(truck);    // Обслуживаем грузовик
        Truck truck1 = new Truck("Zitruck", 6);

        truck1.service();              // Полный процесс обслуживания
        truck1.checkTrailer(true);     // Перегрузка метода для детальной проверки

        Vehicle car2 = new Car("car2", 4);

        Vehicle truck2 = new Truck("truck2", 8);

        Vehicle bicycle1 = new Bicycle("bicycle1", 2);
        Vehicle bicycle2 = new Bicycle("bicycle2", 2);

        // Создание сервисной станции
        ServiceStation station1 = new ServiceStation();
        // Проверка транспорта
        station1.check(car1);
        station1.check(car2);
        station1.check(bicycle1);
        station1.check(bicycle2);
        station1.check(truck1);
        station1.check(truck2);
    }
}