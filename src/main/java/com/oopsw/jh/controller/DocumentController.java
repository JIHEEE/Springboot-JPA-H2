package com.oopsw.jh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oopsw.jh.model.Document;
import com.oopsw.jh.service.DocumentService;

import lombok.RequiredArgsConstructor;

@RestController
public class DocumentController {

	@Autowired
	private DocumentService documentService;
	
	@GetMapping("/api/documents")
	public List<Document> readDocuments() throws Exception {
		return documentService.readDocuments();
	}
	

}
