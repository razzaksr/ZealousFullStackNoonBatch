package noonstack.trial.NoonStackTrialSpringBoot.services;

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
}
