public final class Vileplume extends Gloom { // конечный класс Vileplume (нельзя наследоваться)
    public Vileplume(String name, int level) { // конструктор: имя и уровень
        super(name, level); // вызываем конструктор Gloom (тип + 3 атаки)
        setStats(75, 80, 85, 110, 90, 50); // переопределяем характеристики Vileplume
        addMove(new Facade()); // добавляем 4-ю атаку: Facade (как на скрине Facade повторяется)
    } // конец конструктора
} // конец класса Vileplume
