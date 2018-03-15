package br.com.fiap.ws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CANDIDATO")
@SequenceGenerator(name="candidato", sequenceName="SQ_T_CANDIDATO", allocationSize=1)
public class Candidato 
{
	@Id
	@GeneratedValue(generator="candidato", strategy=GenerationType.SEQUENCE)
	@Column(name="cd_candidato")
	private int codigo;
	
	@Column(name="nm_candidato", nullable=false)
	private String nome;
	
	@Column(name="ds_apelido")
	private String apelido;
	
	@Column(name="nr_numero", nullable=false)
	private int numero;
	
	@Column(name="st_ficha", nullable=false)
	private boolean fichaLimpa;

	
	
	public Candidato() {}
	
	public Candidato(String nome, String apelido, int numero, boolean fichaLimpa) 
	{
		this.nome = nome;
		this.apelido = apelido;
		this.numero = numero;
		this.fichaLimpa = fichaLimpa;
	}

	public int getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(int codigo) 
	{
		this.codigo = codigo;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getApelido() 
	{
		return apelido;
	}

	public void setApelido(String apelido) 
	{
		this.apelido = apelido;
	}

	public int getNumero() 
	{
		return numero;
	}

	public void setNumero(int numero) 
	{
		this.numero = numero;
	}

	public boolean isFichaLimpa() 
	{
		return fichaLimpa;
	}

	public void setFichaLimpa(boolean fichaLimpa) 
	{
		this.fichaLimpa = fichaLimpa;
	}
	
	
}
