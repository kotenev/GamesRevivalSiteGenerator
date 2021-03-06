package newbilius.GamesRevival.Data;

import java.util.List;

public class Game {
    public String[] Title;
    public String[] Genre;
    public String Links;
    public String About;
    public String[] OldGames;
    public String LogoPath;
    public String Path;
    public List<Port> Ports;

    public String getTitle() {
        return String.join(", ", Title);
    }

    public String getGenres() {
        return String.join(", ", Genre);
    }

    public String getTitleBR() {
        return String.join("</br>", Title);
    }
}
