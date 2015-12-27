package e15_1;

//package名

import robocode.Robot;
import static robocode.util.Utils.normalRelativeAngleDegrees;

import java.awt.*;

public class E155730_2_1 extends Robot {
    private void move(double x, double y) {
        double mvX = x - getX();
        double mvY = y - getY();
        double r = Math.toDegrees(Math.atan2(mvX, mvY)) - getHeading();

        turnRight(r);
        ahead(Math.sqrt(mvX * mvX + mvY * mvY));
		turnLeft(normalRelativeAngleDegrees(getHeading()));

 }

    public void run() {
        double width = getBattleFieldWidth();
        double height = getBattleFieldHeight();
        move(width/2, height/2);
		
    }
}
