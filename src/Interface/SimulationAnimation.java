package Interface;


import javax.swing.*; // For JPanel, etc.
import java.awt.*;           // For Graphics, etc.
import java.awt.geom.*;      // For Ellipse2D, etc.
import java.lang.*;
import java.io.*;
import java.util.*;
import SimulatorPlatform.*;
import RoboticContext.*;  


/**
 * Title:        Plataforma de simulaçao genérica
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      MEIC, 2002
 * @author Sérgio Guerreiro
 * @version 1.0
 */


//////////////////////////////////////////////////////
//  Classe que desenha o ambiente Robotico Específico
//////////////////////////////////////////////////////
public class SimulationAnimation extends JPanel{

  private Rectangle2D.Double m_Robot = new Rectangle2D.Double(0,0,0,0);
  private Ellipse2D.Double m_final_Point = new Ellipse2D.Double(0,0,0,0);

  private int m_Limite_JanelaX , m_Limite_JanelaY;

  private ArrayList m_intermediate_points;

  private ArrayList m_Historial_Trajectorias;

  private double m_Robot_Position_X , m_Robot_Position_Y;
  private double m_Robot_dimension_X , m_Robot_dimension_Y;

  private ArrayList m_obstacles;

  private String time;

  // Gradiente dos obstaculos
  private GradientPaint gradient  = new GradientPaint(0, 0, Color.red, 175, 175, Color.yellow,true); // true means to repeat pattern
  private GradientPaint gradient2 = new GradientPaint(0, 0, Color.blue, 5, 5, Color.green,true); // true means to repeat pattern



  public SimulationAnimation(double PosX, double PosY, double DimX, double DimY, int JanX, int JanY)
  {
    m_Robot_Position_X = PosX;
    m_Robot_Position_Y = PosY;
    m_Robot_dimension_X = DimX;
    m_Robot_dimension_Y = DimY;
    m_obstacles = new ArrayList();
    m_intermediate_points = new ArrayList();
    m_Historial_Trajectorias = new ArrayList();
    setFont(new Font("Goudy Handtooled BT", Font.PLAIN, 10));
    m_Limite_JanelaX = JanX;
    m_Limite_JanelaY = JanY;
  }


  public void set_Robot_Position_X(double tmp)  {m_Robot_Position_X = tmp;};
  public void set_Robot_Position_Y(double tmp)  {m_Robot_Position_Y = tmp;};
  public void set_Robot_Dimension_X(double tmp) {m_Robot_dimension_X = tmp;};
  public void set_Robot_Dimension_Y(double tmp) {m_Robot_dimension_Y = tmp;};
  public void set_Time (double tmp) {time = String.valueOf(tmp);};
  public void set_FinalPoint(double tmpx, double tmpy)
  {
    m_final_Point.setFrame(tmpx,tmpy,Constants.Final_Point_Dimension_X_Value,Constants.Final_Point_Dimension_Y_Value);
  };





  public void Add_Obstacle(double posx, double posy, double dimx, double dimy)
  {
    Rectangle2D.Double tmp = new Rectangle2D.Double(posx, posy, dimx, dimy);
    m_obstacles.add(tmp);
  }



  public void set_Intermediate_Points(ArrayList ipoints)
  {

    for (int g=0 ; g < ipoints.size() ; g++)
    {
      RoboticContext.Point p_tmp = (RoboticContext.Point) ipoints.get(g);
      Ellipse2D.Double tmp = new Ellipse2D.Double(p_tmp.Get_X() , p_tmp.Get_Y() , Constants.Intermediate_Point_Dimension_X_Value , Constants.Intermediate_Point_Dimension_Y_Value);
      m_intermediate_points.add(tmp);
    }
  };


  protected void drawGradientObstacle(Rectangle2D.Double obst , Graphics2D g2d, int indice) {
    g2d.setPaint(gradient);
    g2d.fill(obst);
    g2d.setPaint(Color.black);
    g2d.draw(obst);
    double x_tmp = obst.getX();
    double y_tmp = obst.getY();
    g2d.drawString(String.valueOf(indice+1), (new Double(x_tmp)).intValue(), ( new Double(y_tmp)).intValue());

  }


  protected void drawGradientFinalPoint(Ellipse2D.Double obj , Graphics2D g2d) {
    g2d.setPaint(gradient2);
    g2d.fill(obj);
    g2d.setPaint(Color.black);
    g2d.draw(obj);
  }



  protected void drawState(Graphics2D g2d,String state) {
    g2d.setPaint(Color.black);
    g2d.drawString(state, 10, m_Limite_JanelaY);
  }



  public void paintComponent(Graphics g) {
    clear(g);
    Graphics2D g2d = (Graphics2D)g;

     // desenha Obstáculos
     for (int h=0 ; h < m_obstacles.size() ; h++)
     {
         drawGradientObstacle((Rectangle2D.Double) m_obstacles.get(h),g2d,h);
     }

     //Faz o set da posição do Robot
     m_Robot.setRect(m_Robot_Position_X,m_Robot_Position_Y,m_Robot_dimension_X,m_Robot_dimension_Y);

      // Desenha Robot
     g2d.draw(m_Robot);
     // Desenha Ponto Final
     drawGradientFinalPoint(m_final_Point,g2d);


     // Desenha trajectoria criada
     if (m_Historial_Trajectorias.size() >= 2)
     {
       for (int b=0 ; b < m_Historial_Trajectorias.size()-1 ; b++)
       {
           g2d.draw(new Line2D.Double((Point2D.Double) m_Historial_Trajectorias.get(b),(Point2D.Double) m_Historial_Trajectorias.get(b+1)));
       }
     }

     // Desenha os pontos intermédios
     for (int h=0 ; h < m_intermediate_points.size() ; h++)
     {
         g2d.fill((Ellipse2D.Double) m_intermediate_points.get(h));
     }
     drawState(g2d,"Time= "+time+" [seconds]");
  }



  // super.paintComponent clears offscreen pixmap,
  // since we're using double buffering by default.

  protected void clear(Graphics g)
  {
    super.paintComponent(g);
  }

  public void AddTrajectoryPoint(double x, double y)
  {
    m_Historial_Trajectorias.add(new Point2D.Double(x,y));
  }

}



