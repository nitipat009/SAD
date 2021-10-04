package com.solid.lsp;

public class Square implements Shape {
    private int Side;
    Square(int side) {
        Side = side;
    }

    public int getSide() {
        return Side;
    }

    @Override
    public int getArea(){
        return Side * Side;
    }
}
