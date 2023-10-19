package com.prog2.labs;

public class SquareToRectangleAdapter implements Rectangle {

    int width;
    int height;
    
    public SquareToRectangleAdapter(Square square) {
        width = square.side;
        height = square.side;
    }
    
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
