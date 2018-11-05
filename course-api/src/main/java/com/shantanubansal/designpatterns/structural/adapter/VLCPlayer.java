package com.shantanubansal.designpatterns.structural.adapter;

public class VLCPlayer implements AdvancedVideoPlayer{

	@Override
	public void playVLC(String fileName) {
		System.out.println("Playing VLC file. Name: " + fileName);
	}

	@Override
	public void playWMP(String fileName) {
		
	}

}
