package net.lipecki.pojobuilder;

import java.lang.reflect.ParameterizedType;

/**
 * @param T
 *            object to build
 * @param B
 *            builder concrete type
 */
public abstract class PojoBuilder<T, B extends PojoBuilder<T, B>> implements Builder<T> {

	public interface InstanceModificator<T> {

		void modify(T instance);

	}

	private final T instance;

	@SuppressWarnings("unchecked")
	protected PojoBuilder() {
		try {
			final ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
			this.instance = ((Class<T>) genericSuperclass.getActualTypeArguments()[0]).newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			throw new CantInstantionatePojoBuilderException(e);
		}
	}

	@Override
	public T build() {
		return instance;
	}

	protected T instance() {
		return instance;
	}

	protected B instance(final InstanceModificator<T> modificator) {
		modificator.modify(instance);
		return self();
	}

	@SuppressWarnings("unchecked")
	protected B self() {
		return (B) this;
	}

}
