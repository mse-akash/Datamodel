package com.fis.sg.datamodel.model;


public class Datamodel {

	private long id;
	private String attribute;
	private String type;
	private String internal;
	private String fixmlMapping;
	private String format;
	private String fixTag;
	private String description;

	public Datamodel() {
	}

	public Datamodel(long id, String attribute, String type, String internal, String fixmlMapping, String format,
			String fixTag, String description) {
		super();
		this.id = id;
		this.attribute = attribute;
		this.type = type;
		this.internal = internal;
		this.fixmlMapping = fixmlMapping;
		this.format = format;
		this.fixTag = fixTag;
		this.description = description;
	}

	public Datamodel(String attribute, String type, String internal, String fixmlMapping, String format, String fixTag,
			String description) {
		super();
		this.attribute = attribute;
		this.type = type;
		this.internal = internal;
		this.fixmlMapping = fixmlMapping;
		this.format = format;
		this.fixTag = fixTag;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInternal() {
		return internal;
	}

	public void setInternal(String internal) {
		this.internal = internal;
	}

	public String getFixmlMapping() {
		return fixmlMapping;
	}

	public void setFixmlMapping(String fixmlMapping) {
		this.fixmlMapping = fixmlMapping;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getFixTag() {
		return fixTag;
	}

	public void setFixTag(String fixTag) {
		this.fixTag = fixTag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Datamodel [id=" + id + ", attribute=" + attribute + ", type=" + type + ", internal=" + internal
				+ ", fixmlMapping=" + fixmlMapping + ", format=" + format + ", fixTag=" + fixTag + ", description="
				+ description + "]";
	}

}
