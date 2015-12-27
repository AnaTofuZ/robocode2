package e15_1;

//package名

import robocode.Robot;
import static robocode.util.Utils.normalRelativeAngleDegrees;

/**
 *importするクラス名。
 *robocode直下のRobot(メインメソッド)と
 *staticメソッドとしてutil.Utils.normalRelativeAngleDegrees
 *をそれぞれimportする。
 */

import java.awt.*;

/**
 * e155730_2_1 - バトルフィールドの中心に移動するrobot
 * 学籍番号155730B 清水隆博
 */

public class E155730_2_1 extends Robot {
			//Robotを継承
    private void move(double x, double y) {
	//void型メソッドmoveを定義，runメソッドからx,yを受け取る

        double mvX = x - getX();
        double mvY = y - getY();
        double r = normalRelativeAngleDegrees(Math.toDegrees(Math.atan2(mvX, mvY)) - getHeading());

        turnRight(r);
        ahead(Math.sqrt(mvX * mvX + mvY * mvY));
		turnLeft(normalRelativeAngleDegrees(getHeading()));

 }

    public void run() {
        double whalf = getBattleFieldWidth()/2;
        double hhalf = getBattleFieldHeight()/2;
        move(whalf, hhalf);

    }
}
