package com.app;

public final class FinalTest 
{
	private final Integer id;
	private final String name;
	private FinalTest(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public static FinalTest getFinalTest(Integer id, String name) {
		return new FinalTest(id, name);
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "FinalTest [id=" + id + ", name=" + name + "]";
	}
}
