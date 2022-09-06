package com.timbuchalka;

import com.timbuchalka.model.Artist;
import com.timbuchalka.model.DataSource;
import com.timbuchalka.model.SongArtist;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();

        if(!dataSource.open()){
            System.out.println("Can't open data source");
            return;
        }

        List<Artist> artists = dataSource.queryArtists(5);
        if(artists == null){
            System.out.println("No artists!");
            return;
        }

        for(Artist artist : artists){
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<String> albumsForArtists =
                dataSource.queryAlbumsForArtist("Carole King", DataSource.ORDER_BY_ASC);

        for(String album : albumsForArtists){
            System.out.println(album);
        }

        List<SongArtist> songArtists = dataSource.queryArtistsFromSong("Go Your Own Way", DataSource.ORDER_BY_ASC);
        if(songArtists == null){
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for(SongArtist songArtist : songArtists){
            System.out.println("Artist name = " + songArtist.getArtistName() +
                    " | Album name = " + songArtist.getAlbumName() +
                    " | Track = " + songArtist.getTrack());
        }

        dataSource.querySongsMetadata();

        int count = dataSource.getCount(DataSource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);

        dataSource.createViewForSongArtists();

        dataSource.close();
    }
}
