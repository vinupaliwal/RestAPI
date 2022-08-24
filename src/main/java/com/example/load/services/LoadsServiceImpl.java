package com.example.load.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.load.model.Loads;
import com.example.load.repository.LoadsRepository;

@Service
public class LoadsServiceImpl implements LoadsService {
	@Autowired
	private LoadsRepository loadsRepository;
	
	@Override
	public List<Loads> getLoads() 
	{
		return loadsRepository.findAll();
	}
	
	@Override
	public Optional<Loads> getLoad(long loadsId) 
	{
		return (Optional<Loads>) loadsRepository.findById(loadsId);
	}
	@Override
	public List<Loads> getShipperData(Iterable<Long> shipperId) 
	{
		return loadsRepository.findAllById(shipperId);
	}
	
	@Override
	public Loads addLoad(Loads load) {
		loadsRepository.save(load);
		return load;
	}
	
	@Override
	public Loads updateLoad(Loads load) {
		loadsRepository.save(load);
		return load;
	}
	
	@Override
	public void deleteLoad(long parseLong) {
//		Optional<Course> entity = courseDao.findById(parseLong);
		
	    loadsRepository.deleteById(parseLong); 
	    System.out.println(parseLong);
	}
}
