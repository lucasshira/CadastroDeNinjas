package dev.java10x.CadastroDeNinjas.Ninjas.Model;

import dev.java10x.CadastroDeNinjas.Missoes.Model.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// usando Entity, transformamos toda a classe em uma entidade no banco de dados
@Entity
@Table(name = "tb_cadastro")
@Data // cria automaticamente getters e setters (lombok)
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // varios ninjas podem ter uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreign key (chave estrangeira)
    private MissoesModel missoes;
}
