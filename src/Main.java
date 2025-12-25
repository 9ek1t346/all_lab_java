import ru.ifmo.se.pokemon.Battle; // импортируем класс Battle (симулятор боя)
import ru.ifmo.se.pokemon.Pokemon; // импортируем базовый класс Pokemon

public class Main { // объявляем главный класс программы
    public static void main(String[] args) { // точка входа в программу
        Battle battle = new Battle(); // создаём объект боя

        Pokemon marshadow = new Marshadow("Marshadow", 1); // создаём Marshadow (союзник)
        Pokemon stufful = new Stufful("Stufful", 1); // создаём Stufful (союзник)
        Pokemon oddish = new Oddish("Oddish", 1); // создаём Oddish (союзник)

        Pokemon bewear = new Bewear("Bewear", 1); // создаём Bewear (противник)
        Pokemon gloom = new Gloom("Gloom", 1); // создаём Gloom (противник)
        Pokemon vileplume = new Vileplume("Vileplume", 1); // создаём Vileplume (противник)

        battle.addAlly(marshadow); // добавляем Marshadow в команду союзников
        battle.addAlly(stufful); // добавляем Stufful в команду союзников
        battle.addAlly(oddish); // добавляем Oddish в команду союзников

        battle.addFoe(bewear); // добавляем Bewear в команду противников
        battle.addFoe(gloom); // добавляем Gloom в команду противников
        battle.addFoe(vileplume); // добавляем Vileplume в команду противников

        battle.go(); // запускаем бой
    } // конец метода main
} // конец класса Main
