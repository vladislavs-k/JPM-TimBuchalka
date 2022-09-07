package sample.musicui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import sample.musicui.model.Artist;
import sample.musicui.model.DataSource;

public class HelloController {
    @FXML
    private TableView<Artist> artistTable;

    public void listArtists(){
        Task<ObservableList<Artist>> task = new GetAllArtistsTask();
        artistTable.itemsProperty().bind(task.valueProperty());

        new Thread(task).start();
    }
}

class GetAllArtistsTask extends Task{
    @Override
    public ObservableList<Artist> call() {
        return FXCollections.observableArrayList
                (DataSource.getInstance().queryArtists(DataSource.ORDER_BY_ASC));
    }
}