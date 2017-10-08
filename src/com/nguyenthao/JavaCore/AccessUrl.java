package com.nguyenthao.JavaCore;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class AccessUrl {
	public static void main(String[] args) {
		try {
			while(true){
				URL myURL = new URL("https://www.sendo.vn/san-pham/loa-cam-tay-hat-karaoke-6120733/?source_block_id=listing_products&source_page_id=cate3_vasup_desc&source_info=desktop_60_1506187440944_68889355_0_default_0_1_0");
				URLConnection myURLConnection = myURL.openConnection();
				myURLConnection.connect();
				Thread.sleep(500);
			}
			
		} catch (MalformedURLException e) {
			// new URL() failed
			// ...
		} catch (IOException e) {
			// openConnection() failed
			// ...
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
