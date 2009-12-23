/*
 * Thibaut Colar Dec 22, 2009
 */

package net.colar.netbeans.fan.indexer.model;

/**
 * Int constants for DB
 * @author thibautc
 */
public class FanModelConstants
{
	public enum SlotKind
	{
		FIELD(1), METHOD(10), CTOR(20);

		final int val;
		private SlotKind(int i) {val=i;}
	}

	public enum FfiKind
	{
		NONE(1), JAVA(2);

		final int val;
		private FfiKind(int i) {val=i;}
	}

	// Protection types
	public enum ProtectionKind
	{
		PUBLIC(1),INTERNAL(2), PROTECTED(3), PRIVATE(4);
		final int val;
		private ProtectionKind(int i) {val=i;}
	}

}
