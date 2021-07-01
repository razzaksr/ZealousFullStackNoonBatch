package noonstack.trial.NoonStackTrialSpringBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import noonstack.trial.NoonStackTrialSpringBoot.modelentity.UserInfo;
import noonstack.trial.NoonStackTrialSpringBoot.repos.UserRepository;

@Service
public class UserService 
{
	@Autowired
	UserRepository userrepo;
	
	public UserInfo newRow(UserInfo info)
	{
		return userrepo.save(info);
	}
	
	public List<UserInfo> extractAll()
	{
		return (List<UserInfo>) userrepo.findAll();
	}
	
	public UserInfo extractOne(Integer id)
	{
		return userrepo.findById(id).orElse(new UserInfo());
	}
	
	public String removeViaId(Integer id)
	{
		String user=extractOne(id).getName();
		
		userrepo.deleteById(id);
		
		return user+" has deleted from Record";
	}
	
	public String removeViaObject(UserInfo object)
	{
		String user=object.getName();
		
		userrepo.delete(object);
		
		return user+" has deleted from Record";
	}
}
