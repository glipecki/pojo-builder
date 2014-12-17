package net.lipecki.pojobuilder;

import net.lipecki.pojobuilder.sample.SampleDomain;
import net.lipecki.pojobuilder.sample.SampleDomainBuilder;

import org.junit.Assert;
import org.junit.Test;

public class SampleDomainBuilderTest {

	@Test
	public void shouldBuildValidObject() {
		// given
		String expectedFieldValue = "expectedFieldValue";

		// when
		SampleDomain object = SampleDomainBuilder.get()
													.withField(expectedFieldValue)
													.build();

		// then
		Assert.assertEquals(expectedFieldValue, object.getField());
	}
}
