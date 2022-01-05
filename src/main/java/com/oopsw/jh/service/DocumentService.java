package com.oopsw.jh.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oopsw.jh.model.Document;

public interface DocumentService {
	
	// 문서 리스트
	public List<Document> readDocuments() throws Exception;
	
	// 엑셀 다운로드
	public void poiExcelDownload(HttpServletRequest request, HttpServletResponse response) throws Exception; 
	
}
