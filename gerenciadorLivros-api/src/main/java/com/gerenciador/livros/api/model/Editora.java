package com.gerenciador.livros.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CNPJ;

@Entity
@Table(name = "editora")
public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 3, max = 50)
	private String nmFantasia;

	@NotNull
	@Size(min = 3, max = 50)
	private String nmRazaoSocial;

	@NotNull
	@Max(18)
	@CNPJ
	private String nuCnpj;

//	@NotNull
//	@Size(min = 6, max = 15)
	private String nuInscricaoEstadual;
	
//	@Size(min = 3, max = 20)
	private String nmContato;

//	@Size(max = 50)
//	@Email()
	private String nmEmail;

//	@Size(max = 50)
	private String nmSite;

//	@Size(max = 15)
	private String nuFonePrincipal;

//	@Size(max = 15)
	private String nuFoneSecundario;

//	@Size(max = 15)
	private String nuFoneCelular;

	private Double vlDesconto;

//	@Max(1000)
	private String deObservacao;
	
//	@NotNull
	private Boolean flForaUso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNmFantasia() {
		return nmFantasia;
	}

	public void setNmFantasia(String nmFantasia) {
		this.nmFantasia = nmFantasia;
	}

	public String getNmRazaoSocial() {
		return nmRazaoSocial;
	}

	public void setNmRazaoSocial(String nmRazaoSocial) {
		this.nmRazaoSocial = nmRazaoSocial;
	}

	public String getNuCnpj() {
		return nuCnpj;
	}

	public void setNuCnpj(String nuCnpj) {
		this.nuCnpj = nuCnpj;
	}

	public String getNuInscricaoEstadual() {
		return nuInscricaoEstadual;
	}

	public void setNuInscricaoEstadual(String nuInscricaoEstadual) {
		this.nuInscricaoEstadual = nuInscricaoEstadual;
	}

	public String getNmContato() {
		return nmContato;
	}

	public void setNmContato(String nmContato) {
		this.nmContato = nmContato;
	}

	public String getNmEmail() {
		return nmEmail;
	}

	public void setNmEmail(String nmEmail) {
		this.nmEmail = nmEmail;
	}

	public String getNmSite() {
		return nmSite;
	}

	public void setNmSite(String nmSite) {
		this.nmSite = nmSite;
	}

	public String getNuFonePrincipal() {
		return nuFonePrincipal;
	}

	public void setNuFonePrincipal(String nuFonePrincipal) {
		this.nuFonePrincipal = nuFonePrincipal;
	}

	public String getNuFoneSecundario() {
		return nuFoneSecundario;
	}

	public void setNuFoneSecundario(String nuFoneSecundario) {
		this.nuFoneSecundario = nuFoneSecundario;
	}

	public String getNuFoneCelular() {
		return nuFoneCelular;
	}

	public void setNuFoneCelular(String nuFoneCelular) {
		this.nuFoneCelular = nuFoneCelular;
	}

	public Double getVlDesconto() {
		return vlDesconto;
	}

	public void setVlDesconto(Double vlDesconto) {
		this.vlDesconto = vlDesconto;
	}

	public String getDeObservacao() {
		return deObservacao;
	}

	public void setDeObservacao(String deObservacao) {
		this.deObservacao = deObservacao;
	}

	public Boolean getFlForaUso() {
		return flForaUso;
	}

	public void setFlForaUso(Boolean flForaUso) {
		this.flForaUso = flForaUso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Editora other = (Editora) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
