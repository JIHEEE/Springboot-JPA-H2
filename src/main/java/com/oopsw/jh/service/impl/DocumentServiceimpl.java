package com.oopsw.jh.service.impl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oopsw.jh.model.Document;
import com.oopsw.jh.repository.DocumentRepository;
import com.oopsw.jh.service.DocumentService;

@Service
public class DocumentServiceimpl implements DocumentService {

	@Autowired
	private DocumentRepository documentRepository;
	
	@Override
	public List<Document> readDocuments() throws Exception {
		return documentRepository.findAll();
	}

	@Override
	public void poiExcelDownload(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Map<String, Object> model = new HashMap<>();
		
		// 엑셀 파일명
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String formatTime = format.format(System.currentTimeMillis());
		String filename = "문서접수대장_" + formatTime;
		
		// 엑셀 시트명
		String sheetName = "문서접수대장";
		
		// 엑셀 header
		String[] headerArr = {"No", "접수 번호", "접수 일시", "접수자명", "요청 내용", "조회 담당자명", "조회 담당자 부서", "기타 메모", 
								"기접수 여부", "기접수 번호", "문서 생성 일자", "접수 방식", "주소"};
		String[] headerVarArr = {"index", "registNo", "applyDate", "applicant", "requestContents", "managerName", "managerDept", "memo", "alreadyReceivedYN", 
								"alreadyReceivedNo", "creationDate", "wayOfRegistration", "address"};
		
		// 엑셀 body
		List<Document> dataList = documentRepository.findAll();
		
		model.put("filename", filename);
		model.put("sheetName", sheetName);
		model.put("headerArr", headerArr);
		model.put("headerVarArr", headerVarArr);
		model.put("dataList", dataList);
		
		//poiExcelDownView.renderMergedOutputModel(model, request, response);
		
		
	}

}
