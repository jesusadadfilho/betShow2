package app;

import model.Aposta;
import model.Competicao;
import model.Jogo;
import model.Time;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        List<Competicao> competicaos = new ArrayList<>();
        List<Time> times = new ArrayList<>();
        List<Jogo> jogos = new ArrayList<>();
        List<Aposta> bilhete = new ArrayList();

       boolean rodando = true;
       while (rodando){
           switch (Layout.menu()){
               case 1:
                   switch (Layout.menuCompeticao()){
                       case 1:
                           System.out.println(competicaos);
                           break;
                       case 2:
                           competicaos.add(Layout.formCompeticao());
                           break;
                       
                   }
                   break;
              case 2:
            	  switch (Layout.menuTimes()) {
            	  	case 1:
            	  		for(int i = 0; i < times.size();i++) {
            	  			System.out.println(times.get(i).getNome());
            	  		}
            	  		break;
            	  	case 2:
            	  		Layout.formarTimes(times);
            	  		break;
            	  }
            	  break;
             case 3:
           	   Layout.formarJogos(times, jogos);
                   break;
             case 4:
            	 Layout.bilheteria(bilhete, times, jogos);
            	 break;
             case 5:
            	 Layout.resultados(jogos, bilhete);
            	 break;
           }
           


       }

    }
}
