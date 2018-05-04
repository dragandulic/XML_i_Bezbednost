package com.group4bezbednost.bezbednost.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SSCertificate implements Serializable{

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String alias;
	
	private boolean certificateCA;
	
	
	
	private BigInteger serialnum;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public boolean isCertificateCA() {
		return certificateCA;
	}

	public void setCertificateCA(boolean certificateCA) {
		this.certificateCA = certificateCA;
	}

	

	public BigInteger getSerialnum() {
		return serialnum;
	}

	public void setSerialnum(BigInteger serialnum) {
		this.serialnum = serialnum;
	}

	

	
	
	
	
		
	
	
	
	
	
}
