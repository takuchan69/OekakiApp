package package in.net.find18.oekakiApp;

import android.graphics.Point;
import java.util.ArrayList;

public class Line{
  //set line color
  private int color;
  //create one Line
  private ArrayList<Point> point;

  //call constructor
  public Line(int color){
    points = new ArrayList<Point>();
    this.color = color;
  }

  //set color
  public int getColor(){
    return color;
  }

  //return ArrayList of point which is constructing  Line
  public ArrayList<Point> getPoints(){
    return points;
  }

  //add point to Line
  public void addPoint(Point p){
    points.add(p);
  }
}
