/*
 * Thibaut Colar Apr 8, 2010
 */
package net.colar.netbeans.fan.utils;

/**
 * Because sometimes it's good to have a Pair !
 * @author thibautc
 */
public class GenericPair<T, S>
{

	T first;
	S second;

	public GenericPair(T first, S second)
	{
		this.first = first;
		this.second = second;
	}

	public T getFirst()
	{
		return first;
	}

	public S getSecond()
	{
		return second;
	}

}
