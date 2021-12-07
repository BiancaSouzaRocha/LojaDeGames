package org.MinhaLojadeGames.MinhaLojadeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")

public class Categoria {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long idCategoria;
	
	@NotBlank
	@Size(min=10, max=30)
	private String nomeCategoria;
	
	@NotBlank
	@Size(min=15, max=500)
	private String descricaoCategoria;

}
