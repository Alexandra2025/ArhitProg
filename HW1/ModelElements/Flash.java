package HW1.ModelElements;

import HW1.stuff.*;

import java.awt.*;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }
    public void rotate(Angle3D angle){
        this.angle = angle;
    }
    public void move(Point3D location){
        this.location = location;
    }
}