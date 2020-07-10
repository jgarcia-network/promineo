package com.promineotech.socialMediaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.socialMediaApi.entity.User;
import com.promineotech.socialMediaApi.repository.UserRepository;
import com.promineotech.socialMediaApi.view.Following;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public User createUser(User user) {
		return repo.save(user);
	}

	public User login(User user) throws Exception {
		User foundUser = repo.findByUsername(user.getUsername());
		if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
			return foundUser;
		} else {
			throw new Exception("Invalid username or password.");
		}
	}

	public Following follow(Long userld, Long followld) throws Exception {
		User user = repo.findOne(userld);
		User follow = repo.findOne(followld);
		if (user == null || follow == null) {
			throw new Exception("User does not exist.");
		}
		user.getFollowing().add(follow);
		repo.save(user);
		return new Following(user);
	}

	public Following getFollowedUsers(Long userld) throws Exception {
		User user = repo.findOne(userld);
		if (user == null) {
			throw new Exception("User does not exist.");
		}
		return new Following(user);
	}

	public User updateProfilePicture(Long userld, String url) throws Exception {
		User user = repo.findOne(userld);
		if (user == null) {
			throw new Exception("User does not exist.");
		}
		user.setProfilePictureUrl(url);
		return repo.save(user);
	}
}
