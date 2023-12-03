package com.project.bookandplay.service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.SQLException;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.project.bookandplay.builder.GroundBuilder;
import com.project.bookandplay.exceptions.DAOException;
import com.project.bookandplay.model.Ground;
import com.project.bookandplay.util.Logger;

class TestGroundService {
	GroundService groundService = new GroundService();

	static Logger logger = new Logger();

	@Test
	//@Disabled("This test is currently disabled ")
	void testAddGround() throws DAOException, SQLException {
		Ground ground = getGround1();

		Assertions.assertTrue(groundService.addGround(ground));

	}

	@Test
	//@Disabled("This test is currently disabled ")
	void testUpdateGround() throws DAOException, SQLException {
		Ground ground = getGround2();

		Assertions.assertTrue(groundService.updateGround(ground));

	}

	@Test
	//@Disabled("This test is currently disabled ")
	void testDeleteGround() throws DAOException, SQLException {

		Assertions.assertTrue(groundService.deleteGround(1));

	}

	Ground getGround2() {
		List<String> validImages = Arrays.asList("https://iili.io/HjPs46b.jpg", "https://iili.io/HjPss8Q.jpg","https://iili.io/HjPsZAB.jpg");
		List<String> validsports = Arrays.asList("Cricket", "Football");
		LocalTime startTime = LocalTime.of(10, 30); // 10:00 AM
		LocalTime endTime = LocalTime.of(11, 30); // 5:00 PM
		// Ground ground=new Ground(1,"samplename", "samplemainarea", "sampleaddress",
		// "http://google.com", "sampledistrict", validImages, validsports, startTime,
		// endTime, "samplerules", 200, 200, 3);
		Ground ground1 = new GroundBuilder().groundIdBuild(2).groundNameBuild("Pitch and Play 2")
				.groundMainAreaBuild("Annasalai").groundAddressBuild("Sri  srirangam rajpurohitssss complex, 1/340, West Ave, MKB Nagar, Vyasarpadi, Chennai, Tamil Nadu 600039")
				
			.groundOwnerIdBuild(1)
				.groundImagesBuild(validImages).sportsAvailableBuild(validsports).startTimeBuild(startTime)
				.endTimeBuild(endTime).groundRulesBuild("For Football players are advised to wear shoes only on ground<\\n sharp metal football are not allowed\\n For tennis 6 players are only allowed")// TODO increase the length size
				.priceBuild(270).increasingPriceForExtraHoursBuild(200).courtsAvailableBuild(4).build();

		return ground1;

	}
	Ground getGround1() {
		List<String> validImages = Arrays.asList("https://iili.io/HjPs46b.jpg", "https://iili.io/HjPss8Q.jpg","https://iili.io/HjPsZAB.jpg");
		List<String> validsports = Arrays.asList("Cricket", "Football");
		LocalTime startTime = LocalTime.of(10, 30); // 10:00 AM
		LocalTime endTime = LocalTime.of(11, 30); // 5:00 PM
		// Ground ground=new Ground(1,"samplename", "samplemainarea", "sampleaddress",
		// "http://google.com", "sampledistrict", validImages, validsports, startTime,
		// endTime, "samplerules", 200, 200, 3);
		Ground ground1 = new GroundBuilder().groundNameBuild("Tiento Sports")
				.groundMainAreaBuild("Bengaluru Sudhama Nagar").groundAddressBuild("Lal Bagh Main Rd, Srinivas Colony, Sudhama Nagar, Bengaluru, Karnataka 560027")
				.groundLocationLinkBuild("https://goo.gl/maps/bKYnyhsTqY4cqAKT7").districtBuild("Bangalore")
			.groundOwnerIdBuild(3)
				.groundImagesBuild(validImages).sportsAvailableBuild(validsports).startTimeBuild(startTime)
				.endTimeBuild(endTime).groundRulesBuild("For Football players are advised to wear shoes only on ground sharp metal football are not allowed For tennis 6 players are only allowed")// TODO increase the length size
				.priceBuild(570).increasingPriceForExtraHoursBuild(200).courtsAvailableBuild(4).build();

		return ground1;

	}
	/**
	 * Ground getGround() { List<String> validImages =
	 * Arrays.asList("https://example.com/image1.jpg",
	 * "https://example.com/image2.jpg"); List<String> validsports =
	 * Arrays.asList("cricket", "football", "tennis"); LocalTime startTime =
	 * LocalTime.of(10, 30); // 10:00 AM LocalTime endTime = LocalTime.of(11, 30);
	 * // 5:00 PM Ground ground = new Ground("sample name", "sample main area",
	 * "sampleaddress", "http://google.com", "sampledistrict", validImages,
	 * validsports, startTime, endTime, "samplerules", 200, 200, 3); return ground;
	 * 
	 * }
	 */

//

	@Test
	void testGetGroundDetail() throws DAOException, SQLException {

		List<Ground> groundList = groundService.getGroundDetails();
		 assertNotNull(groundList); 
		for (Ground gr : groundList) {

			logger.info(gr);

		}

	}

	@Test
	void testGetGroundDetailById() throws DAOException, SQLException {

		logger.info(assertDoesNotThrow(() -> groundService.getGroundById(2)));

	}
	
	

	@Test
	void testGetGroundDetailByOwnerId() throws DAOException, SQLException {

		logger.info(assertDoesNotThrow(() -> groundService.getGroundByOwnerId(1)));

	}

	@Test
	void testInvalidGetGroundDetailById() throws DAOException, SQLException {

		try {
			assertNull(groundService.getGroundById(0));
		}

		catch (DAOException e) {
			fail("Read ground by id test case failed");
		}

	}

}
