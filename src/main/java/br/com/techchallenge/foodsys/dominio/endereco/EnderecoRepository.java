package br.com.techchallenge.foodsys.dominio.endereco;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    List<Endereco> findByUsuarioId(Long usuarioId, Sort sort);
    boolean existsByUsuarioIdAndCep(Long usuarioId, String cep);
}