package br.com.voting.vote.services;

import br.com.voting.vote.dtos.AssociateDTO;
import br.com.voting.vote.models.Associate;

import java.util.List;

/**
 * Contrato para operações de gerenciamento de associados.
 * 
 * Regras (para manter substituibilidade / princípio de Liskov):
 * - Todos os métodos que recebem ID usam Long (consistente com o modelo e repositório).
 * - Métodos que não encontrarem o recurso devem lançar NotFoundException (nunca retornar null).
 * - delete é idempotente: não falha se o recurso já não existir.
 */
public interface AssociateService {

    void createAssociate(AssociateDTO associateDTO);

    List<Associate> findAll();

    Associate findById(Long id);

    void deleteAssociate(Long id);

    void updateAssociate(Long id, AssociateDTO associateDTO);
}
