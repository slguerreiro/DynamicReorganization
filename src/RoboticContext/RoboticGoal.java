
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


public class RoboticGoal {

Point m_finalpoint;
ArrayList m_intermediate_points;


  ////////////////////////////////////////////////////
  //  Cria um Objectivo Robótico específico
  ////////////////////////////////////////////////////
  public RoboticGoal(Point Final_Point) {
    m_intermediate_points = new ArrayList();
    m_finalpoint = Final_Point;
  }


  ////////////////////////////////////////////////////
  //  Adiciona um objectivo intermédio
  ////////////////////////////////////////////////////
  public boolean Set_Intermediate_Point(Point tmp)
  {
    if (m_intermediate_points.add(tmp) == true) return (true);
    else return (false);
  }


    ////////////////////////////////////////////////////
  //  Adiciona um objectivo intermédio
  ////////////////////////////////////////////////////
  public void Set_Intermediate_Point(int a , Point tmp)
  {
    m_intermediate_points.clear();
    m_intermediate_points.add(a , tmp);
  }



  ////////////////////////////////////////////////////
  //  Limpa a lista de objectivos intermédios
  ////////////////////////////////////////////////////
  public void Clear_Intermediate_Points()
  {
    m_intermediate_points.clear();
  }


  ////////////////////////////////////////////////////
  //  Limpa uma entrada da lista de objectivos intermédios
  ////////////////////////////////////////////////////
  public void Clear_Intermediate_Points(int tmp)
  {
    m_intermediate_points.remove(tmp);
  }


  ////////////////////////////////////////////////////
  //  Devolve lista de pontos intermédios
  ////////////////////////////////////////////////////
  public ArrayList Get_Intermediate_Point()
  {
    return (m_intermediate_points);
  }

  public Point Get_Final_Point()
  {
    return (m_finalpoint);
  }

  public String toString()
  {
    String tmp = new String ("Final x="+m_finalpoint.Get_X() + " Final y="+m_finalpoint.Get_Y()+"\n");
    Point tmp2;

    for (int i=0; i < m_intermediate_points.size(); i++)
    {
      tmp2 =(Point) m_intermediate_points.get(i);
      tmp += "Intermediate x=" +tmp2.Get_X() + "Intermediate y="+tmp2.Get_Y();
    }
    return(tmp);
  }


}