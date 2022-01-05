package com.oopsw.jh.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oopsw.jh.model.Document;
import com.oopsw.jh.service.DocumentService;

@RestController
@CrossOrigin
public class DocumentController {

	@Autowired
	private DocumentService documentService;
	
	@GetMapping("/api/documents")
	public List<Document> readDocuments() throws Exception {
		return documentService.readDocuments();
	}
	
	@RequestMapping("/document/poiExcelDownload.do")
	public void poiExcelDownload(HttpServletRequest request, HttpServletResponse response) throws Exception {
		documentService.poiExcelDownload(request, response);
	}
	
	
}
