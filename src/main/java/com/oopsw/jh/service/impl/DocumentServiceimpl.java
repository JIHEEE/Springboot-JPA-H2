package com.oopsw.jh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oopsw.jh.model.Document;
import com.oopsw.jh.repository.DocumentRepository;
import com.oopsw.jh.service.DocumentService;

import lombok.RequiredArgsConstructor;

@Service
public class DocumentServiceimpl implements DocumentService {

	@Autowired
	private DocumentRepository documentRepository;
	
	@Override
	public List<Document> readDocuments() throws Exception {
		return documentRepository.findAll();
	}

}
