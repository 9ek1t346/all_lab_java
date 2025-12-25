import ru.ifmo.se.pokemon.*; // импортируем все основные классы библиотеки (Move, Type, Stat, Effect и т.д.)

final class Swagger extends StatusMove { // Swagger — статусная атака (конечный класс)
    Swagger() { // конструктор без параметров
        super(Type.NORMAL, 0, 85); // задаём тип, силу (0) и точность (85%)
    } // конец конструктора

    @Override
    protected void applyOppEffects(Pokemon p) { // эффекты на противника
        p.setMod(Stat.ATTACK, 2); // повышаем атаку цели на 2 стадии
        Effect.confuse(p); // накладываем замешательство (confusion)
    } // конец метода applyOppEffects

    @Override
    protected String describe() { // текст, который выводится при использовании атаки
        return "использует Swagger"; // возвращаем описание
    } // конец метода describe
} // конец класса Swagger

final class ShadowBall extends SpecialMove { // Shadow Ball — специальная атака (конечный класс)
    ShadowBall() { // конструктор
        super(Type.GHOST, 80, 100); // тип Ghost, сила 80, точность 100%
    } // конец конструктора

    @Override
    protected void applyOppEffects(Pokemon p) { // дополнительный эффект на цель
        if (Math.random() < 0.2) { // с шансом 20%
            p.setMod(Stat.SPECIAL_DEFENSE, -1); // понижаем Sp.Def на 1 стадию
        } // конец if
    } // конец метода applyOppEffects

    @Override
    protected String describe() { // описание атаки
        return "использует Shadow Ball"; // текст для лога боя
    } // конец метода describe
} // конец класса ShadowBall

final class ShiftGear extends StatusMove { // Shift Gear — статусная атака (конечный класс)
    ShiftGear() { // конструктор
        super(Type.STEEL, 0, 100); // тип Steel, сила 0, точность 100%
    } // конец конструктора

    @Override
    protected void applySelfEffects(Pokemon p) { // эффект на самого пользователя
        p.setMod(Stat.ATTACK, 1); // повышаем атаку на 1 стадию
        p.setMod(Stat.SPEED, 2); // повышаем скорость на 2 стадии
    } // конец метода applySelfEffects

    @Override
    protected String describe() { // описание атаки
        return "использует Shift Gear"; // текст для лога
    } // конец метода describe
} // конец класса ShiftGear

final class MirrorShot extends SpecialMove { // Mirror Shot — специальная атака (конечный класс)
    MirrorShot() { // конструктор
        super(Type.STEEL, 65, 85); // тип Steel, сила 65, точность 85%
    } // конец конструктора

    @Override
    protected void applyOppEffects(Pokemon p) { // дополнительный эффект на цель
        if (Math.random() < 0.3) { // с шансом 30%
            p.setMod(Stat.ACCURACY, -1); // понижаем точность цели на 1 стадию
        } // конец if
    } // конец метода applyOppEffects

    @Override
    protected String describe() { // описание атаки
        return "использует Mirror Shot"; // текст для лога
    } // конец метода describe
} // конец класса MirrorShot

final class AerialAce extends PhysicalMove { // Aerial Ace — физическая атака (конечный класс)
    AerialAce() { // конструктор
        super(Type.FLYING, 60, 100); // тип Flying, сила 60, точность «условно» 100%
    } // конец конструктора

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) { // переопределяем проверку точности
        return true; // Aerial Ace не промахивается
    } // конец метода checkAccuracy

    @Override
    protected String describe() { // описание атаки
        return "использует Aerial Ace"; // текст для лога
    } // конец метода describe
} // конец класса AerialAce

final class BulkUp extends StatusMove { // Bulk Up — статусная атака (конечный класс)
    BulkUp() { // конструктор
        super(Type.FIGHTING, 0, 100); // тип Fighting, сила 0, точность 100%
    } // конец конструктора

    @Override
    protected void applySelfEffects(Pokemon p) { // эффект на самого пользователя
        p.setMod(Stat.ATTACK, 1); // повышаем атаку на 1 стадию
        p.setMod(Stat.DEFENSE, 1); // повышаем защиту на 1 стадию
    } // конец метода applySelfEffects

    @Override
    protected String describe() { // описание атаки
        return "использует Bulk Up"; // текст для лога
    } // конец метода describe
} // конец класса BulkUp

final class WorkUp extends StatusMove { // Work Up — статусная атака (конечный класс)
    WorkUp() { // конструктор
        super(Type.NORMAL, 0, 100); // тип Normal, сила 0, точность 100%
    } // конец конструктора

    @Override
    protected void applySelfEffects(Pokemon p) { // эффект на самого пользователя
        p.setMod(Stat.ATTACK, 1); // повышаем атаку на 1 стадию
        p.setMod(Stat.SPECIAL_ATTACK, 1); // повышаем спец.атаку на 1 стадию
    } // конец метода applySelfEffects

    @Override
    protected String describe() { // описание атаки
        return "использует Work Up"; // текст для лога
    } // конец метода describe
} // конец класса WorkUp

final class DragonClaw extends PhysicalMove { // Dragon Claw — физическая атака (конечный класс)
    DragonClaw() { // конструктор
        super(Type.DRAGON, 80, 100); // тип Dragon, сила 80, точность 100%
    } // конец конструктора

    @Override
    protected String describe() { // описание атаки
        return "использует Dragon Claw"; // текст для лога
    } // конец метода describe
} // конец класса DragonClaw

final class PoisonPowder extends StatusMove { // Poison Powder — статусная атака (конечный класс)
    PoisonPowder() { // конструктор
        super(Type.POISON, 0, 75); // тип Poison, сила 0, точность 75%
    } // конец конструктора

    @Override
    protected void applyOppEffects(Pokemon p) { // эффект на противника
        Effect.poison(p); // накладываем отравление
    } // конец метода applyOppEffects

    @Override
    protected String describe() { // описание атаки
        return "использует Poison Powder"; // текст для лога
    } // конец метода describe
} // конец класса PoisonPowder

final class Facade extends PhysicalMove { // Facade — физическая атака (конечный класс)
    Facade() { // конструктор
        super(Type.NORMAL, 70, 100); // тип Normal, сила 70, точность 100%
    } // конец конструктора

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) { // базовый урон с учётом особенностей Facade
        double effectivePower = this.power; // берём базовую силу атаки
        if (att.getCondition() == Status.BURN || att.getCondition() == Status.POISON || att.getCondition() == Status.PARALYZE) { // если атакующий под статусом
            effectivePower *= 2; // удваиваем силу атаки
        } // конец if
        return (0.4 * att.getLevel() + 2) * effectivePower / 150; // повторяем формулу из библиотеки с новой силой
    } // конец метода calcBaseDamage

    @Override
    protected String describe() { // описание атаки
        return "использует Facade"; // текст для лога
    } // конец метода describe
} // конец класса Facade

final class Acid extends SpecialMove { // Acid — специальная атака (конечный класс)
    Acid() { // конструктор
        super(Type.POISON, 40, 100); // тип Poison, сила 40, точность 100%
    } // конец конструктора

    @Override
    protected void applyOppEffects(Pokemon p) { // дополнительный эффект на цель
        if (Math.random() < 0.1) { // с шансом 10%
            p.setMod(Stat.SPECIAL_DEFENSE, -1); // понижаем Sp.Def на 1 стадию
        } // конец if
    } // конец метода applyOppEffects

    @Override
    protected String describe() { // описание атаки
        return "использует Acid"; // текст для лога
    } // конец метода describe
} // конец класса Acid
