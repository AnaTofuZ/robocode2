package e15_1;

import robocode.*;

public class E155730_2_1 extends Robot {
    private void move(double x, double y) {
        double dx = x - getX();
        double dy = y - getY();
        double r = Math.toDegrees(Math.atan2(dx, dy)) - getHeading();

        turnRight(r);
        ahead(Math.sqrt(dx * dx + dy * dy));
		double fin;
		double now = getHeading();
		fin = 0-now;
		turnRight(fin);   

 }

    public void run() {
        double width = getBattleFieldWidth();
        double height = getBattleFieldHeight();
        move(width/2, height/2);
		
    }
}
