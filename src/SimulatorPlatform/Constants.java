
//Title:        Plataforma de simula\u00e7ao gen\u00e9rica
//Version:      1.0
//Copyright:    Copyright (c) 2002
//Author:
//Company:      MEIC, 2002
//Description:
package SimulatorPlatform;

public class Constants {

// configuração para o nível de dados
public static String PPerfMMs = "PerformanceMeasureMappings.txt";
public static String RskMs = "RisksMappings.txt";
public static String RlsMs = "RulesMappings.txt";
public static String pathInputFile="d:\\Meic\\PlataformaSimulacaoRoboticNObstacles\\Mapeamentos\\";
public static String pathOutputGraphFile="d:\\Meic\\PlataformaSimulacaoRoboticNObstacles\\Graficos\\";
public static String OutputFile="SimulationOutput";
public static String OutputGraphFile="SimulationGraphOutput";
public static String pathOutputFile="d:\\Meic\\PlataformaSimulacaoRoboticNObstacles\\Outputs\\";
public static String SeparatorFile="#";
public static String connectString="";  // Para Base de dados
public static int WriteToFile = 1;


// Para o domínio especifico da Robótica
public static String LimitX = "LimitX";
public static double LimitX_value = 500;
public static String LimitY = "LimitY";
public static double LimitY_value = 500;
public static String RobotPositionX = "RobotPositionX";
public static double RobotPositionX_value = 5;
public static String RobotPositionY = "RobotPositionY";
public static double RobotPositionY_value = 5;
public static String RobotDimensionX = "RobotDimensionX";
public static double RobotDimensionX_value = 10;
public static String RobotDimensionY = "RobotDimensionY";
public static double RobotDimensionY_value = 10;
public static String RobotVelocity = "RobotVelocity";
public static double RobotVelocity_value = 2;
public static String RobotDistanceObstacle1 = "RobotDistanceObstacle1";
public static String RobotDistanceObstacle2 = "RobotDistanceObstacle2";
public static String RobotDistanceObstacle3 = "RobotDistanceObstacle3";


public static String Obstacle_1_X = "Obstacle1X";
public static double Obstacle_1_X_value = 20;
public static String Obstacle_1_Y = "Obstacle1Y";
public static double Obstacle_1_Y_value = 70;
public static String Obstacle_Dimension_1_X = "Obstacle1XDimension";
public static double Obstacle_Dimension_1_X_value = 300;
public static String Obstacle_Dimension_1_Y = "Obstacle1YDimension";
public static double Obstacle_Dimension_1_Y_value = 20;

public static String Obstacle_2_X = "Obstacle2X";
public static double Obstacle_2_X_value = 70;
public static String Obstacle_2_Y = "Obstacle2Y";
public static double Obstacle_2_Y_value = 120;
public static String Obstacle_Dimension_2_X = "Obstacle2XDimension";
public static double Obstacle_Dimension_2_X_value = 100;
public static String Obstacle_Dimension_2_Y = "Obstacle2YDimension";
public static double Obstacle_Dimension_2_Y_value = 100;

public static String Obstacle_3_X = "Obstacle3X";
public static double Obstacle_3_X_value = 40;
public static String Obstacle_3_Y = "Obstacle3Y";
public static double Obstacle_3_Y_value = 330;
public static String Obstacle_Dimension_3_X = "Obstacle3XDimension";
public static double Obstacle_Dimension_3_X_value = 90;
public static String Obstacle_Dimension_3_Y = "Obstacle3YDimension";
public static double Obstacle_Dimension_3_Y_value = 120;

public static String Obstacle_4_X = "Obstacle4X";
public static double Obstacle_4_X_value = 260;
public static String Obstacle_4_Y = "Obstacle4Y";
public static double Obstacle_4_Y_value = 110;
public static String Obstacle_Dimension_4_X = "Obstacle4XDimension";
public static double Obstacle_Dimension_4_X_value = 50;
public static String Obstacle_Dimension_4_Y = "Obstacle4YDimension";
public static double Obstacle_Dimension_4_Y_value = 150;

public static String Obstacle_5_X = "Obstacle5X";
public static double Obstacle_5_X_value = 180;
public static String Obstacle_5_Y = "Obstacle5Y";
public static double Obstacle_5_Y_value = 290;
public static String Obstacle_Dimension_5_X = "Obstacle5XDimension";
public static double Obstacle_Dimension_5_X_value = 90;
public static String Obstacle_Dimension_5_Y = "Obstacle5YDimension";
public static double Obstacle_Dimension_5_Y_value = 50;

public static String Obstacle_6_X = "Obstacle6X";
public static double Obstacle_6_X_value = 350;
public static String Obstacle_6_Y = "Obstacle6Y";
public static double Obstacle_6_Y_value = 50;
public static String Obstacle_Dimension_6_X = "Obstacle6XDimension";
public static double Obstacle_Dimension_6_X_value = 120;
public static String Obstacle_Dimension_6_Y = "Obstacle6YDimension";
public static double Obstacle_Dimension_6_Y_value = 300;

public static String Obstacle_7_X = "Obstacle7X";
public static double Obstacle_7_X_value = 350;
public static String Obstacle_7_Y = "Obstacle7Y";
public static double Obstacle_7_Y_value = 400;
public static String Obstacle_Dimension_7_X = "Obstacle7XDimension";
public static double Obstacle_Dimension_7_X_value = 80;
public static String Obstacle_Dimension_7_Y = "Obstacle7YDimension";
public static double Obstacle_Dimension_7_Y_value = 100;



public static double Obstacle_Security_Distance = 1; // same units as Obstacle_Dimension
public static String Next_Obstacle_Distance = "NextObstacleDistance";
public static String Next_Obstacle_Identification = "NextObstacleID";


public static String Time = "Time";
public static double Time_value = 0;

public static String Final_Point_X = "FinalPointX";
public static double Final_Point_X_Value = 150;
public static String Final_Point_Y = "FinalPointY";
public static double Final_Point_Y_Value = 320;
public static String Final_Point_Dimension_X = "FinalPointDimensionX";
public static double Final_Point_Dimension_X_Value = 10;
public static String Final_Point_Dimension_Y = "FinalPointDimensionY";
public static double Final_Point_Dimension_Y_Value = 10;

public static String Intermediate_Point_X = "IntermediatePointX";
public static String Intermediate_Point_Y = "IntermediatePointY";


public static String Intermediate_Point_Dimension_X = "IntermediatePointDimensionX";
public static double Intermediate_Point_Dimension_X_Value = 5;
public static String Intermediate_Point_Dimension_Y = "IntermediatePointDimensionY";
public static double Intermediate_Point_Dimension_Y_Value = 5;


// Ordens de reorganizacao
public static String Order_GO_LEFT = "GO LEFT";
public static String Order_GO_RIGHT = "GO RIGHT";
public static String Order_GO_FORWARD = "GO FORWARD";
public static String Order_GO_REVERSE = "GO REVERSE";
public static double DeviationReorganization = 10;


// Constantes para as operações lógicas das expressões avaliadoras
// Operações nível A
public static String Operation_AND = "AND";
public static String Operation_OR = "OR";
public static String Operation_XOR = "XOR";
public static String Operation_NOT = "NOT";
public static String Operation_ABSTRACT_A = "@A";
public static String ClasseA = "Classe A";

  // Operações nível B
public static String Operation_LESS = "<";
public static String Operation_GREATER = ">";
public static String Operation_EQUAL = "=";
public static String Operation_LESS_EQUAL = "<=";
public static String Operation_GREATER_EQUAL = ">=";
public static String Operation_NOT_EQUAL = "<>";
public static String Operation_ABSTRACT_B = "@B";
public static String ClasseB = "Classe B";

  // Operações nível C
public static String Operation_PLUS = "+";
public static String Operation_MINUS = "-";
public static String Operation_DIV = "/";
public static String Operation_MUL = "*";
public static String Operation_MOD = "MOD";
public static String Operation_ABS = "ABS";
public static String Operation_SQRT = "SQRT";
public static String Operation_SQR = "SQR";
public static String Operation_ABSTRACT_C = "@C";
public static String ClasseC = "Classe C";


  public Constants() {
  }
}