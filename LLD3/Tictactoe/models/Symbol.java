package LLD3.Tictactoe.models;

public class Symbol {
    private char achar;
    private String avatarUrl;

    public Symbol(char achar, String avatarUrl) {
        this.achar = achar;
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Symbol(char achar) {
        this.achar = achar;
    }

    public char getAchar() {
        return achar;
    }

    public void setAchar(char achar) {
        this.achar = achar;
    }
}
