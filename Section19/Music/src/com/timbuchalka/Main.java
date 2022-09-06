package com.timbuchalka;

import com.timbuchalka.model.Artist;
import com.timbuchalka.model.DataSource;

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
                dataSource.queryAlbumsForArtist("Iron Maiden", DataSource.ORDER_BY_ASC);

        for(String album : albumsForArtists){
            System.out.println(album);
        }


        dataSource.close();
    }
}
