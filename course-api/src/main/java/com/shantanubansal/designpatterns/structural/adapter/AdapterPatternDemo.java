package com.shantanubansal.designpatterns.structural.adapter;

public class AdapterPatternDemo {
	public static void main(String args[]) {
		Player player = new Player();
		player.play("MKV", "Yuhi Chala Chal Rahi.mkv");
		player.play("MP4", "Chod aaye hum wo galiyan.mp4");
		player.play("MP3", "Havana.mp3");
	}
}
