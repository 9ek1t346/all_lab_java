import ru.ifmo.se.pokemon.Pokemon; // импортируем Pokemon
import ru.ifmo.se.pokemon.Type; // импортируем Type

public class Oddish extends Pokemon { // класс Oddish (не final, т.к. от него наследуется Gloom)
    public Oddish(String name, int level) { // конструктор: имя и уровень
        super(name, level); // вызываем конструктор Pokemon
        setType(Type.GRASS, Type.POISON); // задаём типы: Grass и Poison
        setStats(45, 50, 55, 75, 65, 30); // базовые характеристики Oddish
        setMove(new PoisonPowder(), new Facade()); // атаки: Poison Powder, Facade
    } // конец конструктора
} // конец класса Oddish
