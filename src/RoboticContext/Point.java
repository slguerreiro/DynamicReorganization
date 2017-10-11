
//Title:        Plataforma Simulacao
//Version:
//Copyright:    Copyright (c) 1999
//Author:       Sergio Guerreiro
//Company:      IST, MEIC 2002
//Description:  Your description
package RoboticContext;
import java.lang.*;
import java.io.*;
import java.util.*;


public class Point {
private double m_X;
private double m_Y;

private int Obstacle_ID;


  ////////////////////////////////////////////////////
  //  Defini um ponto em cordenadas 2D
  ////////////////////////////////////////////////////
  public Point(double X, double Y)
  {
    Set_X(X);
    Set_Y(Y);
  }

  public Point()
  {
  }


  public void set_ObstacleID(int ymp) {Obstacle_ID = ymp+1;};
  public int get_ObstacleID() {return(Obstacle_ID);};

  ////////////////////////////////////////////////////
  //  Set da coordenada X
  ////////////////////////////////////////////////////
  public boolean Set_X(double X_tmp)
  {
    m_X=X_tmp;
    return (true);
  }


  ////////////////////////////////////////////////////
  //  Set da coordenada Y
  ////////////////////////////////////////////////////
  public boolean Set_Y(double Y_tmp)
  {
    m_Y=Y_tmp;
    return (true);
  }


  ////////////////////////////////////////////////////
  //  Get da coordenada X
  ////////////////////////////////////////////////////
  public double Get_X()
  {
    return (m_X);
  }


  ////////////////////////////////////////////////////
  //  Get da coordenada Y
  ////////////////////////////////////////////////////
   public double Get_Y()
  {
    return (m_Y);
  }

  public void AddPoint(Point x)
  {
    m_X += x.Get_X();
    m_Y += x.Get_Y();
  }

  public void Inc_X() {   m_X ++; }
  public void Inc_Y() {   m_Y ++; }
  public void Dec_X() {   m_X --; }
  public void Dec_Y() {   m_Y --; }

  public void Less_X(double tmp) { m_X -= tmp;};
  public void Less_Y(double tmp) { m_Y -= tmp;};

}