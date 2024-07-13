package br.com.alura.LiterAlura.repository;

import br.com.alura.LiterAlura.model.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface LivrosRepository extends JpaRepository<Livros, Integer> {

    @Query("select a from Livros a")
    List<Livros> findlivros();

    @Query("select a from Livros a where a.idioma like %?1%")
    List<Livros> findLivroByLanguage(String language);

}