package LLD3.Tictactoe.Factories;

import LLD3.Tictactoe.Strategies.botplayingstrategy.BotPlayingStrategy;
import LLD3.Tictactoe.Strategies.botplayingstrategy.EasyBotPlayingStrategy;
import LLD3.Tictactoe.Strategies.botplayingstrategy.HardBotPlayingStrategy;
import LLD3.Tictactoe.Strategies.botplayingstrategy.MediumBotPlayingStrategy;
import LLD3.Tictactoe.models.BotDifficultyLevel;
import LLD3.Tictactoe.models.PlayerType;

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
