package com.oopsw.jh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Document {
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private String registNo;			// 접수 번호
	private String applyDate;			// 접수 일시
	private String applicant;			// 접수자명
	private String requestContents;		// 요청 내용
	private String managerName;			// 조회 담당자명
	private String managerDept;			// 조회 담당자 부서
	private String memo;				// 기타 메모
	private String alreadyReceivedYN;	// 기접수 여부
	@Column(nullable = true)
	private String alreadyReceivedNo;	// 기접수 번호
	private String creationDate;		// 문서 생성 일자
	private String wayOfRegistration;	// 접수 방식
	private String address;				// 주소

}
