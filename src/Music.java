
public class Music {
    private String title;
    private String albumName;
    private String duration;
    private String genre;
    private Date releaseDate;
    private Artist artist;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbumName() {
        return albumName;
    }
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Music(String title,String albumName,String duration,String genre, Date releaseDate,Artist artist) {
        this.title=title;
        this.albumName = albumName;
        this.duration=duration;
        this.genre=genre;
        this.releaseDate=releaseDate;
        this.artist=artist;

    }
    public String toString() {
        String songInfo=String.format("%s\t%s\t%s\t%s\t%s\n%s",title,albumName,duration,genre,releaseDate,artist);
        return songInfo;
    }
    public boolean equalsIgnoreCase(Music song1){

        return this.title.equalsIgnoreCase(song1.title)?true:false;
    }


}
