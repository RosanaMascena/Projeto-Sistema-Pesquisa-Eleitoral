
package programacaoavancadaatividade01;

import javax.swing.JOptionPane;

public class ProgramacaoAvancadaAtividade01 {


    public static void main(String[] args) {
        
        int pessoas;
        int opcaoZeFarm = 0;
        int opcaoRitaPad = 0;
        int soma = 1;
        
        
        String pessoasStr = JOptionPane.showInputDialog(null, "Qual a quantidade de pessoas da pesquisa?");
        pessoas = Integer.parseInt(pessoasStr);
        
        while (soma <= pessoas){
            String votos = JOptionPane.showInputDialog(null, "Qual candidato você deseja votar?\n\nOpção 1 - Zé da Farmácia\nOpção 2 - Rita da Padaria");
            switch(votos) {
                case "1" -> opcaoZeFarm += 1;
                case "2" -> opcaoRitaPad += 1;
            }
            soma++;
        }
        
        float totalZeFarm = (100 / pessoas) * opcaoZeFarm;
        float totalRitaPad = (100 / pessoas) * opcaoRitaPad;
        int totalVotos = opcaoZeFarm + opcaoRitaPad;
        
        JOptionPane.showMessageDialog(null, "Resultado da Pesquisa\n\nTotal de Votos: "+totalVotos+"\n\nZé da Famácia: "+opcaoZeFarm+" votos - "+totalZeFarm+"%\nRita da Padaria: "+opcaoRitaPad+" votos - "+totalRitaPad+"%");
    }
    
}
