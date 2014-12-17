package net.lipecki.pojobuilder.sample;

import net.lipecki.pojobuilder.PojoBuilder;

public class SampleDomainBuilder extends PojoBuilder<SampleDomain, SampleDomainBuilder> {

	public static SampleDomainBuilder get() {
		return new SampleDomainBuilder();
	}

	public SampleDomainBuilder withField(final String field) {
		return instance(object -> object.setField(field));
	}

}
