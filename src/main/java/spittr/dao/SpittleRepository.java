package spittr.dao;

import java.util.List;

import spittr.entity.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
}
