/**
 * 
 */
package com.ctapweb.web.shared;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc
import java.util.Date;

import com.google.gwt.view.client.ProvidesKey;

/**
 * A DTO for analysis.
 * @author xiaobin
 *
 */
public class Analysis implements Serializable {

	private long id;
	private long owner_id;
	private String name;
	private String description;
	private long corpusID;
	private String corpusName;
	private String tagFilterLogic;
	private String tagKeyword;
	private long featureSetID;
	private String featureSetName;
	private Date createDate;
<<<<<<< HEAD
	private String language;
=======
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc

	/**
	 * The key provider that provides the unique ID of a contact.
	 */
	public static final ProvidesKey<Analysis> KEY_PROVIDER = new ProvidesKey<Analysis>() {
		@Override
		public Object getKey(Analysis item) {
			return item == null ? null : item.getId();
		}
	};	
	
	/** empty constructor required by serialization.
	 * 
	 */
	public Analysis() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(long owner_id) {
		this.owner_id = owner_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
<<<<<<< HEAD
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
=======
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getCorpusID() {
		return corpusID;
	}

	public void setCorpusID(long corpusID) {
		this.corpusID = corpusID;
	}

	public String getCorpusName() {
		return corpusName;
	}

	public void setCorpusName(String corpusName) {
		this.corpusName = corpusName;
	}

	public long getFeatureSetID() {
		return featureSetID;
	}

	public void setFeatureSetID(long featureSetID) {
		this.featureSetID = featureSetID;
	}

	public String getFeatureSetName() {
		return featureSetName;
	}

	public void setFeatureSetName(String featureSetName) {
		this.featureSetName = featureSetName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getTagKeyword() {
		return tagKeyword;
	}

	public void setTagKeyword(String tagKeyword) {
		this.tagKeyword = tagKeyword;
	}

	public String getTagFilterLogic() {
		return tagFilterLogic;
	}

	public void setTagFilterLogic(String tagFilterLogic) {
		this.tagFilterLogic = tagFilterLogic;
	}
<<<<<<< HEAD

=======
	
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc
	public static class TagFilterLogic {
		public static String NOFILTER = "NOFILTER"; 
		public static String EQUALS = "EQUALS"; 
		public static String STARTSWITH = "STARTSWITH"; 
		public static String CONTAINS = "CONTAINS"; 
		public static String ENDSWITH = "ENDSWITH"; 
	}
	
<<<<<<< HEAD
	public static class AnalysisLanguageOptions {
		public static String ENGLISH = "EN"; 
		public static String GERMAN = "DE";
		public static String ITALIAN = "IT";
	}
	
=======
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc
}
