package com.shantanubansal.designpatterns.structural.adapter;

public class VideoAdapter implements VideoPlayer {

	
	AdvancedVideoPlayer advancedVideoPlayer;
	
	public VideoAdapter(String videoType) {
		if(videoType.equalsIgnoreCase("vlc"))
			advancedVideoPlayer = new VLCPlayer();
		else if (videoType.equalsIgnoreCase("wmv"))
			advancedVideoPlayer = new WMVPlayer();
	}
	
	@Override
	public void play(String videoType, String fileName) {
		// TODO Auto-generated method stub
		if(videoType.equalsIgnoreCase("vlc"))
			advancedVideoPlayer.playVLC(fileName);
		else if(videoType.equalsIgnoreCase("wmv"))
			advancedVideoPlayer.playWMP(fileName);
	}

}
