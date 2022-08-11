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
    private SongList songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String songTitle, double songDuration){
//        if(findSong(songTitle) == null){
//            songs.add(new Song(songTitle, songDuration));
//            return true;
//        }

        if(songs.findSong(songTitle) == null){
            songs.add(new Song(songTitle, songDuration));
            return true;
        }

        return false;
    }

//    private Song findSong(String songTitle){
//        for (Song song : songs){
//            if (song.getTitle().equals(songTitle)){
//                return song;
//            }
//        }
//
//        return null;
//    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
//        if (trackNumber > 0 && trackNumber <= songs.size()) {
//            playlist.add(songs.get(trackNumber - 1));
//            return true;
//        }

        Song song = songs.findSong(trackNumber - 1);
        if ( (trackNumber > 0) && (song != null) ){
            playlist.add(song);
            return true;
        }

        System.out.println("Track nr '" + trackNumber + "' does not exist");
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
//        Song song = findSong(songTitle);
//        if (song != null) {
//            playlist.add(song);
//            return true;
//        }

        Song song = songs.findSong(songTitle);
        if (song != null) {
            playlist.add(song);
            return true;
        }

        System.out.println("Song '" + songTitle + "' does not exist");
        return false;
    }




//***IMPORTANT*** - If you are using an IDE to write this code
// you may have your inner class marked with private access.
// However, for the purposes of this code evaluation please mark
// the class itself public static.

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (findSong(song.getTitle()) == null){
                this.songs.add(song);
                return true;
            }

            return false;
        }

        private Song findSong(String songTitle) {
            for (Song song : this.songs) {
                if (song.getTitle().equals(songTitle)) {
                    return song;
                }
            }

            return null;
        }

        private Song findSong(int songTrackNumber) {
            if( (songTrackNumber >= 0) && (songTrackNumber < songs.size()) ) {
                return songs.get(songTrackNumber);
            }

            return null;
        }
    }
}
