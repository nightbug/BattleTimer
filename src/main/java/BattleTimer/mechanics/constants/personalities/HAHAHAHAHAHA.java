package BattleTimer.mechanics.constants.personalities;

import com.megacrit.cardcrawl.dungeons.AbstractDungeon;

public class HAHAHAHAHAHA extends AbstractPersonality {

    @Override
    public float calculateTimeValue() { return AbstractDungeon.monsterRng.random(-9.25f, -10); }
    @Override
    public AbstractPersonality nextPersonality() { return new HAHAHAHAHAHA(); }
}