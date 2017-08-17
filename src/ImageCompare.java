import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.image.*;
import com.sun.image.codec.jpeg.*;

 public class ImageCompare {

    static void saveJPG(String cNew_Folderchangesjpg, String imgpath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	protected BufferedImage img1 = null;
	protected BufferedImage img2 = null;
	protected BufferedImage imgc = null;
	protected int comparex = 0;
	protected int comparey = 0;
	protected int factorA = 0;
	protected int factorD = 10;
	protected boolean match = false;
	protected int debugMode = 0; 
	public static void main(String[] args) {
		
		ImageCompare ic = new ImageCompare("c:\\test1.jpg", "c:\\test2.jpg");
		
		ic.setParameters(8, 6, 5, 10);
		
		ic.setDebugMode(2);
		
		ic.compare();
		
		System.out.println("Match: " + ic.match());
		
		if (!ic.match()) {
			saveJPG(ic.getChangeIndicator(), "c:\\changes.jpg");
		}
	}
	
	
	public ImageCompare(String file1, String file2) {
		this(loadJPG(file1), loadJPG(file2));
	}
 
	
	public ImageCompare(Image img1, Image img2) {
		this(imageToBufferedImage(img1), imageToBufferedImage(img2));
	}
 
	
	public ImageCompare(BufferedImage img1, BufferedImage img2) {
		this.img1 = img1;
		this.img2 = img2;
		autoSetParameters();
	}

	
	protected void autoSetParameters() {
		comparex = 10;
		comparey = 10;
		factorA = 10;
		factorD = 10;
	}
	
	
	public void setParameters(int x, int y, int factorA, int factorD) {
		this.comparex = x;
		this.comparey = y;
		this.factorA = factorA;
		this.factorD = factorD;
	}
	

	public void setDebugMode(int m) {
		this.debugMode = m;
	}
	

	public void compare() {
		
		imgc = imageToBufferedImage(img2);
		Graphics2D gc = imgc.createGraphics();
		gc.setColor(Color.RED);
		
		img1 = imageToBufferedImage(GrayFilter.createDisabledImage(img1));
		img2 = imageToBufferedImage(GrayFilter.createDisabledImage(img2));

		int blocksx = (int)(img1.getWidth() / comparex);
		int blocksy = (int)(img1.getHeight() / comparey);
		
		this.match = true;
		
		for (int y = 0; y < comparey; y++) {
			if (debugMode > 0) System.out.print("|");
			for (int x = 0; x < comparex; x++) {
				int b1 = getAverageBrightness(img1.getSubimage(x*blocksx, y*blocksy, blocksx - 1, blocksy - 1));
				int b2 = getAverageBrightness(img2.getSubimage(x*blocksx, y*blocksy, blocksx - 1, blocksy - 1));
				int diff = Math.abs(b1 - b2);
				if (diff > factorA) { 
					gc.drawRect(x*blocksx, y*blocksy, blocksx - 1, blocksy - 1);
					this.match = false;
				}
				if (debugMode == 1) System.out.print((diff > factorA ? "X" : " "));
				if (debugMode == 2) System.out.print(diff + (x < comparex - 1 ? "," : ""));
			}
			if (debugMode > 0) System.out.println("|");
		}
	}
	
	
	public BufferedImage getChangeIndicator() {
		return imgc;
	}
	
	
	protected int getAverageBrightness(BufferedImage img) {
		Raster r = img.getData();
		int total = 0;
		for (int y = 0; y < r.getHeight(); y++) {
			for (int x = 0; x < r.getWidth(); x++) {
				total += r.getSample(r.getMinX() + x, r.getMinY() + y, 0);
			}
		}
		return (int)(total / ((r.getWidth()/factorD)*(r.getHeight()/factorD)));
	}
	

	
	public boolean match() {
		return this.match;
	}

	
	protected static BufferedImage imageToBufferedImage(Image img) {
		BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = bi.createGraphics();
		g2.drawImage(img, null, null);
		return bi;
	}
	
	
	protected static void saveJPG(Image img, String filename) {
		BufferedImage bi = imageToBufferedImage(img);
		FileOutputStream out = null;
		try { 
			out = new FileOutputStream(filename);
		} catch (java.io.FileNotFoundException io) { 
			System.out.println("File Not Found"); 
		}
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(bi);
		param.setQuality(0.8f,false);
		encoder.setJPEGEncodeParam(param);
		try { 
			encoder.encode(bi); 
			out.close(); 
		} catch (java.io.IOException io) {
			System.out.println("IOException"); 
		}
	}
	

	protected static Image loadJPG(String filename) {
		FileInputStream in = null;
		try { 
			in = new FileInputStream(filename);
		} catch (java.io.FileNotFoundException io) { 
			System.out.println("File Not Found"); 
		}
		JPEGImageDecoder decoder = JPEGCodec.createJPEGDecoder(in);
		BufferedImage bi = null;
		try { 
			bi = decoder.decodeAsBufferedImage(); 
			in.close(); 
		} catch (java.io.IOException io) {
			System.out.println("IOException");
		}
		return bi;
	}
	
}
