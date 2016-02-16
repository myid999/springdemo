package com.habuma.spitter.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;

@Component
@WebService(serviceName = "SpitterService")
public interface SpitterService {
/*	List<Spittle> getRecentSpittles(int count);

	void saveSpittle(Spittle spittle);

	void saveSpitter(Spitter spitter);

	Spitter getSpitter(long id);

	void startFollowing(Spitter follower, Spitter followee);

	List<Spittle> getSpittlesForSpitter(Spitter spitter);

	List<Spittle> getSpittlesForSpitter(String username);

	Spitter getSpitter(String username);

	Spittle getSpittleById(long id);

	void deleteSpittle(long id);

	List<Spitter> getAllSpitters();*/
	
	@WebMethod
	public void addSpittle(Spittle spittle) ;

	@WebMethod
	public void deleteSpittle(long spittleId);

	@WebMethod
	public List<Spittle> getRecentSpittles(int spittleCount);

	@WebMethod
	public List<Spittle> getSpittlesForSpitter(Spitter spitter) ;
	
	@WebMethod
	public Spitter getSpitter(String username);

}
