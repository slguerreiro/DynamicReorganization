
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
import SimulatorPlatform.*;


public class EnvironmentDefinition {


RoboticGoal m_objectives;   // Objectivos Robóticos do contexto a apresentar
ArrayList m_variables;      // Array de robotic variables
ArrayList m_obstacles;      // Array de obstacles
Robot m_Robot;              // Robot Properties
double m_LimitX, m_LimitY;  // Limites da simulação
private double Time;        // Tempo actual


  ////////////////////////////////////////////
  //  Definição de ambiente do mundo real Robótico
  ////////////////////////////////////////////
  public EnvironmentDefinition()
  {
      m_obstacles = new ArrayList();
      m_objectives = new RoboticGoal(new Point(Constants.Final_Point_X_Value , Constants.Final_Point_Y_Value));
      m_variables = new ArrayList();
      m_Robot = new Robot();
  }


  public void Set_Time(double tmp) {Time = tmp;};
  public double Get_Time() {return (Time);};
  public void Add_Time(double tmp) { Time += tmp;};



  public RoboticGoal get_Objectives()
  {
   return (m_objectives);
  }

   ////////////////////////////////////////////
   //  Adiciona variável ao contexto robótico
   ////////////////////////////////////////////
  public boolean Set_Variable(String Name, int tmp)
  {
    return (m_variables.add(new RoboticVariable(Name,tmp)));
  }


   ////////////////////////////////////////////
   //  Adiciona variável ao contexto robótico
   ////////////////////////////////////////////
  public boolean Set_Variable(String Name, double tmp)
  {
    return (m_variables.add(new RoboticVariable(Name,tmp)));
  }



   ////////////////////////////////////////////
   //  Verifica se uma variável existe
   ////////////////////////////////////////////
  public boolean Exists_Variable(String Name)
  {
    RoboticVariable m_variable_tmp;

    for (int i=0;i<m_variables.size();i++)
     {
       m_variable_tmp = (RoboticVariable) m_variables.get(i);
       if (m_variable_tmp.Get_Name() == Name)
       {
         return (true);
       }
     }
     return (false);
  }


   ////////////////////////////////////////////
   //  Devolve todas as variáveis Robóticas
   ////////////////////////////////////////////
  public ArrayList Get_Variable()
  {
    return (m_variables);
  }


   ////////////////////////////////////////////
   // Faz o clear a uma variável Robótica
   // return false if not existe, true otherwise
   ////////////////////////////////////////////
   public boolean clear_Variable(String Name)
   {
    RoboticVariable m_variable_tmp;

    for (int i=0;i<m_variables.size();i++)
    {
      m_variable_tmp = (RoboticVariable) m_variables.get(i);
      if (m_variable_tmp.Get_Name() == Name)
      {
        m_variables.remove(i);
        return (true);
      }
    }
    return (false);
   }

   

   ////////////////////////////////////////////
   // Faz o update do valor a uma variável Robótica
   // return false if not existe, true otherwise
   ////////////////////////////////////////////
   public boolean Update_Variable(String Name, double new_tmp)
  {
    RoboticVariable m_variable_tmp;

    for (int i=0;i<m_variables.size();i++)
    {
      m_variable_tmp = (RoboticVariable) m_variables.get(i);
      if (m_variable_tmp.Get_Name() == Name)
      {
        m_variables.remove(i);
        m_variables.add(new RoboticVariable(Name,new_tmp));
        return (true);
      }
    }
    return (false);
  }


  public double Get_LimitX() { return(m_LimitX);};
  public double Get_LimitY() { return(m_LimitY);};
  public void Set_Limits(double x,double y) {m_LimitX = x; m_LimitY = y; };



  public ArrayList Get_Obstacles()
  {
    return (m_obstacles);
  }



  public ArrayList Get_Intermediate_Points()
  {
    return (m_objectives.Get_Intermediate_Point());
  }



  public Robot Get_Robot()
  {
    return (m_Robot);
  }



  public void Set_Obstacle(double x, double y, double maxx, double maxy)
  {
    Obstacle tmp =new Obstacle(x,y,maxx,maxy);

    m_obstacles.add(tmp);

  }


  public void Set_Robot_Velocity(double tmp)
  {
    m_Robot.Set_Robot_Velocity(tmp);
  };


  public void Set_Robot_Position (double x, double y)
  {
    m_Robot.SetPosition(x,y);
  }


  public void Set_Intermediate_Point (int a , Point c)
  {
    m_objectives.Set_Intermediate_Point(a , c);
  }


  public void Set_Robot_Dimension (double x, double y)
  {
    m_Robot.SetDimension(x,y);
  }



  public int Size()
  {
   return (m_variables.size());
  }



   public RoboticVariable Get_Element(int n)
  {
   return ((RoboticVariable) m_variables.get(n));
  }


}