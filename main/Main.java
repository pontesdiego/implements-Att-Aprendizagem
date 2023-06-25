package main;

import java.time.LocalDate;
import java.time.Month;

import funcionario.Diretor;
import funcionario.Motoboy;
import funcionario.Setor;
import pessoa.Endereco;
import pessoa.UnidadeFederativa;
import pessoa.fisica.EstadoCivil;
import pessoa.fisica.Genero;

public class Main {
	public static void main(String[] args) {
		
		Diretor diretor = new Diretor("777777", "Diego", "(71) 98775632355", "diego@gmail.com", EstadoCivil.SOLTEIRO, Genero.CONSTANTE,
				new Endereco("Vista alegre", "567", "bloco 744", "salvador", "85475685688", UnidadeFederativa.VISTA_ALEGRE), LocalDate.of(2005, Month.APRIL, 30), 
				"666666", "86593045245", Setor.JURIDICO, 8759345, 1000);
		
		Motoboy moto = new Motoboy("777777", "Diego", "(71) 98775632355", "diego@gmail.com", EstadoCivil.SOLTEIRO, Genero.CONSTANTE,
				new Endereco("Vista alegre", "567", "bloco 744", "salvador", "85475685688", UnidadeFederativa.VISTA_ALEGRE), LocalDate.of(2005, Month.APRIL, 30), 
				"666666", "86593045245", Setor.JURIDICO, 8759345, 1000, "1231248");
		
		System.out.println(diretor);
		
		System.out.println("");
		
		diretor.admitir(moto);
	}

}
