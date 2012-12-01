package br.com.usjt.aeroporto.dao;

import java.util.List;

public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

	@Override
	public void delete(T t) {
	};

	@Override
	public List<T> findByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(T t) {
	};

	@Override
	public void update(T t) {
	};

	@Override
	public T findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
