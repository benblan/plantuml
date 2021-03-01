package org.fabrique.plantuml.domain;

import javax.validation.constraints.NotNull;

/**
 * Super Class for all Entities
 */
public abstract class BaseEntity {

	@NotNull
	private long id;

	public long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BaseEntity: id " + id;
	}

}
