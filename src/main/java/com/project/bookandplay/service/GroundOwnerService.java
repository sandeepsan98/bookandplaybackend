package com.project.bookandplay.service;

import java.sql.SQLException;
import java.util.List;

import com.project.bookandplay.dao.GroundDao;
import com.project.bookandplay.dao.GroundOwnerDao;
import com.project.bookandplay.exceptions.DAOException;
import com.project.bookandplay.exceptions.InvalidGroundOwnerDetailException;
import com.project.bookandplay.model.GroundOwner;
import com.project.bookandplay.validator.GroundOwnerDetailValidator;

public class GroundOwnerService {
	

	public GroundOwnerService() {
		// private constructor
	}
	
	
	GroundOwnerDetailValidator groundOwnerVal=new GroundOwnerDetailValidator();
	GroundOwnerDao groundOwnerDao =new GroundOwnerDao();
	GroundDao groundDao=new GroundDao();
	
	
	
	
	/**
	 * The add user
	 */
	public boolean addgroundOwner(GroundOwner groundOwner) throws DAOException, SQLException,InvalidGroundOwnerDetailException {
		if (groundOwnerVal.validateGroundOwner(groundOwner) && !groundOwnerDao.isEmailExist(groundOwner.getEmail()) ) {
			groundOwnerDao.addGroundOwner(groundOwner);
			return true;
		}
		return false;

	}

	/**
	 * The update user
	 */
	public boolean updategroundOwner(GroundOwner groundOwner) throws DAOException, SQLException ,InvalidGroundOwnerDetailException{
		if (groundOwnerVal.validateUpdateGroundOwner(groundOwner)) {
			groundOwnerDao.updateGroundOwner(groundOwner);
		}
		return true;

	}
	
	
	/**
	 * The get the user details
	 */
	public List<GroundOwner> getgroundOwnerDetails() throws DAOException, SQLException {

		return 	groundOwnerDao.getAllGroundOwner();

	}
	
	
	public GroundOwner getgroundOwneremailpass(String email, String password) throws DAOException, SQLException {

		return 	groundOwnerDao.getGroundOwnerByEmailAndPassword(email, password);

	}
	
	
	
	public GroundOwner getgroundOwnerById(int id) throws DAOException, SQLException {

		return 	groundOwnerDao.getGroundOwnerById(id);

	}
	
	
	public boolean checkGroundOwnerExistInGround(int id) throws DAOException, SQLException {
		
		if(groundDao.isGroundOwnerExist(id)){
			return true;
		}
		return false;
		
		
	}
	
}
