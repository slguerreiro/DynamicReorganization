package RoboticContext;

public class Robot {
private Point m_Position;
private double m_DimensionX;
private double m_DimensionY;
private double m_velocity;


  public Robot() {
    m_Position = new Point();
  }

  public void Set_Robot_Velocity(double tmp) {m_velocity = tmp;};
  public double Get_Robot_Velocity() {return (m_velocity);};

  public void SetPosition(double x, double y)
  {
    m_Position.Set_X(x);
    m_Position.Set_Y(y);
  }


  public void SetDimension (double x, double y)
  {
    m_DimensionX=x;
    m_DimensionY=y;
  }

  public double GetPositionX() { return(m_Position.Get_X());};
  public double GetPositionY() { return(m_Position.Get_Y());};
  public double GetDimensionX() { return(m_DimensionX);};
  public double GetDimensionY() { return(m_DimensionY);};

  public Point GetPosition() {return(m_Position);};

} 