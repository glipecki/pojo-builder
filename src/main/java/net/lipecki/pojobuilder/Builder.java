package net.lipecki.pojobuilder;

/**
 * Object builder.
 */
public interface Builder<T> {

	/**
	 * Gets created instance.
	 * 
	 * @return
	 */
	T build();

}
