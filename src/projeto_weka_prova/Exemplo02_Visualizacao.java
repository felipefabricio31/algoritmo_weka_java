/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_weka_prova;

import java.util.Locale;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author felip
 */
public class Exemplo02_Visualizacao {

    /**
     * @param args the command line arguments
     * 
     * OBJETIVO PREVER SE A PESSOA VAI GASTAR MUITO OU NÃO
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //Instacia da base de dados
        DataSource ds = new DataSource("src/Dados/vendas.arff");
        //Atribuição dos valores da API para ins
        Instances ins =  ds.getDataSet();
        //System.out.println(ins.toString());
        
        //3 é qual atributo eu quero fazer a previsão
        ins.setClassIndex(3);
        
        //Este será o algoritmo que vai fazer a previsão
        NaiveBayes nb = new NaiveBayes();
        //Cria o classificador
        nb.buildClassifier(ins);
        
        Instance novo = new DenseInstance(4);
        //Está relacionado o novo registro com a base de dados
        novo.setDataset(ins);
        novo.setValue(0, "M");
        novo.setValue(1, "20-39");
        novo.setValue(2, "Nao");
        
        //Qual a porcentagem desta pessoa gastar muito
        double probabilidade[] = nb.distributionForInstance(novo);
        System.out.println("Sim: " + probabilidade[1]);
        System.out.println("Não: " + probabilidade[0]);
    }
}
