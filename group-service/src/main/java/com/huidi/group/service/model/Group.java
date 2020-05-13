package com.huidi.group.service.model;

import java.util.Objects;

public class Group {
	private String id;
	private String name;
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		final Group group = (Group) o;
		return Objects.equals(getId(), group.getId()) && Objects.equals(getName(), group.getName())
				&& Objects.equals(getDescription(), group.getDescription());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getName(), getDescription());
	}
}
