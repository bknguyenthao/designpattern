package com.nguyenthao.Proxy;

public class ProxyImage implements Image {
	private RealImage realImage;
	private String url;

	public ProxyImage(String url) {
		this.url = url;
		System.out.println(String.format("%s: Hình ảnh %s chưa được load", new java.util.Date().getTime(), this.url));
	}

	@Override
	public void ShowImage() {
		if (realImage == null) {
			realImage = new RealImage(this.url);
			realImage.ShowImage();
		} else {
			if (realImage != null) {
				System.out.println(String.format("%s: Hình ảnh %s đã được load. Chỉ lấy ra sử dụng",
						new java.util.Date().getTime(), this.url));
			}
		}
	}
}
