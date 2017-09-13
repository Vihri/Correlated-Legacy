package com.elytradev.correlated.client.gui.shell;

import com.elytradev.correlated.ColorType;
import com.elytradev.correlated.Correlated;
import com.elytradev.correlated.client.IBMFontRenderer;

public abstract class Program {
	protected GuiTerminalShell parent;
	public Program(GuiTerminalShell parent) {
		this.parent = parent;
	}
	public abstract void render(int rows, int cols);
	public abstract void keyTyped(char typedChar, int keyCode);
	public abstract String getName();
	public abstract void update();
	
	protected void drawString(float x, float y, String str) {
		IBMFontRenderer.drawString(x, y, str, ColorType.PALETTE.getColor((parent.palette*4)+1));
	}
	
	protected void drawStringInverseVideo(float x, float y, String str) {
		IBMFontRenderer.drawStringInverseVideo(x, y, str, ColorType.PALETTE.getColor((parent.palette*4)+1));
	}
}
