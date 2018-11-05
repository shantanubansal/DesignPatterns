package com.shantanubansal.designpatterns.structural.adapter;

public class WMVPlayer implements AdvancedVideoPlayer{

	@Override
	public void playVLC(String fileName) {
		
	}

	@Override
	public void playWMP(String fileName) {
		System.out.println("Playing WMP file. Name: " + fileName);
	}

}
