package pl.edu.agh.mwo.hellomaven;

import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;

import java.util.Random;

/**
 * Simple main application.
 */
public class App {

    public static final int TEXT_WIDTH = 120;
    public static final int TEXT_HEIGHT = 20;
    public static final int BOUND = 10;

    public static void main(String[] args) {

        IRender render = new Render();
        IContextBuilder builder = render.newBuilder();
        builder.width(TEXT_WIDTH).height(TEXT_HEIGHT);
        builder.element(new PseudoText("Hello Maven"));
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
        System.out.println(s);
    }
    
    public int getRandomNumber() {
        return new Random().nextInt(BOUND);
    }
}
