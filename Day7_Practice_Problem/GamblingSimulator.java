import java.util.logging.Logger;
import java.util.Random;

public class GamblingSimulator {

    private static final Logger logger =
            Logger.getLogger(GamblingSimulator.class.getName());

    private static final int STAKE = 100;
    private static final int BET_AMOUNT = 1;

    private final Random random = new Random();

    public void initializeGame() {

        logger.info("Daily Stake : $" + STAKE);
        logger.info("Bet Amount : $" + BET_AMOUNT);
    }

    
    public int playBet() {

    if (random.nextBoolean()) {
        return BET_AMOUNT;
    }

    return -BET_AMOUNT;
    }

    public static void main(String[] args) {

        GamblingSimulator gambler =
                new GamblingSimulator();

        gambler.initializeGame();

        int result = gambler.playBet();

        logger.info(
                result > 0 ?
                "Won $1" :
                "Lost $1");
    }
}