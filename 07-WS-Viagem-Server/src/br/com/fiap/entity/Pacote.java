package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PACOTE")
@SequenceGenerator(name="pacote", sequenceName="T_SQ_PACOTE", allocationSize=1)
public class Pacote 
{
	@Id
	@Column(name="cd_pacote")
	@GeneratedValue(generator="pacote", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_destino", nullable=false, length=50)
	private String destino;
	
	@Column(name="vl_pacote", nullable=false)
	private double valor;
	
	@Column(name="qt_diarias", nullable=false)
	private int diarias;

	public Pacote() {}
	
	public Pacote(String destino, double valor, int diarias) 
	{
		this.destino = destino;
		this.valor = valor;
		this.diarias = diarias;
	}

	public int getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(int codigo) 
	{
		this.codigo = codigo;
	}

	public String getDestino() 
	{
		return destino;
	}

	public void setDestino(String destino) 
	{
		this.destino = destino;
	}

	public double getValor() 
	{
		return valor;
	}

	public void setValor(double valor) 
	{
		this.valor = valor;
	}

	public int getDiarias() 
	{
		return diarias;
	}

	public void setDiarias(int diarias) 
	{
		this.diarias = diarias;
	}
	
	
}
