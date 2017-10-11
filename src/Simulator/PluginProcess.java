//Source file: C:/Meic/Tese/VigilanciaRoboticoCaseStudy/Codigo/Simulator/PluginProcess.java

package Simulator;
import java.lang.*;
import java.io.*;
import java.util.*;
import RoboticContext.*;
import DataRepository.*;
import SimulatorPlatform.*;
import Interface.*;

/**
 * @author
 * @version
 */
public class PluginProcess
{
EnvironmentDefinition m_ambienteRobotico;
private GraphicalViewer m_graphical_animation;

   public PluginProcess()
   {
    System.out.println("Plugin Process created...");
    WriteFile.Writeln("Plugin Process created...",Constants.pathOutputFile,Constants.OutputFile);

    m_ambienteRobotico = new EnvironmentDefinition();

    // Criacão de todas as variaveis que compõem o ambiente robótico
    m_ambienteRobotico.Set_Variable(Constants.LimitX , Constants.LimitX_value);
    m_ambienteRobotico.Set_Variable(Constants.LimitY , Constants.LimitY_value);
    m_ambienteRobotico.Set_Variable(Constants.RobotPositionX , Constants.RobotPositionX_value);
    m_ambienteRobotico.Set_Variable(Constants.RobotPositionY , Constants.RobotPositionY_value);
    m_ambienteRobotico.Set_Variable(Constants.RobotDimensionX , Constants.RobotDimensionX_value);
    m_ambienteRobotico.Set_Variable(Constants.RobotDimensionY , Constants.RobotDimensionY_value);
    m_ambienteRobotico.Set_Variable(Constants.RobotVelocity , Constants.RobotVelocity_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_1_X , Constants.Obstacle_1_X_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_2_X , Constants.Obstacle_2_X_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_3_X , Constants.Obstacle_3_X_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_4_X , Constants.Obstacle_4_X_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_5_X , Constants.Obstacle_5_X_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_6_X , Constants.Obstacle_6_X_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_7_X , Constants.Obstacle_7_X_value);

    m_ambienteRobotico.Set_Variable(Constants.Obstacle_1_Y , Constants.Obstacle_1_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_2_Y , Constants.Obstacle_2_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_3_Y , Constants.Obstacle_3_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_4_Y , Constants.Obstacle_4_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_5_Y , Constants.Obstacle_5_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_6_Y , Constants.Obstacle_6_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_7_Y , Constants.Obstacle_7_Y_value);


    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_1_X , Constants.Obstacle_Dimension_1_X_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_2_X , Constants.Obstacle_Dimension_2_X_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_3_X , Constants.Obstacle_Dimension_3_X_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_4_X , Constants.Obstacle_Dimension_4_X_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_5_X , Constants.Obstacle_Dimension_5_X_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_6_X , Constants.Obstacle_Dimension_6_X_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_7_X , Constants.Obstacle_Dimension_7_X_value);

    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_1_Y , Constants.Obstacle_Dimension_1_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_2_Y , Constants.Obstacle_Dimension_2_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_3_Y , Constants.Obstacle_Dimension_3_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_4_Y , Constants.Obstacle_Dimension_4_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_5_Y , Constants.Obstacle_Dimension_5_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_6_Y , Constants.Obstacle_Dimension_6_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Obstacle_Dimension_7_Y , Constants.Obstacle_Dimension_7_Y_value);
    m_ambienteRobotico.Set_Variable(Constants.Final_Point_X , Constants.Final_Point_X_Value);
    m_ambienteRobotico.Set_Variable(Constants.Final_Point_Y , Constants.Final_Point_Y_Value);
    m_ambienteRobotico.Set_Variable(Constants.Time , Constants.Time_value);


// Criação dos obstaculos para a simulação gráfica e plugin process
    m_ambienteRobotico.Set_Obstacle(Constants.Obstacle_1_X_value, Constants.Obstacle_1_Y_value , Constants.Obstacle_Dimension_1_X_value , Constants.Obstacle_Dimension_1_Y_value);
    m_ambienteRobotico.Set_Obstacle(Constants.Obstacle_2_X_value, Constants.Obstacle_2_Y_value , Constants.Obstacle_Dimension_2_X_value , Constants.Obstacle_Dimension_2_Y_value);
    m_ambienteRobotico.Set_Obstacle(Constants.Obstacle_3_X_value, Constants.Obstacle_3_Y_value , Constants.Obstacle_Dimension_3_X_value , Constants.Obstacle_Dimension_3_Y_value);
    m_ambienteRobotico.Set_Obstacle(Constants.Obstacle_4_X_value, Constants.Obstacle_4_Y_value , Constants.Obstacle_Dimension_4_X_value , Constants.Obstacle_Dimension_4_Y_value);
    m_ambienteRobotico.Set_Obstacle(Constants.Obstacle_5_X_value, Constants.Obstacle_5_Y_value , Constants.Obstacle_Dimension_5_X_value , Constants.Obstacle_Dimension_5_Y_value);
    m_ambienteRobotico.Set_Obstacle(Constants.Obstacle_6_X_value, Constants.Obstacle_6_Y_value , Constants.Obstacle_Dimension_6_X_value , Constants.Obstacle_Dimension_6_Y_value);
    m_ambienteRobotico.Set_Obstacle(Constants.Obstacle_7_X_value, Constants.Obstacle_7_Y_value , Constants.Obstacle_Dimension_7_X_value , Constants.Obstacle_Dimension_7_Y_value);

    m_ambienteRobotico.Set_Robot_Dimension(Constants.RobotDimensionX_value , Constants.RobotDimensionY_value);
    m_ambienteRobotico.Set_Robot_Position(Constants.RobotPositionX_value , Constants.RobotPositionY_value);
    m_ambienteRobotico.Set_Limits(Constants.LimitX_value , Constants.LimitY_value);
    m_ambienteRobotico.Set_Robot_Velocity(Constants.RobotVelocity_value);
    m_ambienteRobotico.Set_Time(Constants.Time_value);


        // Criação da simulação gráfica com as dimensões do ambiente Robótico correctas
    m_graphical_animation = new GraphicalViewer (m_ambienteRobotico);

   }




    public boolean IsFinalState()
    {
        if (  (Constants.Final_Point_X_Value == m_ambienteRobotico.Get_Robot().GetPositionX())   &&
              (Constants.Final_Point_Y_Value == m_ambienteRobotico.Get_Robot().GetPositionY())
            )
            return (true);
       else return (false);
    }


//////////////////////////////////////////////////////////////////////////////
// Executa o plugin process
//     (Vai implementar o funcionamento específico de um processo robótico)
//////////////////////////////////////////////////////////////////////////////
   public ActualEnvironment execute(RoboticGoal m_goal)
   {
   // System.out.println( "!!!!!!!!!!!!!!"+   m_goal.Get_Intermediate_Point().toString());
   // WriteFile.Writeln( "!!!!!!!!!!!!!!"+   m_goal.Get_Intermediate_Point().toString());

    Point m_interpolation_final_point;
    Point point_tmp;


   // Actualização da posição do robot para o contexto do Engine
      if (m_goal.Get_Intermediate_Point().size() != 0)
      {
           // Calcula ponto intermédio para simulação gráfica
           m_ambienteRobotico.Set_Intermediate_Point(0,(Point) m_goal.Get_Intermediate_Point().get(0)); // Apenas recebe um ponto intermedio que coloca na lista de prioridades na posição 0
           m_interpolation_final_point = (Point) m_goal.Get_Intermediate_Point().get(0);
           m_interpolation_final_point.AddPoint(m_ambienteRobotico.Get_Robot().GetPosition());

           // Carrega ponto intermédio no universo global de variáveis
           if (m_ambienteRobotico.Exists_Variable(Constants.Intermediate_Point_X) == true)
           {
               m_ambienteRobotico.Update_Variable(Constants.Intermediate_Point_X , m_interpolation_final_point.Get_X());
               m_ambienteRobotico.Update_Variable(Constants.Intermediate_Point_Y , m_interpolation_final_point.Get_Y());
           }
           else
           {
               m_ambienteRobotico.Set_Variable(Constants.Intermediate_Point_X , m_interpolation_final_point.Get_X());
               m_ambienteRobotico.Set_Variable(Constants.Intermediate_Point_Y , m_interpolation_final_point.Get_Y());
           }
      }
      else
      {
          m_ambienteRobotico.clear_Variable(Constants.Intermediate_Point_X);
          m_ambienteRobotico.clear_Variable(Constants.Intermediate_Point_Y);
          m_interpolation_final_point = m_ambienteRobotico.get_Objectives().Get_Final_Point();
      }



      // Devolve o ponto de intersecção com qualquer obstáculo presente na cena
      System.out.println ("pontos para intersecção:"+m_ambienteRobotico.Get_Robot().GetPosition().Get_X()+m_interpolation_final_point.Get_X());
      WriteFile.Writeln ("pontos para intersecção:"+m_ambienteRobotico.Get_Robot().GetPosition().Get_X()+" "+m_interpolation_final_point.Get_X(),Constants.pathOutputFile,Constants.OutputFile);
      point_tmp = Intersect_Verify(m_ambienteRobotico.Get_Robot().GetPosition() , m_interpolation_final_point , m_ambienteRobotico.Get_Obstacles());
      if (point_tmp != null)
      {
      // Carrega o novo ponto de intersecção
        m_interpolation_final_point = point_tmp;
    //    System.out.println ("Intersecção encontrada : PosX="+m_interpolation_final_point.Get_X()+" PosY="+m_interpolation_final_point.Get_Y());
    //    WriteFile.Writeln ("Intersecção encontrada : PosX="+m_interpolation_final_point.Get_X()+" PosY="+m_interpolation_final_point.Get_Y());
      }


      // controlar a posição pelas dimensões da cena
      if ( m_interpolation_final_point.Get_X() < 0) m_interpolation_final_point.Set_X(0);
      else if ( m_interpolation_final_point.Get_X() > (m_ambienteRobotico.Get_LimitX() - m_ambienteRobotico.Get_Robot().GetDimensionX()) )
            m_interpolation_final_point.Set_X( m_ambienteRobotico.Get_LimitX() - m_ambienteRobotico.Get_Robot().GetDimensionX() -10 );

      if ( m_interpolation_final_point.Get_Y() < 0) m_interpolation_final_point.Set_Y(0);
      else if ( m_interpolation_final_point.Get_Y() > (m_ambienteRobotico.Get_LimitY() - m_ambienteRobotico.Get_Robot().GetDimensionY()) )
            m_interpolation_final_point.Set_Y( m_ambienteRobotico.Get_LimitY() - m_ambienteRobotico.Get_Robot().GetDimensionY() -10);



      // Faz o update ao environment
      m_ambienteRobotico.Update_Variable(Constants.RobotPositionX , m_interpolation_final_point.Get_X());
      m_ambienteRobotico.Update_Variable(Constants.RobotPositionY , m_interpolation_final_point.Get_Y());

      //  Update à dimensão do tempo
      double t = (  java.lang.Math.sqrt ( (java.lang.Math.pow((m_interpolation_final_point.Get_X() - m_ambienteRobotico.Get_Robot().GetPositionX()),2)) +
                                           (java.lang.Math.pow((m_interpolation_final_point.Get_Y() - m_ambienteRobotico.Get_Robot().GetPositionY()),2))
                                         )
                   / m_ambienteRobotico.Get_Robot().Get_Robot_Velocity());


      // update posicao robot
       m_ambienteRobotico.Set_Robot_Position(m_interpolation_final_point.Get_X() , m_interpolation_final_point.Get_Y());
       m_ambienteRobotico.Add_Time(t);
       m_ambienteRobotico.Update_Variable(Constants.Time,m_ambienteRobotico.Get_Time());

      // update à animação gráfica
      System.out.println(m_ambienteRobotico.Get_Intermediate_Points().toString());
      WriteFile.Writeln(m_ambienteRobotico.Get_Intermediate_Points().toString(),Constants.pathOutputFile,Constants.OutputFile);
      m_graphical_animation.DrawRobot(m_ambienteRobotico);

     // criação do environment para devolver
     return (Actual_Environment());
   }





////////////////////////////////////
// Devolve o ambiente actual segundo o contexto robótico
////////////////////////////////////
   public EnvironmentDefinition Get_Plugin_Process_State()
   {
      return(m_ambienteRobotico);
   }




////////////////////////////////////
// Devolve o ambiente actual
////////////////////////////////////
   public ActualEnvironment Actual_Environment()
   {
   ActualEnvironment m_actual_state = new ActualEnvironment();

      if (m_ambienteRobotico.Get_Variable().size() > 0 )
      {
        PPMData m_estadorobot;
        RoboticVariable m_robot_variable;
        for (int j=0;j<m_ambienteRobotico.Get_Variable().size();j++)
        {
          m_robot_variable = (RoboticVariable)m_ambienteRobotico.Get_Variable().get(j);

          m_estadorobot = new PPMData(null,m_robot_variable.Get_Name(),String.valueOf(m_robot_variable.Get_Value()),null);
          m_actual_state.AddVariable(m_estadorobot);
        }
        return (m_actual_state);
      }
      else return (null);
   }



///////////////////////////////////////////////////////////////////
// Valida a intersecção da trajectoria do robot com todos os obstaculo
///////////////////////////////////////////////////////////////////
   public Point Intersect_Verify (Point i, Point f, ArrayList obstacles)
   {
    double x0 = i.Get_X();
    double y0 = i.Get_Y();
    double x1 = f.Get_X();
    double y1 = f.Get_Y();
    Point point_return = new Point();
    point_return = null;
    ArrayList lista_pontos = new ArrayList();
    Obstacle obstaculo_cena;
    Point point_aux = new Point();

    // Para cada obstaculo verificação de intersecção entre trajectoria e lado obstaculo
    for (int k=0; k < obstacles.size() ; k++ )
    {
      obstaculo_cena = (Obstacle) obstacles.get(k);
      double x2 = obstaculo_cena.GetPositionX();
      double y2 = obstaculo_cena.GetPositionY();
      double dmx = obstaculo_cena.GetDimensionX();
      double dmy = obstaculo_cena.GetDimensionY();

/*      point_aux = calculate2 ( x0, y0, x1, y1, x2 - Constants.RobotDimensionX_value,
                                               y2 - Constants.RobotDimensionY_value,
                                               x2 - Constants.RobotDimensionX_value,
                                               y2 + dmy + Constants.RobotDimensionY_value);*/
      point_aux = calculate2 ( x0, y0, x1, y1, x2 - Constants.RobotDimensionX_value,
                                               y2 - Constants.RobotDimensionY_value,
                                               x2 - Constants.RobotDimensionX_value,
                                               y2 + dmy);

      if (point_aux != null)
      {
        point_aux.set_ObstacleID(k);
        lista_pontos.add(point_aux);
      }

/*      point_aux = calculate2 ( x0, y0, x1, y1, x2 - Constants.RobotDimensionX_value,
                                               y2 + dmy + Constants.RobotDimensionY_value,
                                               x2 + dmx + Constants.RobotDimensionX_value,
                                               y2 + dmy + Constants.RobotDimensionY_value);*/
      point_aux = calculate2 ( x0, y0, x1, y1, x2 - Constants.RobotDimensionX_value,
                                               y2 + dmy,
                                               x2 + dmx,
                                               y2 + dmy);
      if (point_aux != null)
      {
        point_aux.set_ObstacleID(k);
        lista_pontos.add(point_aux);
      }

/*      point_aux = calculate2 ( x0, y0, x1, y1, x2 + dmx + Constants.RobotDimensionX_value,
                                               y2 + dmy + Constants.RobotDimensionY_value,
                                               x2 + dmx + Constants.RobotDimensionX_value,
                                               y2 - Constants.RobotDimensionY_value);*/

      point_aux = calculate2 ( x0, y0, x1, y1, x2 + dmx,
                                               y2 + dmy,
                                               x2 + dmx,
                                               y2 - Constants.RobotDimensionY_value);

      if (point_aux != null)
      {
        point_aux.set_ObstacleID(k);
        lista_pontos.add(point_aux);
      }

/*      point_aux = calculate2 ( x0, y0, x1, y1, x2 + dmx + Constants.RobotDimensionX_value,
                                               y2 - Constants.RobotDimensionY_value,
                                               x2 - Constants.RobotDimensionX_value,
                                               y2 - Constants.RobotDimensionY_value);*/

      point_aux = calculate2 ( x0, y0, x1, y1, x2 + dmx,
                                               y2 - Constants.RobotDimensionY_value,
                                               x2 - Constants.RobotDimensionX_value,
                                               y2 - Constants.RobotDimensionY_value);

      if (point_aux != null)
      {
        point_aux.set_ObstacleID(k);
        lista_pontos.add(point_aux);
      }
    }


    double distance = Double.MAX_VALUE;
    int obs_ID = -1;

    // Escolha do ponto de intersecçao mais perto do robot
    for (int k=0; k < lista_pontos.size(); k++)
    {
      point_aux = (Point) lista_pontos.get(k);

//      System.out.println("Intersx="+point_aux.Get_X()+" Intersy="+point_aux.Get_Y());
//      WriteFile.Writeln("Intersx="+point_aux.Get_X()+" Intersy="+point_aux.Get_Y());

      double d = java.lang.Math.sqrt ( (java.lang.Math.pow((point_aux.Get_X() - x0),2)) +
                                       (java.lang.Math.pow((point_aux.Get_Y() - y0),2))
                                     );
  //            System.out.println("Ponto x0="+x0+" ponto y0="+y0+" x1="+point_aux.Get_X()+" y1="+point_aux.Get_Y()+" d="+d);
  //            WriteFile.Writeln("Ponto x0="+x0+" ponto y0="+y0+" x1="+point_aux.Get_X()+" y1="+point_aux.Get_Y()+" d="+d);
      if ( d < distance)
      {
        point_return = point_aux;

        double percentage = Constants.Obstacle_Security_Distance / d;

        if (percentage > 1.0) percentage = 1.0;

        double dx = (point_aux.Get_X() - x0) * percentage;
        double dy = (point_aux.Get_Y() - y0) * percentage;

        point_return.Less_X(dx);
        point_return.Less_Y(dy);

        distance = d;
        obs_ID = point_return.get_ObstacleID();

 //       System.out.println("----------------------------------");
 //       System.out.println("Ponto x0="+x0+" ponto y0="+y0+" x1="+point_aux.Get_X()+" y1="+point_aux.Get_Y()+" d="+distance);
 //       WriteFile.Writeln("----------------------------------");
 //       WriteFile.Writeln("Ponto x0="+x0+" ponto y0="+y0+" x1="+point_aux.Get_X()+" y1="+point_aux.Get_Y()+" d="+distance);



      }
    }


    // Introduz distância ao obstáculo mais perto
    if (distance < Double.MAX_VALUE)
    {
      if (m_ambienteRobotico.Exists_Variable(Constants.Next_Obstacle_Distance) == true)
      {
             m_ambienteRobotico.Update_Variable(Constants.Next_Obstacle_Distance , distance);
             m_ambienteRobotico.Update_Variable(Constants.Next_Obstacle_Identification , obs_ID);
      }
      else
      {
             m_ambienteRobotico.Set_Variable(Constants.Next_Obstacle_Distance , distance);
             m_ambienteRobotico.Set_Variable(Constants.Next_Obstacle_Identification , obs_ID);
      }
    }
    else
    {
       m_ambienteRobotico.clear_Variable(Constants.Next_Obstacle_Distance);
       m_ambienteRobotico.clear_Variable(Constants.Next_Obstacle_Identification);
    }


    return (point_return);
}



///////////////////////////////////////////////////////////////////
// Valida a intersecção de um segmento de recta com outro
///////////////////////////////////////////////////////////////////
   public Point calculate2 ( double x0,double y0,double x1,double y1,
                              double x2,double y2,double x3,double y3)
   {
   double a1,b1,c1,a2,b2,c2,det_inv,m1,m2, xi,yi;
   Point ponto_cruzamento = new Point();
//   System.out.println("x0=" + x0 +" y0="+y0+" x1="+x1+" y1="+y1+" x2="+x2+" y2="+y2+" x3="+x3+" y3="+y3);
//   WriteFile.Writeln("x0=" + x0 +" y0="+y0+" x1="+x1+" y1="+y1+" x2="+x2+" y2="+y2+" x3="+x3+" y3="+y3);

   if ((x1-x0)!=0)  m1 = (y1-y0)/(x1-x0);
   else
   {
        m1 = 1000000000;    // close enough to infinity
//          System.out.println("Recta 1 vertical");
//          WriteFile.Writeln("Recta 1 vertical");
   }

   if ((x3-x2)!=0)  m2 = (y3-y2)/(x3-x2);
   else
   {
       m2 = 1000000000;    // close enough to infinity
//         System.out.println("Recta 2 vertical");
//         WriteFile.Writeln("Recta 2 vertical");
   }

   // compute constants
   a1 = m1;
   a2 = m2;
   b1 = -1;
   b2 = -1;
   c1 = (y0-m1*x0);
   c2 = (y2-m2*x2);

//     System.out.println ("Equação da recta 1:  y = " + m1 + "x + " + c1);
//     System.out.println ("Equação da recta 2:  y = " + m2 + "x + " + c2);
//     WriteFile.Writeln("Equação da recta 1:  y = " + m1 + "x + " + c1);
//     WriteFile.Writeln("Equação da recta 2:  y = " + m2 + "x + " + c2);


   // compute the inverse of the determinate
   det_inv = 1/(a1*b2 - a2*b1);

   // use Kramers rule to compute xi and yi
   xi=((b1*c2 - b2*c1)*det_inv);
   yi=((a2*c1 - a1*c2)*det_inv);

//   System.out.println ("Ponto de intersecção: xi = " + xi + ", yi = " + yi);
//   WriteFile.Writeln ("Ponto de intersecção: xi = " + xi + ", yi = " + yi);
   ponto_cruzamento.Set_X(xi);
   ponto_cruzamento.Set_Y(yi);

   // verificar seponto de intersecção está incluí nos segmentos de recta.
   /* if (  ( yi >= min(y0,y1) ) && ( yi <= max(y0,y1) ) &&
          ( yi >= min(y2,y3) ) && ( yi <= max(y2,y3) ) &&
          ( xi >= min (x (y0,c1,m1,x0) , x(y1,c1,m1,x1) )) && (xi <= max(x(y0,c1,m1,x0) , x(y1,c1,m1,x1)))  &&
          ( xi >= min (x (y2,c2,m2,x2) , x(y3,c2,m2,x3) )) && (xi <= max(x(y2,c2,m2,x2) , x(y3,c2,m2,x3)))
        )
   */

   if (  ( ( ( yi >= min(y0,y1) ) && ( yi <= max(y0,y1)) ) || ( min(y0,y1) == max(y0,y1)) ) //
          &&
          ( ( ( yi >= min(y2,y3) ) && ( yi <= max(y2,y3)) ) || ( min(y2,y3) == max(y2,y3)) )
          &&
          ( xi >= min (x (y0,c1,m1,x0) , x(y1,c1,m1,x1) ))
          &&
          (xi <= max(x(y0,c1,m1,x0) , x(y1,c1,m1,x1)))
          &&
          ( xi >= min (x (y2,c2,m2,x2) , x(y3,c2,m2,x3) ))
          &&
          (xi <= max(x(y2,c2,m2,x2) , x(y3,c2,m2,x3)))
      )
   {
//       System.out.println ("Rectas Intersectam-se");
//       WriteFile.Writeln("Rectas Intersectam-se");
      return (ponto_cruzamento);
   }
   else
   {
//         System.out.println ("Os segmentos de recta não se intersectam");
//         WriteFile.Writeln ("Os segmentos de recta não se intersectam");
       return (null);
   }
} // end Intersect_Lines


////////////////////////////////////
// Maximum value between 2 doubles
///////////////////////////////////
   public double max(double a,double b)
   {
     if (a > b) return(a);
     else return (b);
   }


////////////////////////////////////
// Minimum value between 2 doubles
///////////////////////////////////
   public double min(double a,double b)
   {
     if (a > b) return(b);
     else return (a);
   }


////////////////////////////////////
// Calculates x coordinate based on line equation
///////////////////////////////////
  public double x(double y, double c, double m, double x)
  {
    if (m != 0)   return ( (y-c) / m);
    else return (x);
  }

}
