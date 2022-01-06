package com.oopsw.jh.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oopsw.jh.model.Document;

public interface DocumentService {
	
	// create
	public int createDocument() throws Exception;
	// read
	public List<Document> readDocuments() throws Exception;
	// update
	public int updateDocument() throws Exception;
	// delete
	public int deleteDocument() throws Exception;
	
	
	// 엑셀 다운로드
	public void poiExcelDownload(HttpServletRequest request, HttpServletResponse response) throws Exception; 
	
}
