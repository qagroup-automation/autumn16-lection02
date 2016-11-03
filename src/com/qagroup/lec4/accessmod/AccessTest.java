package com.qagroup.lec4.accessmod;

public class AccessTest {

	public static void main(String[] args) {
		Fields fields = new Fields();
		
		fields.iPublicField = "1";
		fields.iProtectedField = "2";
		fields.iDefaultAccessModifierField = "3";
		//fields.iPrivateField = "4"; // NOT ALLOWED
	}

}
