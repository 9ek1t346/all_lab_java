public class Gloom extends Oddish { // класс Gloom (не final, т.к. от него наследуется Vileplume)
    public Gloom(String name, int level) { // конструктор: имя и уровень
        super(name, level); // вызываем конструктор Oddish (тип + 2 атаки)
        setStats(60, 65, 70, 85, 75, 40); // переопределяем характеристики Gloom
        addMove(new Acid()); // добавляем 3-ю атаку: Acid
    } // конец конструктора
} // конец класса Gloom
