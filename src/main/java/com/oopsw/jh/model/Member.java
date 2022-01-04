package com.oopsw.jh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MEMBER")
@Entity
public class Member {

    //@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private Integer age;

}