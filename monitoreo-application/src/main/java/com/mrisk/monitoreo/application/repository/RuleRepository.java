package com.mrisk.monitoreo.application.repository;

import java.util.List;

import com.mrisk.monitoreo.domain.Rule;

public interface RuleRepository {
	
	List<Rule> getRuleAll();
	
	Rule findById(Long id);

	Rule save(Rule rule);

}
