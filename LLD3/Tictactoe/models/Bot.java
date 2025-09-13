package LLD3.Tictactoe.models;

import LLD3.Tictactoe.Strategies.botplayingstrategy.BotPlayingStrategy;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy playingStrategy;

    public Bot(Symbol symbol, String name, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name, playerType);
        this.botDifficultyLevel = botDifficultyLevel;

    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotPlayingStrategy getPlayingStrategy() {
        return playingStrategy;
    }

    public void setPlayingStrategy(BotPlayingStrategy playingStrategy) {
        this.playingStrategy = playingStrategy;
    }
}
