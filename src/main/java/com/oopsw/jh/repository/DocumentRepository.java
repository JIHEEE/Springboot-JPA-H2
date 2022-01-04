package com.oopsw.jh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oopsw.jh.model.Document;

import lombok.RequiredArgsConstructor;

@Repository
public interface DocumentRepository extends JpaRepository<Document, String>{
	
}
