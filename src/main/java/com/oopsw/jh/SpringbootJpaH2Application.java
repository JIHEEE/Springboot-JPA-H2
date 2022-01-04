package com.oopsw.jh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

import com.oopsw.jh.model.Document;
import com.oopsw.jh.model.Member;
import com.oopsw.jh.repository.DocumentRepository;
import com.oopsw.jh.repository.MemberRepository;

@SpringBootApplication
public class SpringbootJpaH2Application {
	
	@Autowired
    private MemberRepository memberRepository;
	
	@Autowired
    private DocumentRepository documentRepository;

	@Bean
    public ApplicationRunner applicationRunner() {
        return new ApplicationRunner() {
			@Override
			public void run(ApplicationArguments args) throws Exception {
				memberRepository.save(new Member("1", "Andrew", 45));
				memberRepository.save(new Member("2", "White", 30));
				memberRepository.save(new Member("3", "Black", 24));
			}
        };
    }

	@EventListener(ApplicationReadyEvent.class) 
	public void init(){ 
		documentRepository.save(new Document("1", "20211201", "홍길동", "요청합니다.", "김철수", 
											"소비자보호실", "메모입니다.", "N", "", "20211202",
											"방문", "서울특별시 강남구"));
		
		documentRepository.save(new Document("2", "20220103", "홍길동", "요청합니다.", "김철수", 
											"소비자보호실", "메모입니다.", "N", "", "20220104",
											"방문", "서울특별시 관악구"));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaH2Application.class, args);
	}

}
