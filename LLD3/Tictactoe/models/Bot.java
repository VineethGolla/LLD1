package LLD3.Tictactoe.models;

import LLD3.Tictactoe.Factory.BotPlayingStrategyFactory;
import LLD3.Tictactoe.Strategies.BotPlayingStrategy;
import LLD3.Tictactoe.enums.BotDifficultyLevel;
import LLD3.Tictactoe.enums.PlayerType;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, Symbol symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel, BotPlayingStrategy botPlayingStrategy) {
        //Constructor chaining - when you create a child object, parent is created first
        super(name,symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyFactory(botDifficultyLevel);

    }

    public Move makeMove(){
        return null;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotPlayingStrategy getPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setPlayingStrategy(BotPlayingStrategy playingStrategy) {
        this.botPlayingStrategy = playingStrategy;
    }
}
