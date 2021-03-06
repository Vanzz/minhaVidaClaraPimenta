package engineTester;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;
import renderEngine.Loader;
import renderEngine.RawModel;
import renderEngine.Renderer;

public class MainGameLoop {
	
	public static void main(String[] args) {
		DisplayManager.createDisplay();
		
		Loader loader = new Loader();
		Renderer renderer = new Renderer();
		
		//OpenGL expects vertices to be defined  counter clockwise by default
		float[] vertices = {
				-0.5f, 0.5f, 0f,	//V0
				-0.5f, -0.5f, 0f,	//V1
				0.5f, -0.5f, 0f,	//V2
				0.5f, 0.5f, 0f,	 	//V3
		};
		
		int[] indices = {
				0,1,3, //Triângulo de cima (V0, V1, V3)
				3,1,2  //Triângulo de baixo (V3, V1, V2)
		};
		
		RawModel model = loader.loadToVAO(vertices, indices);
		
		while (!Display.isCloseRequested()) {
			renderer.prepare();
			//game logic
			renderer.render(model);
			//render
			DisplayManager.updateDisplay();
		}
		loader.cleanUp();
		DisplayManager.closeDisplay();
	}
}
