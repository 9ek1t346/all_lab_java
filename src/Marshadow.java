import ru.ifmo.se.pokemon.Pokemon; // импортируем базовый класс Pokemon
import ru.ifmo.se.pokemon.Type; // импортируем перечисление типов

public final class Marshadow extends Pokemon { // конечный класс покемона Marshadow (нельзя наследоваться)
    public Marshadow(String name, int level) { // конструктор: имя и уровень
        super(name, level); // передаём имя и уровень в конструктор базового класса Pokemonn
        setType(Type.FIGHTING, Type.GHOST); // задаём типы: Fighting и Ghost
        setStats(90, 125, 80, 90, 90, 125); // задаём базовые характеристики (HP, Attack, Defense, Special Attack, Special Defense, Speed)
        setMove(new Swagger(), new ShadowBall(), new ShiftGear(), new MirrorShot()); // назначаем 4 атаки Каждая атака — это объект класса, который мы сами написали в Moves.java
    } // конец конструктора
} // конец класса
