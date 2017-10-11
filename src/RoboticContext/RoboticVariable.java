
//Title:        Plataforma Simulacao
//Version:      
//Copyright:    Copyright (c) 1999
//Author:       Sergio Guerreiro
//Company:      IST, MEIC 2002
//Description:  Your description
package RoboticContext;

public class RoboticVariable {
private String n_Name;
private double n_Value;

   ////////////////////////////////////////////
   // construção de uma variável Robótica
   ////////////////////////////////////////////
  public RoboticVariable() {
    Set_Name(null);
    Set_Value(0);
  }


   ////////////////////////////////////////////
   // construção de uma variável Robótica
   ////////////////////////////////////////////
  public RoboticVariable(String Name, double Value) {
    Set_Name (Name);
    Set_Value (Value);
  }


   ////////////////////////////////////////////
   // Set ao nome da variável
   ////////////////////////////////////////////
  public boolean Set_Name(String Name)
  {
   n_Name=Name;
   return (true);
  }

   ////////////////////////////////////////////
   // Set ao valor da variável
   ////////////////////////////////////////////
  public boolean Set_Value(double Value)
  {
   n_Value=Value;
   return (true);
  }

  public String Get_Name()
  {
   return (n_Name);
  }

  public double Get_Value()
  {
   return(n_Value);
  }

}