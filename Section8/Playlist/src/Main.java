import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
//
// Also check out the ExerciseDescription_Playlist.txt

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
//        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
//        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        playerPlay(playList);

    }






    private static void playerPlay(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean skipForward = true;
        ListIterator<Song> listIterator = playList.listIterator();


        if (playList.isEmpty()) {
            System.out.println("No songs in the playlist!");
            return;
        } else {
            System.out.println();
            printMenuOptions();
            System.out.println("Song playing: " + listIterator.next());
            System.out.println();
        }

        while (!quit) {
            System.out.print("Enter number to choose the option: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (action) {
                case 0:
                    System.out.println("Player has been closed");
                    quit = true;
                    break;
                case 1:
                    if (!skipForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        skipForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Song playing: " + listIterator.next().getTitle());
                    } else {
                        endMessage();
                        skipForward = false;
                    }
                    break;
                case 2:
                    if (skipForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        skipForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Song playing: " + listIterator.previous().getTitle());
                    } else {
                        startMessage();
                        skipForward = true;
                    }
                    break;
                case 3:
                    if (skipForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Replay. Song playing: " + listIterator.previous().getTitle());
                            listIterator.next();
                        } else {
                            startMessage();
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Replay. Song playing: " + listIterator.next().getTitle());
                            listIterator.previous();
                        } else {
                            endMessage();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Songs of the playlist:");
                    for (int i = 0; i < playList.size(); i++) {
                        System.out.println("\t" + (i + 1) + ") " + playList.get(i).toString());
                    }
                    break;
                case 5:
                    String currentSong;
                    if (skipForward && listIterator.hasPrevious()) {
                        currentSong = listIterator.previous().toString();
                        System.out.println("Song [" + currentSong + "] has been removed from the playlist");
                        removeSong(listIterator);
                    } else if (!skipForward && listIterator.hasNext()){
                        currentSong = listIterator.next().toString();
                        System.out.println("Song [" + currentSong + "] has been removed from the playlist");
                        removeSong(listIterator);
                    }
                    break;
                case 6:
                    printMenuOptions();
                    break;
            }

            System.out.println();

        }


    }

    private static void printMenuOptions() {
        System.out.println("############### Player menu ###############");
        System.out.println("0 - Quit");
        System.out.println("1 - Skip forward");
        System.out.println("2 - Skip backwards");
        System.out.println("3 - Replay current song");
        System.out.println("4 - List the songs in the playlist");
        System.out.println("5 - Remove current song from playlist");
        System.out.println("6 - Player menu");
        System.out.println();
//        System.out.print("Enter number to choose the option: ");
    }

    private static void removeSong(ListIterator<Song> listIterator){
        listIterator.remove();
        if (listIterator.hasNext()) {
            System.out.println("Song playing: " + listIterator.next().getTitle());
        } else {
            endMessage();
        }
    }

    private static void endMessage(){
        System.out.println("End of playlist is reached");
    }

    private static void startMessage(){
        System.out.println("Playlist is at the beginning");
    }

}
