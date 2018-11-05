package com.shantanubansal.designpatterns.structural.adapter;

public class Player implements VideoPlayer{

	VideoAdapter videoAdapter;
	
	@Override
	public void play(String videoType, String fileName) {
		// TODO Auto-generated method stub
		if(videoType.equalsIgnoreCase("mkv")) {
			System.out.println("Playing MKV file: " + fileName);
			videoAdapter = new VideoAdapter(videoType);
			videoAdapter.play(videoType, fileName);
		} else if(videoType.equalsIgnoreCase("mp4")) {
			System.out.println("Playing WMV file: " + fileName);
			videoAdapter = new VideoAdapter(videoType);
			videoAdapter.play(videoType, fileName);
		} else {
			System.out.println("Video Not Supported: " + fileName);
		}  
	}
}
