package com.example.load.services;

import java.util.List;
import java.util.Optional;

import com.example.load.model.Loads;

public interface LoadsService {
	 public List<Loads> getLoads();

	  public Optional<Loads> getLoad(long parseLong);
	  public List<Loads> getShipperData(Iterable<Long> parseLong);

	  public Loads addLoad(Loads load);

	  public Loads updateLoad(Loads load);

	  public void deleteLoad(long parseLong);

	//Optional<Course> getCourse(int courseid);

}
