package refactoring;

import refactoring.Rover.Position;

public class Obstacle {
    private Position position;

    public Obstacle(Position position){
        this.position = position;
    }

    public Position position(){
        return position;
    }
}
