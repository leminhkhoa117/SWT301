package khoalm.example;
import java.util.logging.Logger;

interface Drawable {
    Logger logger = Logger.getLogger(Drawable.class.getName());
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        logger.info("Drawing a circle");
    }
}
