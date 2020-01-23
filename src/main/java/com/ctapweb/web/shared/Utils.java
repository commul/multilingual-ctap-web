package com.ctapweb.web.shared;

<<<<<<< HEAD
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import org.apache.logging.log4j.Level;

import com.ctapweb.web.client.HistoryToken;
import com.ctapweb.web.server.logging.LogMarker;
import com.ctapweb.web.server.logging.ServiceRequestCompletedMessage;
import com.ctapweb.web.shared.exception.AccessToResourceDeniedException;
import com.ctapweb.web.shared.exception.DatabaseException;
import com.ctapweb.web.shared.exception.UserNotLoggedInException;
=======
import com.ctapweb.web.client.HistoryToken;
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.History;

public class Utils {

	//	static Logger logger = Logger.getLogger(Utils.class.getName());
	//	static boolean isLoggedIn;
	//	static String userCookieValue;
	//	static UserInfo userInfo = null;
	//	static SafeHtml newBtnSafeHTML;

	public static boolean isEmailValid(String email) {
		return !email.isEmpty() && email.matches("^([a-zA-Z0-9_.\\-+])+@(([a-zA-Z0-9\\-])+\\.)+[a-zA-Z0-9]{2,4}$");
	}

	public static void showErrorPage(String errMessage) {
		HistoryToken.setErrorMsg(errMessage);
		History.newItem(HistoryToken.error);
	}

	/**
	 * get client cookies and construct a UserInfo object
	 * @return UserInfo object
	 */
	public static UserInfo getUserInfoFromCookies() {
		UserInfo userInfo = null;

		//get saved cookies
		String email = Cookies.getCookie(SharedProperties.COOKIES_USER_EMAIL);
		long id = Long.parseLong(Cookies.getCookie(SharedProperties.COOKIES_USER_ID));
		String sessionToken = Cookies.getCookie(SharedProperties.COOKIES_USER_SESSIONTOKEN);

		//create userInfo
		if(email != null && id != 0 && sessionToken != null ) {
			userInfo = new UserInfo();
			userInfo.setEmail(email);
			userInfo.setId(id);
			userInfo.setSessionToken(sessionToken);
		}
		
		return userInfo;
	}

}
