package org.thrustcurve.api.criterion;

import org.thrustcurve.api.search.SearchCriteria;

public class Type extends org.thrustcurve.api.criterion.Primitive {

	public Type(String value) {
		super(SearchCriteria.CRITERIA_TYPE, value);
	}

}
