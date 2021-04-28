package BattleTimer.mechanics.constants.personalities;

public abstract class AbstractPersonality {

    public AbstractPersonality(){

    }

    public abstract float calculateTimeValue();
    public abstract AbstractPersonality nextPersonality();

}
