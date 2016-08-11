package spring.in.action.chapter10.jdbc;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import spittr.entity.DefaultValue;

@Repository
public class DefaultValueDao {
	private static final String INSERT_DEFAULT_VALUE = "insert into default_value (name,age) values (?,?)";
	
	private JdbcOperations jdbcOperations;
	public DefaultValueDao(JdbcOperations jdbcOperations){
		this.jdbcOperations = jdbcOperations;
	}
	
	public void add(DefaultValue defaultValue){
		jdbcOperations.update(INSERT_DEFAULT_VALUE, defaultValue.getName(),defaultValue.getAge());
	}
}
