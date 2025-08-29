import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Create a new user and create a chill playlist for that user
        ArrayList<Playlist> playlists = new ArrayList<>();
        User user1 = new User("ABC123", playlists);
        Playlist chillPlaylist = user1.createPlaylist("Chill", "Pop");

        //Create a bunch of songs and add them to songs
        Song song1 = new Song("Super chill song", "Some Guy", 2.86);
        Song song2 = new Song("A kind of chill song", "A Band", 3.14);
        Song song3 = new Song("Relaxing song", "Two Guys In a Garage", 1.86);
        Song song4 = new Song("Your favorite song", "Your Favorite Band", 4.03);
        Song song5 = new Song("Slow song #1", "People Who Make Slow Songs", 2.80);
        Song song6 = new Song("Slow song #5", "People Who Make Slow Songs", 3.10);
        Song song7 = new Song("Slow song #2", "People Who Make Slow Songs", 2.45);

        //Add created songs to user's created playlist (and then some)
        user1.addSongToPlaylist(chillPlaylist, song1);
        user1.addSongToPlaylist(chillPlaylist, song2);
        user1.addSongToPlaylist(chillPlaylist, song3);
        user1.addSongToPlaylist(chillPlaylist, song4);
        user1.addSongToPlaylist(chillPlaylist, song6);
        user1.addSongToPlaylist(chillPlaylist, song5);
        user1.addSongToPlaylist(chillPlaylist, song7);
        user1.addSongToPlaylist(chillPlaylist, song1);
        user1.addSongToPlaylist(chillPlaylist, song2);

        //Play all songs from playlist
        chillPlaylist.playAllSongs();

        //Oops, duplicate songs
        user1.removeSongFromPlaylist(chillPlaylist, song1);
        user1.removeSongFromPlaylist(chillPlaylist, song2);

        //Spacing
        System.out.println();
        System.out.println();

        //Let's listen again
        chillPlaylist.playAllSongs();
    }
}