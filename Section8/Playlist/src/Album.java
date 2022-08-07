import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double songDuration){
        if(findSong(songTitle) == null){
            songs.add(new Song(songTitle, songDuration));
            return true;
        }

        return false;
    }

    private Song findSong(String songTitle){
        for (Song song : songs){
            if (song.getTitle().equals(songTitle)){
                return song;
            }
        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        if(trackNumber > 0 && trackNumber <= songs.size()){
            playlist.add(songs.get(trackNumber - 1));
            return true;
        }

        System.out.println("Track nr '" + trackNumber + "' does not exist");
        return false;
    }

    public boolean addToPlayList(String songTitle,LinkedList<Song> playlist){
        Song song = findSong(songTitle);
        if (song != null){
            playlist.add(song);
            return true;
        }

        System.out.println("Song '" + songTitle + "' does not exist");
        return false;
    }
}
