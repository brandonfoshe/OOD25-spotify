public class Song {
    public String tile;
    public String artist;
    public double duration;

    public Song(String title,String artist,double duration){
        this.tile = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTile() {
        return tile;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }
}