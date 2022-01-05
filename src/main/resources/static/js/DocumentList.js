$(function(){
	
/*=======================================================================================
	Init Function
========================================================================================*/	
	
	ajaxDocumentList();
	
	
/*=======================================================================================
	Event Function
========================================================================================*/		
	
	$("#btn_excelDownload").on("click", function(){
		document.location="/document/poiExcelDownload.do";
	});
	
	

/*=======================================================================================
	Service Function
========================================================================================*/	
	
	function ajaxDocumentList(){
		
		$.ajax({
			url			: "/api/documents",
			type		: "GET",
			contentType	: "application/json; charset=UTF-8",
			async		: true,
			cache		: false
		}).done(function(data, textStatus, xhr){
			var text = "";
            
            text += '<table class="table" border="0" cellpadding="0" cellspacing="0">';
            text += 	'<colgroup>';
            text += 		'<col width="3%">';
            text += 		'<col width="5%">';
            text += 		'<col width="5%">';
            text += 		'<col width="5%">';
            text += 		'<col width="5%">';
            text += 		'<col width="5%">';
            text += 		'<col width="5%">';
            text += 		'<col width="2%">';
            text += 		'<col width="5%">';
            text += 		'<col width="5%">';
            text += 		'<col width="5%">';
            text += 		'<col width="8%">';
            text += 	'</colgroup>';
            text +=		'<tr>';
            text +=			'<th align="center" class="listth">접수 번호</th>';
            text +=			'<th align="center" class="listth">접수 일시</th>';
            text +=			'<th align="center" class="listth">접수자명</th>';
            text +=			'<th align="center" class="listth">요청 내용</th>';
            text +=			'<th align="center" class="listth">조회 담당자명</th>';
            text +=			'<th align="center" class="listth">조회 담당자 부서</th>';
            text +=			'<th align="center" class="listth">기타 메모</th>';
            text +=			'<th align="center" class="listth">기접수 여부</th>';
            text +=			'<th align="center" class="listth">기접수 번호</th>';
            text +=			'<th align="center" class="listth">문서 생성 일자</th>';
            text +=			'<th align="center" class="listth">접수 방식</th>';
            text +=			'<th align="center" class="listth">주소</th>';
            text +=		'</tr>';
            
            if(data.length != 0){
	            
	            $.each(data, function(idx, val){
					text += '<tr>';
					text += '<td align="center" class="listtd">' + val.registNo + '</td>';
					text += '<td align="center" class="listtd">' + val.applyDate + '</td>';
					text += '<td align="center" class="listtd">' + val.applicant + '</td>';
					text += '<td align="center" class="listtd">' + val.requestContents + '</td>';
					text += '<td align="center" class="listtd">' + val.managerName + '</td>';
					text += '<td align="center" class="listtd">' + val.managerDept + '</td>';
					text += '<td align="center" class="listtd">' + val.memo + '</td>';
					text += '<td align="center" class="listtd">' + val.alreadyReceivedYN + '</td>';
					text += '<td align="center" class="listtd">' + val.alreadyReceivedNo + '</td>';
					text += '<td align="center" class="listtd">' + val.creationDate + '</td>';
					text += '<td align="center" class="listtd">' + val.wayOfRegistration + '</td>';
					text += '<td align="center" class="listtd">' + val.address + '</td>';
					text += '</tr>';
				});
				
			}
			
			text += '</table>';
            
            $("#table").html(text);
                        
		}).fail(function(jqXHR, textStatus, errorThrown){
			console.log("textStatus :: " + textStatus);
			console.log("status :: " + status);
		});
		
	} // ajaxDocumentList()
	
	
	
	
})