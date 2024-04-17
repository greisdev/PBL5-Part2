import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<String> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void printSongs() {
        System.out.println("Playlist: " + name);
        for (String song : songs) {
            System.out.println("- " + song);
        }
    }

    public String getName() {
        return name;
    }
}
