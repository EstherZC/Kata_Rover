package refactoring;

public class Camera {
    private CameraView frontView;
    private CameraView rearView;
    private int degrees;

    public Camera(){
        degrees = 0;
    }

    public Camera(int degrees){
        this.degrees = degrees;
    }
    public void turnLeft(int degrees) {
        this.degrees += degrees;
    }

    public void turnRight(int degrees) {
        this.degrees += degrees;
    }
}
