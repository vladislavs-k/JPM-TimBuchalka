import java.util.ArrayList;
import java.util.LinkedList;

// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.

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
