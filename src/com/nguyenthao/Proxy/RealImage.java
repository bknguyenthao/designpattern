package com.nguyenthao.Proxy;

public class RealImage implements Image {
	private String url;

	public RealImage(String url) {
		this.url = url;
	}

	@Override
	public void ShowImage() {
		System.out
				.println(String.format("%s: Hình ảnh %s bắt đầu được load", new java.util.Date().getTime(), this.url));
	}
}
