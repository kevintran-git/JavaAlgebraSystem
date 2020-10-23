package jui;

/**
*/
public interface MouseControl extends Controllable {
    boolean isMouseOver();

    void mouseReleased();

    void mousePressed();

    void mouseDragged();

    void mouseWheel();
}
