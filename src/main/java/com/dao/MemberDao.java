package com.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.bean.Member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDao {

	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void addMember(Member member) {
		this.hibernateTemplate.save(member);
	}
}
