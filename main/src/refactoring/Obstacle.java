package refactoring;

import refactoring.SimpleViewPoint.Position;

public class Obstacle {
    private Position position;

    public Obstacle(Position position){
        this.position = position;
    }

    public Position position(){
        return position;
    }
}
