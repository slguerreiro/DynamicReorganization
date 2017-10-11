//Source file: C:/Meic/Tese/VigilanciaRoboticoCaseStudy/Codigo/Simulator/Methodology.java

package Simulator;
import java.lang.*;
import java.io.*;
import java.util.*;
import RoboticContext.*;
import SimulatorPlatform.*;

/**
 * @author
 * @version
 */
public class Methodology
{
  RoboticGoal Objective;

   public Methodology()
   {
      System.out.println("Methodology created...");
      WriteFile.Writeln("Methodology created...",Constants.pathOutputFile,Constants.OutputFile);
      Objective = new RoboticGoal(new Point(Constants.Final_Point_X_Value , Constants.Final_Point_Y_Value));
   }


  ////////////////////////////////////////////////////
  //  Executa o módulo de Methodology do Process Module
  ////////////////////////////////////////////////////
   public RoboticGoal execute(CorrectiveAction action)
   {

      Objective.Clear_Intermediate_Points();

      if (action != null)
      {
        if (action.Get_CorrectiveAction().compareTo(Constants.Order_GO_LEFT) == 0)
        {
          Objective.Set_Intermediate_Point(new Point(-Constants.DeviationReorganization,0));
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_GO_RIGHT) == 0)
        {
          Objective.Set_Intermediate_Point(new Point(Constants.DeviationReorganization,0));
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_GO_FORWARD) == 0)
        {
          Objective.Set_Intermediate_Point(new Point(0,Constants.DeviationReorganization));
        }
        else if (action.Get_CorrectiveAction().compareTo(Constants.Order_GO_REVERSE) == 0)
        {
          Objective.Set_Intermediate_Point(new Point(0,-Constants.DeviationReorganization));
        };
      }
      return (Objective);
   }
}
