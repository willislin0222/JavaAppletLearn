package com.zzk;

import java.applet.Applet;
import java.awt.Graphics;

public class HtmlShowApplet extends Applet{
	public void paint(Graphics g){
		g.drawString("html檔案已執行", 50, 50);
		g.drawString("在html中顯示了Applet程式", 50, 80);
	}

}
