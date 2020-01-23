package com.ctapweb.web.server.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Arrays;
=======
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ctapweb.web.server.DBConnectionManager;
import com.ctapweb.web.shared.AnalysisEngine;
import com.ctapweb.web.shared.AnalysisEngine.AEType;

public class FeatureSetUtils {

	private static Connection dbConnection = DBConnectionManager.getDbConnection();
	private static Logger logger = LogManager.getLogger();

	public static List<AnalysisEngine> getFeatureList(long featureSetID) 
			throws SQLException {
		List<AnalysisEngine> featureList = new ArrayList<>();

		//get data from database
<<<<<<< HEAD
		String queryStr = "SELECT ae.id, ae.name, ae.version, ae.vendor, ae.description, ae.create_timestamp "
				+ ", ae.supported_languages " 
=======
		String queryStr = "SELECT ae.id, ae.name, ae.version, ae.vendor, ae.description, ae.create_timestamp " 
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc
				+ "FROM analysis_engine AS ae, "
				+ "     fs_cf, feature_set AS fs "
				+ "WHERE ae.id = fs_cf.cf_id "
				+ "     AND fs.id = fs_cf.fs_id "
				+ "     AND fs_cf.fs_id=? ";
		PreparedStatement ps = dbConnection.prepareStatement(queryStr);
		ps.setLong(1, featureSetID);

		ResultSet rs = ps.executeQuery();

<<<<<<< HEAD
		// get information of all features included in this feature set
=======
		// get infomation of all features included in this feature set
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc
		while(rs.next()) {
			AnalysisEngine ae = new AnalysisEngine();
			ae.setId(rs.getLong("id"));
			ae.setName(rs.getString("name"));
			ae.setType(AEType.FEATURE_EXTRACTOR);
<<<<<<< HEAD
			ae.setSupportedLanguages(Arrays.asList((String[])rs.getArray("supported_languages").getArray()));
=======
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc
			ae.setVersion(rs.getString("version"));
			ae.setVendor(rs.getString("vendor"));
			ae.setDescription(rs.getString("description"));
			ae.setCreateDate(rs.getDate("create_timestamp"));
<<<<<<< HEAD
=======

>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc
			featureList.add(ae);
		}
		
		return featureList;
	}

}
