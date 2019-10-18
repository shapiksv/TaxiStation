import Cars.AutoTransport;
import Cars.Car;
import Cars.SportCar;

import java.util.*;
import CarClasses.ClosedCarBody;
import Cars.UtilitVehicle;

import static CarClasses.ClosedCarBody.*;
import static CarClasses.CombinedCarBody.*;
import static CarClasses.OpenCarBody.*;



public class TaxiStation {

//    Задание. Создать консольное приложение, удовлетворяющее следующим требованиям:
//
//    Каждый класс должен иметь отражающее смысл название и информативный состав.
//    Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
//    Наследование должно применяться только тогда, когда это имеет смысл.
//    При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//    Классы должны быть грамотно разложены по пакетам
//    Консольное меню должно быть минимальным.
//    Для хранения параметров инициализации можно использовать файлы.

//    10. Таксопарк. Определить иерархию легковых автомобилей. Создать таксопарк. Подсчитать стоимость автопарка.
//    Провести сортировку автомобилей парка по расходу топлива. Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.



    public static void main(String[] args) {
        List<AutoTransport> cars = new ArrayList<>();
        cars.add(new Car("BMW","E52",8.5,4000,240, SEDAN));
        cars.add(new Car("Mersedes","W300",12.2,6000,260,STATION_WAGON));
        cars.add(new Car("ВАЗ","2011",10.2,600,60,HATCHBACK));
        cars.add(new SportCar("ferrari", "488",11.5,1000000,340,ROADSTER));
        cars.add(new SportCar("porsche", "boxster",14.3,980000,330,CBRIOLET));
        cars.add(new UtilitVehicle("mitsubishi", "l200", 19.3,30000,200,800,PICKUP));
        cars.add(new UtilitVehicle("UAZ", "Patriot", 23.7,10000,120,800,LANDAU));

        consoleMenu(cars);
    }


    public static int costCars(List<? extends AutoTransport> cars){
        int sum = 0;
        for(AutoTransport autoTransport :cars){
            sum += autoTransport.getCost();
        }
        return sum;
    }

    public static void speedRange(List<? extends AutoTransport> cars,int minSpeed, int maxSpeed){
        int numberOfSuitableCars = 0;
        for (AutoTransport auto : cars){
            if(minSpeed < auto.getSpeed() && maxSpeed > auto.getSpeed()) {
                System.out.println("Марка авто: " + auto.getMark() + " Модель: " + auto.getModel() + " Максимальная скорость: " + auto.getSpeed());
                numberOfSuitableCars ++;
            }
        }
        if (numberOfSuitableCars == 0 ) System.out.println("Нет автомобиля в данном деапазоне");
    }


    public static void consoleMenu(List<? extends AutoTransport> cars){
        boolean programWorks = true;
        while (programWorks){
            System.out.println(" Для подсчитать стоимость автопарка введите цыфру 1");
            System.out.println(" Что бы провести сортировку автомобилей парка по расходу топлива введите цыфру 2");
            System.out.println(" Что бы Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости введите цыфру 3");
            System.out.println(" Что бы закончить работу программы введите цыфру 0");

            Scanner scanner = new Scanner(System.in);
            int operationТumber = scanner.nextInt();
            switch (operationТumber){
                case 1:
                    System.out.println(costCars(cars) + " $");
                    break;
                case 2:
                    fuelConsumptionSorting(cars);

                    break;
                case 3:
                    System.out.println("Введите минимальную скорость");
                    int minSpeed = scanner.nextInt();
                    System.out.println("Введите максимальную скорость");
                    int maxSpeed = scanner.nextInt();
                    speedRange(cars,minSpeed, maxSpeed);
                    break;
                case 0:
                    programWorks = false;
                    break;
            }
        }
    }

    private static void fuelConsumptionSorting(List<? extends AutoTransport> cars){
        List <? extends AutoTransport> sortCars = new ArrayList<>();
        Collections.sort(cars, new Comparator<AutoTransport>() {
            @Override
            public int compare(AutoTransport o1, AutoTransport o2) {
                if(o1.getFuelConsumption()>o2.getFuelConsumption()){
                    return 1;
                }
                return 0;
            }
        });
        for(AutoTransport car: cars){
            System.out.println("Марка авто: " + car.getMark() + " Модель: " + car.getModel() + " расход топлива: " + car.getFuelConsumption());
        }
    }


}
