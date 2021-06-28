package noonstack.trial.NoonStackTrialSpringBoot.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import noonstack.trial.NoonStackTrialSpringBoot.modelentity.UserInfo;

/*
 * save(object)// entity object into relational table row
 * findById(key)// primary key based single row fetching
 * findAll()// all rows>> List<EntityClass>
 * delete(object) single row by object
 * deleteById(key) single row by primary key
 * 
 * findByPropertyName()
 * eg:
 * findByName("name")// 
 * findByLocation()
 * findByBMI()
 * findByContact()
 */

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Integer>
{

}
