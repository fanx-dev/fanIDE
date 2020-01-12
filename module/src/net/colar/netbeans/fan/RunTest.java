/*
 * Thibaut Colar Dec 18, 2009
 */
package net.colar.netbeans.fan;

import net.colar.netbeans.fan.indexer.model.FanType;

/**
 * Just a main for quickly testing something
 * @author thibautc
 */
public class RunTest
{

	public static void main(String[] args)
	{
		try
		{
			FanType model = new FanType();
			model.save();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
