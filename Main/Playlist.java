import java.util.ArrayList;

public class Playlist {
    public String name;
    public ArrayList<Song> songs;
    public String type;

    public Playlist(String name, String type){
        this.name = name;
        this.type = type;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void addSong(Song song){
        songs.add(song);
    }
    public void removeSong(Song song){
        songs.remove(song);
    }
    public void playAllSongs (){
        int i = 1;
        for (Song song : songs){
            System.out.println("Playing song " + i++ + " of " + songs.size() + ": \n"
                    + song.getTile() + " by " + song.getArtist() + ": " + song.getDuration() + " minutes");
        }
    }
}