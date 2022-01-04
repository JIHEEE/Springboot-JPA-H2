package com.oopsw.jh.service;

import java.util.List;

import com.oopsw.jh.model.Document;

public interface DocumentService {
	
	// 문서 리스트
	public List<Document> readDocuments() throws Exception;
	
	
}
