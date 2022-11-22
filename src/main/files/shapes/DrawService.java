package main.files.shapes;

import java.util.List;

public class DrawService {
    public void drawShape(List<Drawable> shapes) {
        for(Drawable drawable : shapes) {
            drawable.draw();
        }
    }
}
