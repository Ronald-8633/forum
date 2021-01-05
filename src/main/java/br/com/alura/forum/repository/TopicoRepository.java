package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
	
	//@Query ("Query sql na mão") caso queira escrever outra coisa ao inves de FindBy + @param ("nomeCurso")
	List<Topico> findByCursoNome(String nomeCurso);

}
