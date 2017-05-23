package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class Controller {
	@FXML
	public Button btn1;

	@FXML
	public Button btn2;
	@FXML
	public ListView<String> list1;
	@FXML
	public ListView<String> list2;

	public String selected;
	// To Creating a Observable List

	ObservableList<String> data = FXCollections.observableArrayList("Alejandro", "Quiros", "Navarro");
	ObservableList<String> data2 = FXCollections.observableArrayList();

	public void initialize() {
		list1.setItems(this.data);
		list2.setItems(this.data2);

	}

	public void Añadir() {

		selected = (String) list1.getSelectionModel().getSelectedItem();

		if (selected != null) {
			data2.add(selected);
			data.remove(selected);

			list1.setItems(this.data);
			list2.setItems(this.data2);
		}
	}

	public void Eliminar() {
		selected = (String) list2.getSelectionModel().getSelectedItem();
		if (selected != null) {
			data.add(selected);
			data2.remove(selected);

			list1.setItems(this.data);
			list2.setItems(this.data2);
		}
	}

}
