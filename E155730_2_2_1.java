package e15_1;

import robocode.*;
import robocode.AdvancedRobot;
import static robocode.util.Utils.normalRelativeAngleDegrees;
import java.awt.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * E155730_2_2 - a robot by (your name here)
 */
public class E155730_2_2 extends AdvancedRobot{
	/**
	 * run: E155730_2_2's default behavior
	 */

	 public void run()	{
	 		 double px	=	getX();	/*現在のロボットの x 座標を取得*/
	 										 double py	=	getY();	/*現在のロボットの y 座標を取得*/
	 										 double w	=	getBattleFieldWidth()/2;	/*中心の x 座標を取得*/
	 										double h	=	getBattleFieldHeight()/2;	/*中心の y 座標を取得*/
	 											double x	=	px	- w;	/*中心との x 座標の差を取得*/
	 												 double y	=	py	- h;	/*中心との y 座標の差を取得*/
	 if(Math.sqrt(x*x+y*y)<250){/*出現位置の中心からの距離が 250 未満の場合*/
	 if (x<=0 &&	y<=0){	/*第 3 象限での出現*/
	 		turnRight(getAngle(y,x)	+	90 - getHeading());	/*出現位置で中心に対して垂直に向く*/
	 }else if (x<=0 &&	y>=0){	/*第 2 象限での出現*/
	 		turnRight(getAngle(x,y)	+	180 - getHeading());	/*出現位置で中心に対して垂直に向く*/
	 }else if (x>=0 &&	y>=0){	/*第 1 象限での出現*/
	 		turnRight(getAngle(y,x)	+	270 - getHeading());	/*出現位置で中心に対して垂直に向く*/
	 }else if (x>=0 &&	y<=0){	/*第 4 象限での出現*/
	 		turnRight(getAngle(x,y)	+	360 - getHeading());	/*出現位置で中心に対して垂直に向く*/
	 }
	 Circle();	/*Circle メソッドを参照*/
	 }
	 		if(Math.sqrt(x*x+y*y)>=250){	/*出現位置の中心からの距離が 250 以上の場合*/
	 if (x<=0 &&	y<=0){	/*第 3 象限での出現*/
	 		turnRight(getAngle(y,x)	- getHeading());	/*中心を向く*/
	 }else if (x<=0 &&	y>=0){ /*第 2 象限での出現*/
	 		turnRight(getAngle(x,y)	+	90 - getHeading());	/*中心を向く*/
	 }else if (x>=0 &&	y>=0){	/*第 1 象限での出現*/
	 		turnRight(getAngle(y,x)	+	180 - getHeading());	/*中心を向く*/
	 }else if (x>=0 &&	y<=0){	/*第 4 象限での出現*/
	 		turnRight(getAngle(x,y)	+	270 - getHeading());	/*中心を向く*/
	 }
	 ahead(Math.sqrt(x*x+y*y)	- 250);	/*中心に向かって(半径-250)移動*/
	 				}
	 if (x<=0 &&	y<=0){	/*第 3 象限での出現*/
	 		turnRight(getAngle(y,x)	+	90 - getHeading());	/*移動場所から中心に対して垂直に向く*/
	 }else if (x<=0 &&	y>=0){	/*第 2 象限での出現*/
	 		turnRight(getAngle(x,y)	+	180 - getHeading());	/*移動場所から中心に対して垂直に向く*/
	 }else if (x>=0 &&	y>=0){	/*第 1 象限での出現*/
	 		turnRight(getAngle(y,x)	+	270 - getHeading());	/*移動場所から中心に対して垂直に向く*/
	 }else if (x>=0 &&	y<=0){	/*第 4 象限での出現*/
	 turnRight(getAngle(x,y)	+	360 - getHeading());	/*移動場所から中心に対して垂直に向く*/
	 }
	 						Circle();	/*Circle メソッドを参照*/
	 		}
	 		public double getAngle(double x,	double y){	/*getAngle メソッド 引数 x,y*/
	 x	=	Math.abs(x);		/*x を絶対値化*/
	 y	=	Math.abs(y);		/*y を絶対値化*/
	 double angle	=	Math.atan(y/x);	/*中心に対してのラジアンを取得*/
	 return (angle*180/Math.PI);	/*中心に対しての角度を返す*/
	 		}
	 						public void Circle(){	/*Circle メソッドを取得*/
	 double px	=	getX();	/*現在のロボットの x 座標を取得
	 */
	 															 double py	=	getY();	/*現在のロボットの y 座標を取得*/
	 															 double w	=	getBattleFieldWidth()/2;	/*中心の x 座標を取得*/
	 														double h	=	getBattleFieldHeight()/2;	/*中心の y 座標を取得*/
	 															 double x	=	px	- w;	/*中心との x 座標の差を取得*/
	 															 double y	=	py	- h;	/*中心との y 座標の差を取得*/
	 									 while(true){	/*advancedrobot を用いて円周の長さを進む間に 360 度回転させる*/
	 						setTurnLeft(1);
	 						ahead(2*Math.PI*Math.sqrt(x*x+y*y)/360);
	 								}
	 }
	 }
