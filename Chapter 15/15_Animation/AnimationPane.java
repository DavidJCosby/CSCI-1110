import javafx.animation.*;
import javafx.util.Duration;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;

public class AnimationPane extends Pane {
	private BooleanProperty playing = new SimpleBooleanProperty(false);
		
	private Circle pentagon = new Circle(200);
	private Rectangle rectangle = new Rectangle(50, 20);
	private PathTransition path = new PathTransition();
	private FadeTransition fade = new FadeTransition();
	
	public AnimationPane() {
		setupAnimation();
		createPlayingListener();
		getChildren().add(pentagon);
	}
	
	public AnimationPane(boolean playOnInit) {
		setupAnimation();
		createPlayingListener();
		getChildren().add(pentagon);
		
		playing.set(playOnInit);
	}
	
	private void setupAnimation() {
		path.setPath(pentagon);
		path.setNode(rectangle);
		path.setCycleCount(Timeline.INDEFINITE);
		path.setDuration(Duration.millis(4000));
		path.setOrientation(
			PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		path.setAutoReverse(true);
		
		fade.setNode(rectangle);
		fade.setFromValue(0.0);
		fade.setToValue(1.0);
		fade.setDuration(Duration.millis(2000));
		fade.setCycleCount(Timeline.INDEFINITE);
		fade.setAutoReverse(true);
	}
	
	private void createPlayingListener() {
		playing.addListener(ov -> {
			boolean nowPlaying = playing.get();
			
			if (nowPlaying) {
				playAnimations();
			}
			else {
				pauseAnimations();
			}
		});
	}

	private void playAnimations() {
		path.play();
		fade.play();
	}	

	private void pauseAnimations() {
		path.pause();
		fade.pause();
	}	
	
	
	public void togglePlaying() {
		playing.set(!playing.get());
	}
}