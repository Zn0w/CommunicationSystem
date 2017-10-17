package com.znow.communication_system.server.domain;

public class Message {
	
	private String date;
	private String from;
	private String to;
	private String subject;
	private String content;
	
	public Message(String date, String from, String to, String subject, String content) {
		this.date = date;
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.content = content;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getFrom() {
		return from;
	}
	
	public String getTo() {
		return to;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public String getContent() {
		return content;
	}
	
}
