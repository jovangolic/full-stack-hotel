package com.jovan.back_v2.service;

import java.util.List;

import com.jovan.back_v2.model.User;
import com.jovan.back_v2.model.Role;

public interface IRoleService {

	
	List<Role> getRoles();
	Role createRole(Role theRole);
	void deleteRole(Long id);
	Role findByName(String name);
	User removeUserFromRole(Long userId, Long roleId);
	
	//dodeljivanje role korisniku
	User assignRoleToUser(Long userId, Long roleId);
	
	Role removeAllUsersFromRole(Long roleId);
	
}
