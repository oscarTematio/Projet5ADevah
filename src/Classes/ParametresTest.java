/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Oscar Teamatio
 */
public class ParametresTest {
    
  static  private int OrientationInitiales;
    static private String Nature;
    static private int NombredEssaiTige;
    static private int NombredEssaiCadre;
    static private  int[] ValeursTige; 
    static private  int[] ValeursCadre; 
    static private boolean Aleatoire;
    static private double Vitesse;

    public ParametresTest() {
    }

    public ParametresTest(int OrientationInitiales,String Nature, int NombredEssaiTige,int NombredEssaiCadre, int[] ValeursTige, int[] ValeursCadre,boolean Aleatoire,double Vitesse ) {
    }
  

    public static int getNombredEssaiTige() {
        return NombredEssaiTige;
    }

    public static void setNombredEssaiTige(int NombredEssaiTige) {
        ParametresTest.NombredEssaiTige = NombredEssaiTige;
    }

    public static int getNombredEssaiCadre() {
        return NombredEssaiCadre;
    }

    public static void setNombredEssaiCadre(int NombredEssaiCadre) {
        ParametresTest.NombredEssaiCadre = NombredEssaiCadre;
    }

    public int getOrientationInitiales() {
        return OrientationInitiales;
    }

    public void setOrientationInitiales(int OrientationInitiales) {
        ParametresTest.OrientationInitiales = OrientationInitiales;
    }

    public String getNature() {
        return Nature;
    }

    public void setNature(String Nature) {
        ParametresTest.Nature = Nature;
    }

    
   

    public int[] getValeursTige() {
        return ValeursTige;
    }

    public void setValeursTige(int[] Valeurs) {
        ParametresTest.ValeursTige = ValeursTige;
    }

    public int[] getValeursCadre() {
        return ValeursCadre;
    }

    public void setValeursCadre(int[] ValeursCadre) {
        ParametresTest.ValeursCadre = ValeursCadre;
    }

    public boolean isAleatoire() {
        return Aleatoire;
    }

    public void setAleatoire(boolean Aleatoire) {
        ParametresTest.Aleatoire = Aleatoire;
    }

    public double getVitesse() {
        return Vitesse;
    }

    public void setVitesse(double Vitesse) {
        ParametresTest.Vitesse = Vitesse;
    }
    
    
    
    
    
}
