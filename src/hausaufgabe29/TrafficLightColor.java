package hausaufgabe29;

enum TrafficLightColor {
    RED,
    YELLOW,
    GREEN
}

// Класс "Светофор"
class TrafficLight {
    private TrafficLightColor currentColor;

    // Конструктор по умолчанию
    public TrafficLight() {
        this.currentColor = TrafficLightColor.RED; // начинаем с красного цвета
    }

    // Конструктор с возможностью указать начальный цвет
    public TrafficLight(TrafficLightColor initialColor) {
        this.currentColor = initialColor;
    }

    // Метод для получения текущего цвета светофора
    public TrafficLightColor getCurrentColor() {
        return currentColor;
    }

    // Метод для установки текущего цвета светофора
    public void setCurrentColor(TrafficLightColor color) {
        this.currentColor = color;
    }

    // Метод, определяющий, можно ли переходить дорогу на текущем цвете
    public boolean canCrossTheRoad() {
        return currentColor == TrafficLightColor.GREEN;
    }
}

