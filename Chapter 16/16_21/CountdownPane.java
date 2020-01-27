/*
Author: David Cosby
Date: 01/27/2020

CountdownPane; sets a timer after a user types in a number, plays music upon completion.
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


public class CountdownPane extends Pane {
	TextField text = new TextField("--");
	Timeline heartbeat = new Timeline();
	Media song = new Media("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	MediaPlayer music = new MediaPlayer(song);
	

	CountdownPane() {
		setupHeartbeat();
		setupTextField();
	}
	
	private void setupHeartbeat() {
		KeyFrame beat = new KeyFrame(Duration.seconds(1.0), onBeat);
		heartbeat.getKeyFrames().add(beat);
		heartbeat.setCycleCount(Timeline.INDEFINITE);
	}
	
	EventHandler<ActionEvent> onTextChangeDefault = e -> {
		heartbeat.play();
		text.setOnAction(null);
	};
	
	EventHandler<ActionEvent> onBeat = e -> {
		int timerValue = getTextAsInt();
		
		if (timerValue != 0) {
			setTextToInt(timerValue - 1);
		}
		else {
			heartbeat.stop();
			music.play();
			text.setOnAction(onTextChangeDefault);
		}
	};
	
	private int getTextAsInt() {
		return Integer.parseInt(text.getText());
	}
	
	private void setTextToInt(int timerValue) {
		text.setText(Integer.toString(timerValue));
	}	
	
	private void setupTextField() {
		text.setOnAction(onTextChangeDefault);
		getChildren().add(text);
	}
}