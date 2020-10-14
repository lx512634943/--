package com.sojpt.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseIntellectualization<M extends BaseIntellectualization<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setPicture(java.lang.String picture) {
		set("picture", picture);
	}
	
	public java.lang.String getPicture() {
		return getStr("picture");
	}

	public void setBusinessId(java.lang.Integer businessId) {
		set("business_id", businessId);
	}
	
	public java.lang.Integer getBusinessId() {
		return getInt("business_id");
	}

	public void setTitle1(java.lang.String title1) {
		set("title1", title1);
	}
	
	public java.lang.String getTitle1() {
		return getStr("title1");
	}

}
