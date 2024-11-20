public class MovablePoint extends Point {
    private float xSpeedPoint;
    private float ySpeedPoint;

    
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeedPoint = xSpeed;
        this.ySpeedPoint = ySpeed;
    }

    public MovablePoint(float x, float y) {
        super(x, y);  
        this.xSpeedPoint = 0.0f;
        this.ySpeedPoint = 0.0f;
    }

    public MovablePoint() {
        super();  
        this.xSpeedPoint = 0.0f;
        this.ySpeedPoint = 0.0f;
    }

    
    public float getXSpeed() {
        return xSpeedPoint;
    }

    public float getYSpeed() {
        return ySpeedPoint;
    }

    public float[] getSpeed() {
        return new float[] {xSpeedPoint, ySpeedPoint};
    }

    
    public void setXSpeed(float xSpeed) {
        this.xSpeedPoint = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeedPoint = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeedPoint = xSpeed;
        this.ySpeedPoint = ySpeed;
    }

    
    public MovablePoint move() {
        setX(getX() + xSpeedPoint);  
        setY(getY() + ySpeedPoint);  
        return this;
    }

    
    @Override
    public String toString() {
        return super.toString() + ",speed=(" + xSpeedPoint + "," + ySpeedPoint + ")";
    }
}
