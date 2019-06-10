/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author felip
 */
public class GraficoProbabilidade extends JFrame 
{
    public double sim = 0;
    public double nao = 0;
 
   public GraficoProbabilidade(double sim, double nao) 
   {
      super( "Gráfico de Probabilidades" ); //Define o titulo da tela
      //add grafico
      //Cria um dataSet para inserir os dados que serão passados para a criação do gráfico tipo Pie
    DefaultPieDataset pieDataset = new DefaultPieDataset();
    
    //Adiciona os dados ao dataSet deve somar um total de 100%
    pieDataset.setValue("Sim", sim);
    pieDataset.setValue("Não", nao);
    
    //Cria um objeto JFreeChart passando os seguintes parametros
    JFreeChart grafico = ChartFactory.createPieChart(
    "Gráfico de Probabilidades", //Titulo do grafico
    pieDataset, //DataSet
    true, //Para mostrar ou não a legenda
    true, //Para mostrar ou não os tooltips
    false);
    
    /*JFreeChart grafico2 = ChartFactory.createBarChart(
    "Gráfico de Probabilidades", //Titulo do grafico
    pieDataset, //DataSet
    true, //Para mostrar ou não a legenda
    true, //Para mostrar ou não os tooltips
    false);*/

    this.add( new ChartPanel( grafico ) );
    //this.add( new ChartPanel( grafico2 ) );
      this.pack();//para ajustar automaticamente o Frame
      
      //Visibilidade do grafico
      this.setVisible( true );
      
      setLocationRelativeTo(null);
   }
   
   public static void main(String[] args) 
   {   
   }
}