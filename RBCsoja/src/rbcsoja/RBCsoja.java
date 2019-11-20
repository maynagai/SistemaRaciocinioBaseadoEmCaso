/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbcsoja;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author mayla
 */
public class RBCsoja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    File arquivoCSV = new File("/home/mayla/NetBeansProjects/RBCsoja/src/rbcsoja/casoBase");
    Tela tela = new Tela();
    SimilaridadeLocal local= new SimilaridadeLocal();
    
  
    
        try{
            Scanner leitor = new Scanner(arquivoCSV);
            String linhasDoArquivo = new String();
            
            while(leitor.hasNext()){
                linhasDoArquivo = leitor.nextLine();
                String[] valoresEntreVirgulas = linhasDoArquivo.split(",");
                //imprime a coluna que quiser
               // System.out.println(valoresEntreVirgulas[1]);
                
                
            }
        
        }catch(FileNotFoundException e){
            
        }
        
        //cal.SimilariedadeLocalDamagedArea(tela.getDamagedArea(),valoresEntreVirgulas[1]);
        int simcan,simext,simfrub,simfrus,simfrup,simhail,simplasta,simpre,simtem,simsetmt,simplagro,simhalo,simmarg,simlea,simleasize,simlesh;
        int simlemil, simstem, simint,simesc,simse,simlomold,simseedsize,simseedis,simmy,simleafmalf;
        //Atrib que nao precisam ser calc similaridades
        simcan=local.SimilaridadeLocalCankerLesion(tela.getCankerLesion());
        simext=local.SimilaridadeLocalExternalDecay(tela.getExternalDecay());
        simfrub=local.SimilaridadeLocalFruitingBodies(tela.getFruitingBodies());
        simfrus=local.SimilaridadeLocalFruitSpots(tela.getFruitSpot());
        simfrup=local.SimilaridadeLocalFruitPods(tela.getFruitingPods());
        simhail=local.SimilaridadeLocalHail(tela.getHail());
        simplasta=local.SimilaridadeLocalPlantStand(tela.getPlantStand());
        simpre=local.SimilaridadeLocalPrecip(tela.getPrecip());
        simtem=local.SimilaridadeLocalTemp(tela.getTemps());
        simsetmt=local.SimilaridadeLocalSeedTmt(tela.getSeetTmt());
        simplagro=local.SimilaridadeLocalPlantGrowth(tela.getPlantGrowth());
        simhalo=local.SimilaridadeLocalLeafSpotHalo(tela.getLeafspotHalo());
        simmarg=local.SimilaridadeLocalLeafSpotMargin(tela.getLeafspotMargin());
        simlea=local.SimilaridadeLocalLeaves(tela.getLeaves());
        simleasize=local.SimilaridadeLocalLeafSpotSize(tela.getLeafspotSize());
        simlesh=local.SimilaridadeLocalLeafShred(tela.getLeafShread());
        simlemil=local.SimilaridadeLocalLeafMild(tela.getLeafMild());
        simstem=local.SimilaridadeLocalStem(tela.getStem());
        simint=local.SimilaridadeLocalIntDiscolor(tela.getIntDiscolor());
        simesc=local.SimilaridadeLocalSclerotia(tela.getSclerotia());
        simse=local.SimilaridadeLocalSeed(tela.getSeeds());
        simlomold=local.SimilaridadeLocalMoldGrowth(tela.getMoldGrowth());
        simseedis=local.SimilaridadeLocalSeedDis(tela.getSeedDiscolor());
        simseedsize=local.SimilaridadeLocalSeedSize(tela.getSeedSize());
        simmy=local.SimilaridadeLocalMycelium(tela.getMycellium());
        simleafmalf=local.SimilaridadeLocalLeafMalf(tela.getLeafMalf());
        
    }
    
    
}
