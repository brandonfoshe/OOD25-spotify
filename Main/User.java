import java.util.ArrayList;

public class User {
    public String username;
    public ArrayList<Playlist> playlists;

    public User(String username, ArrayList<Playlist> playlists){
        this.username = username;
        this.playlists = playlists;
    }

    public Playlist createPlaylist(String name, String type){
        Playlist playlist;
        if(type.equals("Pop")){
            playlist = new PopPlaylist(name);
        }
        else if(type.equals("Rock")){
            playlist = new RockPlaylist(name);
        }
        else if(type.equals("Jazz")){
            playlist = new JazzPlaylist(name);
        }
        else{
            playlist = new Playlist(name, type);
        }
        playlists.add(playlist);
        return playlist;
    }
    public void deletePlaylist(Playlist playlist){
        playlists.remove(playlist);
    }
    public void addSongToPlaylist(Playlist playlist, Song song){
        playlist.addSong(song);
    }
    public void removeSongFromPlaylist(Playlist playlist, Song song){
        playlist.removeSong(song);
    }
}