package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermute 
{
	private void permuteHelper(List<List<Integer>> list, List<Integer> result, int array[]) {
		if(result.size() == array.length) {
			list.add(new ArrayList<Integer>(result));
		}
		else {
			for(int i = 0; i< array.length; i++) {
				if(result.contains(array[i])) {
					continue;
				}
				result.add(array[i]);
				permuteHelper(list, result, array);
				result.remove(result.size()-1);
			}
		}
	}
	public List<List<Integer>> permute(int array[]){
		List<List<Integer>> list = new ArrayList<>();
		permuteHelper(list, new ArrayList<>(), array);
		return list;
	}
	public static void main(String[] args) {
		ArrayPermute p = new ArrayPermute();
		int []array = {1, 2, 3};
		List<List<Integer>> list = p.permute(array);
		for(List<Integer> lists : list) {
			System.out.println(lists);
		}
	}
}

