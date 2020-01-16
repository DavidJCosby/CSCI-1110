/*
Author: David Cosby
Date: 01/16/2020

Creates an Rectangle that loops around a pentagon while fading in and out.
*/


import javafx.animation.*;
import javafx.util.Duration;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;


public class AnimationPane extends Pane {
	private Pentagon pentagon = new Pentagon(300, 300, 200);
	private Rectangle rectangle = new Rectangle(0, 0, 100, 50);
	private PathTransition path = new PathTransition();
	private FadeTransition fade = new FadeTransition();
	private BooleanProperty playing = new SimpleBooleanProperty(false);


	public AnimationPane() {
		setupAnimation();
		createPlayingListener();
		getChildren().addAll(pentagon, rectangle);
	}
	
	public AnimationPane(boolean playOnInit) {
		setupAnimation();
		createPlayingListener();
		getChildren().addAll(pentagon, rectangle);
		
		playing.set(playOnInit);
	}
	
	private void setupAnimation() {		
		path.setPath(pentagon);
		path.setNode(rectangle);
		path.setCycleCount(Timeline.INDEFINITE);
		path.setDuration(Duration.millis(4000));
		path.setOrientation(
			PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		path.setAutoReverse(false);
		
		fade.setNode(rectangle);
		fade.setFromValue(0.0);
		fade.setToValue(1.0);
		fade.setDuration(Duration.millis(666));
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