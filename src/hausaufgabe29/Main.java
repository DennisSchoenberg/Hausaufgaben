package hausaufgabe29;

public class Main {
    public static void main(String[] args) {
        // Создаем объект светофора
        TrafficLight trafficLight = new TrafficLight();

        // Выводим текущий цвет светофора
        System.out.println("Текущий цвет светофора: " + trafficLight.getCurrentColor());

        // Проверяем, можно ли переходить дорогу
        System.out.println("Можно ли переходить дорогу? " + trafficLight.canCrossTheRoad());

        // Меняем цвет светофора на зеленый
        trafficLight.setCurrentColor(TrafficLightColor.GREEN);

        // Выводим текущий цвет светофора после изменения
        System.out.println("Текущий цвет светофора: " + trafficLight.getCurrentColor());

        // Проверяем, можно ли теперь переходить дорогу
        System.out.println("Можно ли переходить дорогу? " + trafficLight.canCrossTheRoad());
    }
}
