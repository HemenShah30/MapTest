package map;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class MapController {
	@FXML
	Canvas mini;
	@FXML
	Canvas big;
	GraphicsContext bigGC;
//	GraphicsContext miniGC = mini.getGraphicsContext2D();
	// this above line wont work
	
	@FXML
	protected void changeFocus(Event e) {
		
	}
	
	@FXML
	protected void travelTo(Event e) {
		if (bigGC == null) {
			bigGC = ((Canvas)e.getSource()).getGraphicsContext2D();
		}
		System.out.println(e.toString());
		Rectangle s = new Rectangle();
		Color c = Color.BLUE;
		bigGC.setFill(c);
		bigGC.fillOval(((MouseEvent) e).getX(), ((MouseEvent) e).getY(), 10, 10);
	}
}
