package app;

import model.Aposta;
import model.Competicao;
import model.Jogo;
import model.Time;

import java.util.ArrayList;
import java.util.List;
import util.ParseBet;

public class Main {

    public static void main(String[] args) {

        ParseBet parseBet = new ParseBet();

        List<Competicao> competicaos = parseBet.getCompeticoes();
        List<Time> times = parseBet.getTimes();
        List<Jogo> jogos = new ArrayList<>();
        List<Aposta> bilhete = new ArrayList();

        boolean rodando = true;
        while (rodando) {
            switch (Layout.menu()) {
                case 1:
                    boolean compmenu = true;
                    while (compmenu) {
                        switch (Layout.menuCompeticao()) {
                            case 1:
                                System.out.println(competicaos);
                                break;
                            case 2:
                                competicaos.add(Layout.formCompeticao());
                                break;
                            case 3:
                                Layout.formAddTimeCompeticao(competicaos, times);
                                break;
                            case 0:
                                compmenu = false;
                                break;
                        }
                    }

                    break;
                case 2:
                    boolean timemenu = true;
                    while (timemenu) {
                        switch (Layout.menuTimes()) {
                            case 1:
                                System.out.println(times);
                                break;
                            case 2:
                                Layout.formTimes(times);
                                break;
                            case 0:
                                timemenu = false;
                                break;
                        }
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
