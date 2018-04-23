package app;

import model.Aposta;
import model.Competicao;
import model.Database;
import model.Jogo;
import model.Resultado;
import model.Time;

import java.util.List;
import java.util.Scanner;

public class Layout {
    public static int menu(){
        System.out.println("**********  BetShow ************");
        System.out.println("1 - Competi√ß√µes");
        System.out.println("2 - Times");
        System.out.println("3 - Jogos");
        System.out.println("4 - Bilheteria");
        System.out.println("5 - Resultados");
        System.out.println("0 - Sair");
        Scanner op = new Scanner(System.in);
        return  op.nextInt();
        

    }

    public static int menuCompeticao(){
        System.out.println("**********  BetShow - Competi√ß√£o ************");
        System.out.println("1 - Listar");
        System.out.println("2 - Adicionar");
        System.out.println("0 - Sair");
        Scanner op = new Scanner(System.in);
        return  op.nextInt();
    }

    public static Competicao formCompeticao(){
        Database database = new Database();
        Competicao competicao = new Competicao();

        System.out.println("**********  BetShow - Competi√ß√£o - Cadastro ************");
        System.out.println("Digite a descricao");
        Scanner descricao = new Scanner(System.in);
        competicao.setNome(descricao.next());

        System.out.println("Digite a fase:" + database.getFases().toString());
        Scanner fase = new Scanner(System.in);
        competicao.setFaseToOne(database.getFases().get(fase.nextInt()));

        System.out.println("Digite a categoria:" + database.getCategorias().toString());
        Scanner categoria = new Scanner(System.in);
        competicao.setCategoria(database.getCategorias().get(categoria.nextInt()));
        return competicao;
    }
    
    public static int menuTimes(){
        System.out.println("**********  BetShow - times ************");
        System.out.println("1 - Listar");
        System.out.println("2 - Adicionar");
        System.out.println("0 - Sair");
        Scanner op = new Scanner(System.in);
        return  op.nextInt();
    }
    
    public static void formarTimes(List<Time> times) {
		if(times.size() <= 10) {
			Time time = new Time();
			System.out.println("**********  BetShow - Time - Cadastro ************");
	        System.out.println("Digite o nome do time: ");
	        Scanner descricao = new Scanner(System.in);
	        time.setNome(descricao.next());
	        times.add(time);
		}else {
			System.out.println("Numero maximo de times exedido!");
		}
    }
    
    public static void formarJogos(List<Time> times, List<Jogo> jogos) {
    	if(times.size()%2 == 0 && !times.isEmpty()) {
    		for(int i = 0; i < times.size()-1;i = i+2) {
    			jogos.add(new Jogo(times.get(i),times.get(i+1)));
    		}
    		for(int j = 0; j < jogos.size();j++) {
    			System.out.println((j +1) + " - " + jogos.get(j).getTimeMandante().getNome() + " vs " + jogos.get(j).getTimeVisitante().getNome());
    		}
    	}else {
    		System.out.println("quantidade de times inconsistente!");
    	}
    }
    
    public static void bilheteria(List<Aposta> apostas, List<Time> times, List<Jogo> jogos) {
    	if(times.size()%2 == 0 && !times.isEmpty()) {
    		for(int j = 0; j < jogos.size();j++) {
    			System.out.println((j +1) + " - " + jogos.get(j).getTimeMandante().getNome() + " vs " + jogos.get(j).getTimeVisitante().getNome());
    		}
    		for(int i = 0; i < jogos.size();i++) {
    			System.out.println("Qual ser· o resultado do jogo " + (i + 1) + "?");
    			System.out.println("0 - empate, 1 - Vitoria da casa, 2 - Vitoria do visitante");
    			Scanner op = new Scanner(System.in);
    	        apostas.add(new Aposta(jogos.get(i)));
    	        apostas.get(i).setPalpite(op.nextInt());
    		}
    	}else {
    		System.out.println("quantidade de jogos inconsistente!");
    	}
    }
    
    public static void resultados(List<Jogo> jogos, List<Aposta> apostas) {
    	boolean venceu = true;
    	if(!jogos.isEmpty()) {
    		for(Jogo jogo : jogos) {
    			jogo.setResultado(new Resultado());
    			System.out.println(jogo.getResultado().getResultado());
    		}
    	}else {
    		System.out.println("N„o h· jogos no momento");
    	}
    	
    	for(int i = 0; i < jogos.size(); i++) {
    		if(apostas.get(i).palpite != jogos.get(i).getResultado().getValorDoResultado()) {
    			venceu = false;
    		}
    	}
    	
    	if(venceu) {
    		System.out.println("parabens vocÍ venceu");
    	}else {
    		System.out.println("Infeslimente vocÍ perdeu");
    	}
    }
    
    
    
   



}
