package Lecture.Lecture1;

public class Circle {
    double radius;

    /** Создает круг с радиусом, равным 1 */
    Circle() {
        radius = 1;
    }

    /** Создает круг с указанным радиусом */
    Circle (double newRadius) {
        radius = newRadius;
    }

    /** Возвращает площадь этого круга */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /** Возвращает периметр этого круга */
    double getPerimetr() {
        return 2 * radius * Math.PI;
    }

    /** Присваивает новый радиус этому кругу */
    void setRadius(double newRadius) {
        radius = newRadius;
        //арпарп
    }

}
