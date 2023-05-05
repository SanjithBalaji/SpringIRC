package com.sample.pieceone.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sample.pieceone.sanjith.sampleone;

import jakarta.transaction.Transactional;
@Repository
public interface CarRepo extends JpaRepository<sampleone, Integer> {
	/*
	@Query(value="select * from jdm",nativeQuery = true)

	public List<sampleone> getAllData();

	@Query(value="select * from jdm where cid=:id",nativeQuery=true)

	public List<sampleone> byCName(@Param("id") int cid);

	@Query(value="select * from jdm where cid between :start and :end",nativeQuery=true)

	public List<sampleone> startEnd(@Param("start") int start,@Param("end") int end);

	@Modifying

	@Transactional

	@Query(value="delete from jdm where cid=?1 and brand=?2",nativeQuery = true)

	Integer deleteDet(@Param("id")int gid,@Param("name") String oname);

	@Modifying

	@Transactional

	@Query(value="update jdm set brand=?1 where cid=?2",nativeQuery=true)

	Integer updateDet(@Param("brand")String oname,@Param("id") int gid);

	//JPQL uses Model Names

	@Query(value="select c from sampleone c")

	List<sampleone> getAll();

	@Query(value="select c from sampleone c where c.cid=?1")

	public List<sampleone> jpql(@Param("id") int gid);

	@Modifying

	@Transactional

	@Query(value="delete from sampleone c where c.cid=?1 and c.brand=?2")

	Integer deleteDetails(@Param("id")int gid,@Param("name") String oname);

	@Modifying

	@Transactional

	@Query(value="update sampleone c set c.brand=?1 where c.cid=?2")

	Integer updateDetails(@Param("brand")String oname,@Param("id") int gid);
	*/
}
