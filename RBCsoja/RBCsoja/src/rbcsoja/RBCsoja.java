/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbcsoja;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.DefaultListModel;

/**
 *
 * @author mayla
 */
public class RBCsoja {

    /**
     * @param args the command line arguments
     */
    public void calcSimiMain() {
    File arquivoCSV = new File("/home/mayla/NetBeansProjects/RBCsoja/src/rbcsoja/casoBase");
    int similaridadeglobalparcial = 0;
    int pesodiv = 0;
    int peso[] = new int[27];
    double damagedArea[] = new double[400];
    double cropHist[] = new double[400];
    double severity[] = new double[400];
    double germination[] = new double[400];
    double lodging[] = new double[400];
    double stemcanker[] = new double[400];
    double root[] = new double[400];
    int simparc[] = new int[27]; 
    
    int i = 0;
            
    SimilaridadeLocal local= new SimilaridadeLocal();
    SimilaridadeGlobal global = new SimilaridadeGlobal();
        
        //Atrib que nao precisam ser calc similaridades
        peso[0] = 7;
        simparc[0]=local.SimilaridadeLocalCankerLesion(Dados.canckerlesion);
        peso[1] = 7;
        simparc[1]=local.SimilaridadeLocalExternalDecay(Dados.externaldecay);
        peso[2] = 7;
        simparc[2]=local.SimilaridadeLocalFruitingBodies(Dados.fruitingbodies);
        peso[3] = 8;
        simparc[3]=local.SimilaridadeLocalFruitSpots(Dados.fruitspots);
        peso[4] = 8;
        simparc[4]=local.SimilaridadeLocalFruitPods(Dados.fruitpods);
        peso[5] = 3;
        simparc[5]=local.SimilaridadeLocalHail(Dados.hail);
        peso[6] = 5;
        simparc[6]=local.SimilaridadeLocalPlantStand(Dados.plantstand);
        peso[7] = 6;
        simparc[7]=local.SimilaridadeLocalPrecip(Dados.precip);
        peso[8] = 4;
        simparc[8]=local.SimilaridadeLocalTemp(Dados.temp);
        peso[9] = 1;
        simparc[9]=local.SimilaridadeLocalSeedTmt(Dados.seedtmt);
        peso[10] = 8;
        simparc[10]=local.SimilaridadeLocalPlantGrowth(Dados.plantgrowth);
        peso[11] = 6;
        simparc[11]=local.SimilaridadeLocalLeafSpotHalo(Dados.leafspothalo);
        peso[12] = 7;
        simparc[12]=local.SimilaridadeLocalLeafSpotMargin(Dados.leafsspotmarg);
        peso[13] = 8;
        simparc[13]=local.SimilaridadeLocalLeaves(Dados.leaves);
        peso[14] = 7;
        simparc[14]=local.SimilaridadeLocalLeafSpotSize(Dados.leafspotsize);
        peso[15] = 7;
        simparc[15]=local.SimilaridadeLocalLeafShred(Dados.leafshred);
        peso[16] = 8;
        simparc[16]=local.SimilaridadeLocalLeafMild(Dados.leafmild);
        peso[17] = 8;
        simparc[17]=local.SimilaridadeLocalStem(Dados.stem);
        peso[18] = 8;
        simparc[18]=local.SimilaridadeLocalIntDiscolor(Dados.intdiscolor);
        peso[19] = 8;
        simparc[19]=local.SimilaridadeLocalSclerotia(Dados.sclerotia);
        peso[20] = 7;
        simparc[20]=local.SimilaridadeLocalSeed(Dados.seed);
        peso[21] = 8;
        simparc[21]=local.SimilaridadeLocalMoldGrowth(Dados.moldgrowth);
        peso[22] = 7;
        simparc[22]=local.SimilaridadeLocalSeedDis(Dados.seeddis);
        peso[23] = 8;
        simparc[23]= local.SimilaridadeLocalShriveling(Dados.shriveling);
        peso[24] = 8;
        simparc[24]=local.SimilaridadeLocalSeedSize(Dados.seedsize);
        peso[25] = 8;
        simparc[25]=local.SimilaridadeLocalMycelium(Dados.mycelium);
        peso[26] = 7;
        simparc[26]=local.SimilaridadeLocalLeafMalf(Dados.leafmalf);
        
        for(int j =0;j<27;j++){
            if(simparc[j] >= 0) similaridadeglobalparcial += simparc[j] * peso[j] ;
            pesodiv += peso[j]; 
            
        }
        /*System.out.println("parc"+similaridadeglobalparcial);
       */
       
        
        try{
            Scanner leitor = new Scanner(arquivoCSV);
            String linhasDoArquivo = new String();
            
            while(leitor.hasNext()){
                linhasDoArquivo = leitor.nextLine();
                String[] valoresEntreVirgulas = linhasDoArquivo.split(",");
                //System.out.println(valoresEntreVirgulas[31]);
                damagedArea[i]=local.SimilariedadeLocalDamagedArea(Dados.areadamaged,valoresEntreVirgulas[1]);
                cropHist[i]=local.SimilaridadeLocalCropHist(Dados.croohist, valoresEntreVirgulas[3]);
                severity[i]=local.SimilaridadeLocalSeverity(Dados.severity, valoresEntreVirgulas[31]);
                germination[i]=local.SimilaridadeLocalGermination(Dados.germination, valoresEntreVirgulas[9]);
                lodging[i]=local.SimilaridadeLocalLodiging(Dados.lodgi, valoresEntreVirgulas[19]);
                stemcanker[i]=local.SimilaridadeLocalStemCanker(Dados.stemcancker, valoresEntreVirgulas[34]);
                root[i]=local.SimilaridadeLocalRoots(Dados.roots, valoresEntreVirgulas[25]);
                Dados.global[i]=global.SimilaridadeGlobal(similaridadeglobalparcial, damagedArea[i], cropHist[i], severity[i], germination[i], lodging[i], stemcanker[i],root[i],pesodiv);
                
                //Dados dos casosBases
                Dados.caso[i]=valoresEntreVirgulas[0];
                Dados.areadamagedVetor[i]=valoresEntreVirgulas[1];
                Dados.canckerlesionVetor[i] = valoresEntreVirgulas[2];
                Dados.croohistVetor[i]= valoresEntreVirgulas[3];
                Dados.dataVetor[i]=valoresEntreVirgulas[4];
                Dados.externaldecayVetor[i]=valoresEntreVirgulas[5];
                Dados.fruitspotsVetor[i]=valoresEntreVirgulas[6];
                Dados.fruitingbodiesVetor[i]=valoresEntreVirgulas[7];
                Dados.fruitpodsVetor[i]=valoresEntreVirgulas[8];
                Dados.germinationVetor[i] = valoresEntreVirgulas[9];
                Dados.hailVetor[i]= valoresEntreVirgulas[10];
                Dados.intdiscolorVetor[i]=valoresEntreVirgulas[11];
                Dados.leafmalfVetor[i]= valoresEntreVirgulas[12];
                Dados.leafmildVetor[i]=valoresEntreVirgulas[13];
                Dados.leafshredVetor[i]=valoresEntreVirgulas[14];
                Dados.leafspothaloVetor[i]=valoresEntreVirgulas[15];
                Dados.leafspotsizeVetor[i]=valoresEntreVirgulas[16];
                Dados.leafsspotmargVetor[i]=valoresEntreVirgulas[17];
                Dados.leavesVetor[i]=valoresEntreVirgulas[18];
                Dados.lodgiVetor[i]=valoresEntreVirgulas[19];
                Dados.moldgrowthVetor[i]=valoresEntreVirgulas[20];
                Dados.myceliumVetor[i]=valoresEntreVirgulas[21];
                Dados.plantgrowthVetor[i]=valoresEntreVirgulas[22];
                Dados.plantstandVetor[i]=valoresEntreVirgulas[23];
                Dados.precipVetor[i]=valoresEntreVirgulas[24];
                Dados.rootsVetor[i]=valoresEntreVirgulas[25];
                Dados.sclerotiaVetor[i]=valoresEntreVirgulas[26];
                Dados.seedVetor[i]=valoresEntreVirgulas[27];
                Dados.seeddisVetor[i]=valoresEntreVirgulas[28];
                Dados.seedsizeVetor[i]=valoresEntreVirgulas[29];
                Dados.seedtmtVetor[i]=valoresEntreVirgulas[30];
                Dados.severityVetor[i]=valoresEntreVirgulas[31];
                Dados.shrivelingVetor[i]=valoresEntreVirgulas[32];
                Dados.stemVetor[i]=valoresEntreVirgulas[33];
                Dados.stemcanckerVetor[i]=valoresEntreVirgulas[34];
                Dados.tempVetor[i]=valoresEntreVirgulas[35];                      
                Dados.doenca[i] = valoresEntreVirgulas[36];
                //System.out.println("similaridadeGlobal "+ i + "= "+ Dados.global[i] +"  Doença = "+Dados.doenca[i]);
                i++;
            }
           Dados.qtd = i;
                  
        
        }catch(FileNotFoundException e){
            
        }
        
    }
    
    
}
