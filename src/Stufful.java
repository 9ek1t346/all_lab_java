import ru.ifmo.se.pokemon.Pokemon; // импортируем базовый класс Pokemon
import ru.ifmo.se.pokemon.Type; // импортируем типы

public class Stufful extends Pokemon { // класс Stufful (не final, т.к. от него наследуется Bewear)
    public Stufful(String name, int level) { // конструктор: имя и уровень
        super(name, level); // вызываем конструктор Pokemon
        setType(Type.NORMAL, Type.FIGHTING); // задаём два типа: Normal и Fighting
        setStats(70, 75, 50, 45, 50, 50); // базовые характеристики Stufful
        setMove(new AerialAce(), new BulkUp(), new WorkUp()); // атаки: Aerial Ace, Bulk Up, Work Up
    } // конец конструктора
} // конец класса Stufful
