package com.ecs.selenium.qa;

public class Equilibrium {

	public static void main(String[] args) {
		int array1[] = {23,50,63,90,10,30,155,23,18};
		int array2[] = {133,60,23,92,6,7,168,16,19};
		int array3[] = {30,43,29,10,50,40,99,51,12};
		int array4[] = {12,35,56,10,50,40,99,51,12};//null
		int array5[] = {};//null
		int array6[] = {1};//null
		int array7[] = {23,50,63,90,30,155,23,18};//null

		Equilibrium equilibrium = new Equilibrium();

		System.out.println(equilibrium.getIndex(array1));
		System.out.println(equilibrium.getIndex(array2));
		System.out.println(equilibrium.getIndex(array3));
		System.out.println(equilibrium.getIndex(array4));
		System.out.println(equilibrium.getIndex(array5));
		System.out.println(equilibrium.getIndex(array6));
		System.out.println(equilibrium.getIndex(array7));
		}

		public Integer getIndex(int[] array) {
		int left=0,right=0;
		int i=0,j=array.length-1;
		if(array.length>2) {
		while( i<j) {
		if(left>right) {
		right +=array[j];
		j--;
		}
		else if(left<right) {
		left += array[i];
		i++;
		}
		else{
		right += array[j];
		left += array[i];
		i++;j--;
		}


		}
		if(i==j && left == right ) {
		return i;
		}
		}
		return null;
		}

		

	}


