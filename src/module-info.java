module MusicPlayer {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires java.management;
	requires javafx.media;
	
	opens application to javafx.graphics, javafx.fxml;
}
