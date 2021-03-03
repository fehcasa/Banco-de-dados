package bancodedados.bancodedados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bancodedados.bancodedados.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}