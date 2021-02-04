package com.demo.prj;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadTextURL {
	
	public static final String FLOWERS_FEED = "www.facebook.com";
	
	public static void main(String[] args) throws IOException {
	
		long start = System.currentTimeMillis(); 
		
		InputStream stream = null;
		BufferedInputStream buf = null;
		
		try {
			URL url = new URL(FLOWERS_FEED);
			stream = url.openStream();
			buf = new BufferedInputStream(stream);
			
			StringBuilder sb = new StringBuilder();
			
			
			while(true) {
				
				int data = stream.read();
				
				if(data == -1) {
					break;
				}
				else {
					sb = sb.append((char)data);
				}
			}
			System.out.println(sb);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			stream.close();
			buf.close();
		}
		long stop = System.currentTimeMillis();
		System.out.println((stop-start)/1000F+"sec");
	}
}
