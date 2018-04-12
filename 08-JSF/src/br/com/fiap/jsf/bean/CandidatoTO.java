package br.com.fiap.jsf.bean;


public class CandidatoTO 
{
	private int codigo;
	
	private String nome;
	
	private String apelido;
	
	private int numero;
	
	private boolean fichaLimpa;

	
	
	public CandidatoTO() {}
	
	public CandidatoTO(String nome, String apelido, int numero, boolean fichaLimpa) 
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
