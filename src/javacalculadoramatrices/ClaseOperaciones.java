
package javacalculadoramatrices;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author Steven
 */

public class ClaseOperaciones 
{
     private static DefaultTableModel modelo;
     
    public static void LimpiaTabla(JTable Tabla,int fila,int columna)
    {
            modelo=new DefaultTableModel();
            Tabla.setModel(modelo);
            modelo=new DefaultTableModel(fila,columna);
            //int alto=Tabla.getHeight();         
            Tabla.setModel(modelo);
             Tabla.setRowHeight(320/fila);
            //Tabla.setRowHeight(320/fila);       
    }
    public static void LlenaTabla(JTable Tabla,int fila,int columna,String [][] aux)
    {
        modelo=new DefaultTableModel();
        Tabla.setModel(modelo);
        modelo=new DefaultTableModel(fila,columna);
        Tabla.setModel(modelo);
        Tabla.setRowHeight(320/fila);
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                try
                {
                    if((!aux[i][j].equals("null")))
                    {
                        Tabla.setValueAt(aux[i][j], i, j);
                    }
                    else
                    {
                        Tabla.setValueAt(" ", i, j);
                    }
                }
                catch(Exception ex)
                {
                    Tabla.setValueAt(" ", i, j);
                }
            }
        }
        //int alto=Tabla.getHeight();
    }
    public static void LlenaTablaRandom(JTable Tabla,int fila,int columna)
    {
        LimpiaTabla(Tabla,fila,columna);
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                Tabla.setValueAt(String.valueOf( ThreadLocalRandom.current().nextInt(1,100)), i, j);
            }
        }
    }
    public static String [][]  LeerTablaAux(JTable Tabla, int fila,int columna)
    {
            String [][]Retorno=new String[fila][columna];
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    Retorno[i][j]=String.valueOf(Tabla.getValueAt(i, j));
                }
            }
        return Retorno;
    }
    public static boolean Aprobar(JTable Tabla,int fila,int columna)
    {
        double n=0;
        int contador=0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) 
            {
                String cad=String.valueOf(Tabla.getValueAt(i, j)).trim(); 
                //JOptionPane.showMessageDialog(null,cad.length() );
                if((!cad.equals("null"))&&(cad.length()>0))
                {
                    try
                    {
                        n=Double.parseDouble(cad);
                    }
                    catch(Exception ex)
                    {
                        contador++;
                    }
                }
            }
        }
        if(contador==0){
        return true;}else{return false;}
    }
    public static Double[][] Suma( JTable Tabla1, JTable Tabla2  ,int fila, int columna)
    {
            Double [][] Retorno=new Double[fila][columna];
            String Valor1;
            String Valor2;
            Double v1;
            Double v2;
            for (int i = 0; i < fila; i++) 
            {
                for (int j = 0; j < columna; j++) 
                {
                  Valor1=String.valueOf(Tabla1.getValueAt(i, j)).trim();
                  if((Valor1.equals("null"))||Valor1.length()==0)
                  {
                        v1=0.0;
                  }
                  else
                  {
                        v1=Double.parseDouble(Valor1);
                  }
                  Valor2=String.valueOf(Tabla2.getValueAt(i, j)).trim();
                  if((Valor2.equals("null"))||Valor2.length()==0)
                  {
                        v2=0.0;
                  }
                  else
                  {
                        v2=Double.parseDouble(Valor2);
                  }
                  Retorno[i][j]=v1+v2;
                }
            } 
            return Retorno;
    }
    public static Double[][]Resta(JTable Tabla1,JTable Tabla2,int fila,int columna)
    {
    Double [][]Retorno=new Double[fila][columna];
    String Valor1;
    String Valor2;
    double v1;
    double v2;
    for (int i = 0; i < fila; i++) 
        {
            for (int j = 0; j < columna; j++) 
            {
               Valor1=String.valueOf( Tabla1.getValueAt(i, j)).trim();
               if(Valor1.equals("null")||Valor1.length()==0)
               {
                   v1=0.0;
               }
               else
               {
                   v1=Double.parseDouble(Valor1);
               }
               Valor2=String.valueOf(Tabla2.getValueAt(i, j)).trim();
               if(Valor2.equals("null")||Valor2.length()==0)
               {
                   v2=0.0;
               }
               else
               {
                   v2=Double.parseDouble(Valor2);
               }
               Retorno[i][j]=v1-v2;
            }
        }
    return Retorno;
    }
    public static Double[][]Multiplicacion(JTable Tabla1,JTable Tabla2,int fila1,int fila2,int columna1,int columna2)
    {
        Double[][] Retorno=new Double[fila1][columna2];
        String Valor1;
        String Valor2;
        double v1;
        double v2;
        for (int i = 0; i < fila1; i++) {
            for (int j = 0; j < columna2; j++) {
                Retorno[i][j]=0.0;
            }
        }
        for (int i = 0; i < fila1; i++) 
        {
            for (int j = 0; j < columna2; j++) 
            {
                for (int k = 0; k < columna1; k++) 
                {
                    Valor1= String.valueOf( Tabla1.getValueAt(i, k)).trim();
                    if((Valor1.equals("null"))||(Valor1.length()==0))
                    {
                        v1=0.0;
                    }
                    else
                    {
                        v1=Double.parseDouble(Valor1);
                    }
                    Valor2=String.valueOf(Tabla2.getValueAt(k, j)).trim();
                    if((Valor2.equals("null"))||(Valor2.length()==0))
                    {
                        v2=0.0;
                    }
                    else
                    {
                        v2=Double.parseDouble(Valor2);
                    }
                    Retorno[i][j]=(v1*v2)+Retorno[i][j];
                }
            }
        }
        return Retorno;
    }
    public static Double[][]Traspuesta(JTable Tabla1,int fila,int columna)
    {
    Double Retorno[][]=new Double[columna][fila];
    String Valor;
    Double V;
    for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) 
            {
                Valor=String.valueOf(Tabla1.getValueAt(i, j)).trim();
                if((Valor.equals("null"))||(Valor.length()==0))
                {
                    V=0.0;
                }
                else
                {
                    V=Double.parseDouble(Valor);
                }
                Retorno[j][i]=V;
            }
        }
    return Retorno;
    }
    
    
    public static  Double[][] ObtenerMatriz(JTable Tabla1,int fila,int columna)
    {
        String Valor;
        double V;
        Double Retorno[][]=new Double[fila][columna];
        for (int i = 0; i < fila; i++) 
        {
            for (int j = 0; j < columna; j++) 
            {
                Valor=String.valueOf(Tabla1.getValueAt(i, j)).trim();
                 if((Valor.equals("null"))||(Valor.length()==0))
                {
                    V=0.0;
                }
                else
                {
                    V=Double.parseDouble(Valor);
                }
                Retorno[i][j]=V;
            }
        }
    
    
        return Retorno;
    }
    //Funciones Super Poderosas Recicla Codigo==> Falto Tiempo

       
    public static Double Deter(int i, Double[][] M_Princp)
        {
            if (M_Princp.length == 2)
            {
                Double dter = M_Princp[0][ 0] * M_Princp[1][ 1] - M_Princp[0][ 1] * M_Princp[1][ 0];
                return dter;
            }
            else
            {
                double dter = 0;
                for (int j = 0; j < M_Princp.length; j++)
                {
                    Double[][] Temp = SubM(i, j, M_Princp);
                    dter = dter + Math.pow(-1, i + j) * M_Princp[i][j] * Deter(i, Temp);
                }
                return dter;
            }
        }
    private static Double[][] SubM(int i, int j, Double[][] M_Prinp)
        {
            Double[][] M_Temp = new Double[M_Prinp.length - 1][ M_Prinp.length - 1];
            int c1 = 0, c2 = 0;
            for (int k = 0; k < M_Prinp.length; k++)
            {
                if (k != i)
                {
                    c2 = 0;
                    for (int l = 0; l < M_Prinp.length; l++)
                    {
                        if (l != j)
                        {
                            M_Temp[c1][ c2] = M_Prinp[k][ l];
                            c2++;
                        }
                    }
                    c1++;
                }
            }
            return M_Temp;
        }
    public  static Double[][] Adjunta(Double[][] M_Princp,int fila,int columna)
        {
            Double[][] M_Temp = new Double[fila][ columna];
            if (fila == 2)
            {
                return M_Princp;
            }
            else
            {
                for (int i = 0; i < fila; i++)
                {
                    for (int j = 0; j < columna; j++)
                    {
                        Double[][] Temp = SubM(i, j, M_Princp);
                        Double Elemn = Math.pow(-1, i + j) * Deter(0, Temp);
                        M_Temp[i][j] = Elemn;
                    }
                }
                return M_Temp;
            }
        }
    public static Double[][]Traspuesta(Double [][] M_Princp,int fila,int columna)
    {
        Double Retorno[][]=new Double[columna][fila];
        for (int i = 0; i < fila; i++) 
        {
            for (int j = 0; j < columna; j++) 
            {
                Retorno[j][i]=M_Princp[i][j];
            }
        }
        return Retorno;
    }
    public static Double[][]Inversa(Double[][]Matriz,int fila,int columna,Double Valor)
    {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                Matriz[i][j]=Matriz[i][j]/Valor;
            }
        }
        return Matriz;
    }
    
    public static void  LlenaTablaResultado(JTable Tabla,Double[][] resultado,int fila,int columna)
    {
        for (int i = 0; i < fila; i++) 
        {
            for (int j = 0; j < columna; j++) {
                Tabla.setValueAt(resultado[i][j], i, j);
            }
        }
    }   
}
