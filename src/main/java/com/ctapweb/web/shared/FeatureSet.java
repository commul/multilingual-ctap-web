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
import java.util.List;

import com.google.gwt.view.client.ProvidesKey;

/**
 * A DTO for accessing feature sets.
 * @author xiaobin
 *
 */
public class FeatureSet implements Serializable {
<<<<<<< HEAD

=======
	
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc
	private long id;
	private long ownerId;
	private String name;
	private String description;
<<<<<<< HEAD
	private List<String> supportedLanguages = new ArrayList<>(); 
	private Date createDate;
	//	private List<ComplexityFeature> featureList;

	public static final ProvidesKey<FeatureSet> KEY_PROVIDER = new ProvidesKey<FeatureSet>() {
		@Override
		public Object getKey(FeatureSet item) {
			return item == null ? null : item.getId();
		}
	};	

	/**
	 * Empty constructor required by seriablization.
	 */
	public FeatureSet() {

	}
=======
	private Date createDate;
//	private List<ComplexityFeature> featureList;
	
    public static final ProvidesKey<FeatureSet> KEY_PROVIDER = new ProvidesKey<FeatureSet>() {
	      @Override
	      public Object getKey(FeatureSet item) {
	        return item == null ? null : item.getId();
	      }
	    };	

	 /**
	  * Empty constructor required by seriablization.
	  */
	  public FeatureSet() {
		  
	  }
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

<<<<<<< HEAD
	public List<String> getSupportedLanguages() {
		return supportedLanguages;
	}
	public String getSupportedLanguagesAsString() {
		StringBuilder rval = new StringBuilder();
		for (String l : supportedLanguages) {
			rval.append(l);
			rval.append(" ");

		}
		return rval.toString().trim();
	}

	public void setSupportedLanguages(List<String> supportedLanguages) {
		this.supportedLanguages = supportedLanguages;
	}

=======

	  
>>>>>>> cafdcdc3456ebb62b5b231073c27ffde69ad2ddc
}
