package com.project.bookandplay.service;

import java.sql.SQLException;

import com.project.bookandplay.dao.ChatDao;
import com.project.bookandplay.exceptions.DAOException;
import com.project.bookandplay.model.ChatByPlayer;
import com.project.bookandplay.model.GroundOwner;
import com.project.bookandplay.validator.ChatMessageValidator;

public class ChatService {

	public ChatService() {
		// TODO Auto-generated constructor stub
	}

	ChatMessageValidator cmv = new ChatMessageValidator();
	ChatDao cmdao = new ChatDao();

	
	public boolean addChat(ChatByPlayer chat) throws DAOException, SQLException {
		if (cmdao.addChat(chat)) {

			return true;
		}
		return false;

	}
	
	
	public  ChatByPlayer getChatHistory(int loggedInUserId, int otherUserId) throws DAOException, SQLException{
		return cmdao.getChatHistory(loggedInUserId, otherUserId);
		
	}
	
	
	public boolean deleteMessage(int id) throws DAOException, SQLException {
		
		if(cmdao.deleteMessage(id)){
			return true;
		}
		return false;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
