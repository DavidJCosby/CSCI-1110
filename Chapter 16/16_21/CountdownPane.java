/*
Author: David Cosby
Date: 01/27/2020

CountdownPane; sets a timer after a user types in a number matching that number in duration, plays music upon completion.
*/

import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.geometry.Pos;


public class CountdownPane extends Pane {
	TextField text = new TextField("--");
	Timeline heartbeat = new Timeline();
	Media song = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	MediaPlayer music = new MediaPlayer(song);

			
	public CountdownPane() {
		setupHeartbeat();
		setupTextField();
	}
	
	private void setupHeartbeat() {
		KeyFrame beat = new KeyFrame(Duration.seconds(1.0), e -> {
			int timerValue = getTextAsInt();
			
			if (timerValue != 0) {
				setTextToInt(timerValue - 1);
			}
			else {
				heartbeat.stop();
				music.play();
			}
		});
		
		heartbeat.getKeyFrames().add(beat);
		heartbeat.setCycleCount(Timeline.INDEFINITE);
	}
	
		
	private int getTextAsInt() {
		return Integer.parseInt(text.getText());
	}
	
	private void setTextToInt(int timerValue) {
		text.setText(Integer.toString(timerValue));
	}	
	
	private void setupTextField() {
		text.setAlignment(Pos.CENTER);
		text.setOnAction(e -> {
			heartbeat.play();
		});
		getChildren().add(text);
	}
}