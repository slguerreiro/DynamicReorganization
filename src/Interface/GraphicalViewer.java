
//Title:        Plataforma Simulacao
//Version:
//Copyright:    Copyright (c) 1999
//Author:       Sergio Guerreiro
//Company:      IST, MEIC 2002
//Description:  Your description
package Interface;
import Simulator.*;
import SimulatorPlatform.*;
import DataRepository.*;
import RoboticContext.*;
import java.util.*;

public class GraphicalViewer {

WindowUtilities tmp;
SimulationAnimation tmp2;


  public GraphicalViewer(EnvironmentDefinition ambiente)
  {
      System.out.println ("Graphical Simulation Created..........");
      WriteFile.Writeln ("Graphical Simulation Created..........",Constants.pathOutputFile,Constants.OutputFile);

     tmp = new WindowUtilities();

     // Cria animacao
     tmp2 = new SimulationAnimation( ambiente.Get_Robot().GetPositionX(),
                                     ambiente.Get_Robot().GetPositionY(),
                                     ambiente.Get_Robot().GetDimensionX(),
                                     ambiente.Get_Robot().GetDimensionY(),
                                     (int) ambiente.Get_LimitX(),
                                     (int) ambiente.Get_LimitY()
                                    );


      tmp2.AddTrajectoryPoint(ambiente.Get_Robot().GetPositionX() , ambiente.Get_Robot().GetPositionY());


      Obstacle xpto;
      for (int o=0;o<ambiente.Get_Obstacles().size();o++)
      {
        xpto = (Obstacle) ambiente.Get_Obstacles().get(o);
        tmp2.Add_Obstacle(xpto.GetPositionX() , xpto.GetPositionY() , xpto.GetDimensionX() , xpto.GetDimensionY());
      }


      tmp2.set_FinalPoint ( ambiente.get_Objectives().Get_Final_Point().Get_X(),
                            ambiente.get_Objectives().Get_Final_Point().Get_Y()
                          );


       tmp.openInJFrame(tmp2, (int) ambiente.Get_LimitX(),
                              (int) ambiente.Get_LimitY() + 50);

   }



   public void DrawRobot(EnvironmentDefinition ambiente)
   {
      tmp2.set_Intermediate_Points(ambiente.Get_Intermediate_Points());

      tmp2.set_Robot_Dimension_X(ambiente.Get_Robot().GetDimensionX());
      tmp2.set_Robot_Dimension_Y(ambiente.Get_Robot().GetDimensionY());
      tmp2.set_Robot_Position_X(ambiente.Get_Robot().GetPositionX());
      tmp2.set_Robot_Position_Y(ambiente.Get_Robot().GetPositionY());
      tmp2.AddTrajectoryPoint(ambiente.Get_Robot().GetPositionX() , ambiente.Get_Robot().GetPositionY());
      tmp2.set_Time(ambiente.Get_Time());
      tmp2.updateUI();
   }



}