package LLD3.Tictactoe.Factory;

import LLD3.Tictactoe.Strategies.BOTStrategies.BotPlayingStrategy;
import LLD3.Tictactoe.Strategies.BOTStrategies.EasyBotPlayingStrategy;
import LLD3.Tictactoe.Strategies.BOTStrategies.HardBotPlayingStrategy;
import LLD3.Tictactoe.Strategies.BOTStrategies.MediumBotPlayingStrategy;
import LLD3.Tictactoe.enums.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyFactory(BotDifficultyLevel botDifficultyLevel) {
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        }else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)){
            return new MediumBotPlayingStrategy();
        }else{
            return new HardBotPlayingStrategy();
        }
    }
}
