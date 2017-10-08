package com.nguyenthao.Adapter;

public class Adapter extends OldVersion{
	NewVersion newVersion = new NewVersion();
	
	@Override
	public int calculateOld(int a, int b){
		return newVersion.calculateNew(a, b);
	}
}
