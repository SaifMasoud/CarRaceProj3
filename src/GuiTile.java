import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GuiTile extends Label {

    public GuiTile(types type) {
        super("");
        setPrefSize(60, 60); //TODO: re-think the sizing of our app (We don't need to dynamically change.)
        if (type==types.CAR) {
            this.getStyleClass().add("car");
            Image img = new Image("carsideview.jpg", 50, 50, false, false);
            setGraphic(new ImageView(img));
        }
        if (type==types.STREET)
            this.getStyleClass().add("street");
        if( type == types.GRASS){
            this.getStyleClass().add("grass");
        }
    }
}
