package LLD3.Tictactoe.Factory;

import LLD3.Tictactoe.Strategies.BotPlayingStrategy;
import LLD3.Tictactoe.Strategies.EasyBotPlayingStrategy;
import LLD3.Tictactoe.Strategies.HardBotPlayingStrategy;
import LLD3.Tictactoe.Strategies.MediumBotPlayingStrategy;
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
