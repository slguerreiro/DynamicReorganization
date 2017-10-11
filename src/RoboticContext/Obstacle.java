
//Title:        Plataforma Simulacao
//Version:      
//Copyright:    Copyright (c) 1999
//Author:       Sergio Guerreiro
//Company:      IST, MEIC 2002
//Description:  Your description
package RoboticContext;

public class Obstacle {

private Point m_Position;
private double m_DimensionX;
private double m_DimensionY;


  public Obstacle(double PositionX, double PositionY, double DimensionX, double DimensionY)
  {
      m_Position = new Point(PositionX,PositionY);
      m_DimensionX = DimensionX;
      m_DimensionY = DimensionY;
  }

  public void SetPositionX (double tmp) { m_Position.Set_X(tmp);};
  public void SetPositionY (double tmp) { m_Position.Set_Y(tmp);};
  public void SetDimensionX (double tmp) { m_DimensionX = tmp;};
  public void SetDimensionY (double tmp) { m_DimensionY = tmp;};

  public double GetPositionX () { return(m_Position.Get_X());};
  public double GetPositionY () { return(m_Position.Get_Y());};
  public double GetDimensionX () { return(m_DimensionX);};
  public double GetDimensionY () { return(m_DimensionY);};

  

} 