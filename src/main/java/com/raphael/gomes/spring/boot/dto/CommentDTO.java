package com.raphael.gomes.spring.boot.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String text;
	private Date daste;
	private AuthorDTO author;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String text, Date daste, AuthorDTO author) {
		super();
		this.text = text;
		this.daste = daste;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDaste() {
		return daste;
	}

	public void setDaste(Date daste) {
		this.daste = daste;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
