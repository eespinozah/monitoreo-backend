package com.mrisk.monitoreo.infrastructure.rule.rest.spring.mapper;

import com.mrisk.monitoreo.infrastructure.rule.rest.spring.dto.RuleDto;
import com.mrisk.monitoreo.rule.domain.Rule;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-10T13:35:34-0300",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class RuleMapperImpl implements RuleMapper {

    @Override
    public RuleDto toDto(Rule rule) {
        if ( rule == null ) {
            return null;
        }

        RuleDto ruleDto = new RuleDto();

        ruleDto.setAlive( rule.getAlive() );
        ruleDto.setCreationTime( rule.getCreationTime() );
        ruleDto.setDestructionTime( rule.getDestructionTime() );
        ruleDto.setModificationTime( rule.getModificationTime() );
        ruleDto.setName( rule.getName() );
        ruleDto.setRuleId( rule.getRuleId() );
        ruleDto.setTenaId( rule.getTenaId() );

        return ruleDto;
    }

    @Override
    public Rule toDomain(RuleDto ruleDto) {
        if ( ruleDto == null ) {
            return null;
        }

        Rule rule = new Rule();

        rule.setAlive( ruleDto.getAlive() );
        rule.setCreationTime( ruleDto.getCreationTime() );
        rule.setDestructionTime( ruleDto.getDestructionTime() );
        rule.setModificationTime( ruleDto.getModificationTime() );
        rule.setName( ruleDto.getName() );
        rule.setRuleId( ruleDto.getRuleId() );
        rule.setTenaId( ruleDto.getTenaId() );

        return rule;
    }
}
