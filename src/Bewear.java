public final class Bewear extends Stufful { // конечный класс Bewear (нельзя наследоваться)
    public Bewear(String name, int level) { // конструктор: имя и уровень
        super(name, level); // вызываем конструктор Stufful (наследуем типы и первые 3 атаки)
        setStats(120, 125, 80, 55, 60, 60); // переопределяем базовые характеристики Bewear
        addMove(new DragonClaw()); // добавляем 4-ю атаку: Dragon Claw
    } // конец конструктора
} // конец класса Bewear
