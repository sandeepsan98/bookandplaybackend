package com.project.bookandplay.service;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.project.bookandplay.dao.GroundBookingDao;
import com.project.bookandplay.exceptions.DAOException;
import com.project.bookandplay.exceptions.InvalidGroundBookingDetailException;
import com.project.bookandplay.model.GroundBooking;
import com.project.bookandplay.util.Logger;
import com.project.bookandplay.validator.GroundBookingValidator;

public class GroundBookingService {

	public GroundBookingService() {
		// TODO Auto-generated constructor stub
	}
	static Logger logger = new Logger();
	GroundBookingValidator groundbookingvalidate = new GroundBookingValidator();
	GroundBookingDao groundbookingdao = new GroundBookingDao();

	/**
	 * The add groundbooking
	 */
	public boolean addGroundBooking(GroundBooking groundBooking) throws DAOException, SQLException,InvalidGroundBookingDetailException {
		if (groundbookingvalidate.validateBooking(groundBooking)) {
			groundbookingdao.addGroundBooking(groundBooking);
			logger.info("success");
			return true;
	

		}

		return false;

	}

	public boolean checkBookingExists(LocalDate bookingLocalDate, List<String> selectedTimingsarr,
			String selectedCourts, int groundId1) throws SQLException, DAOException {
	
		return groundbookingdao.checkBookingExists(bookingLocalDate, selectedTimingsarr, selectedCourts, groundId1);
	}
	
	
	public List<GroundBooking> getBookingDetailsByUserId(int id) throws DAOException, SQLException {

		return groundbookingdao.findUserBookings(id);

	}
	
	
	
public boolean cancelBooking(int bookingId) throws DAOException, SQLException {
		
		if(groundbookingdao.updateUserBookingStatusToZero(bookingId)){
			return true;
		}
		return false;
		
		
	}

public List<GroundBooking> getBookingDetailsBySellerId(int id) throws DAOException, SQLException {

	return groundbookingdao.findGroundAdminBookings(id);

}
public boolean cancelBookingByAdmin(int bookingId) throws DAOException, SQLException {
	
	if(groundbookingdao.updateBookingStatusToZero(bookingId)){
		return true;
	}
	return false;
	
	
}


}
