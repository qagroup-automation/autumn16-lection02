package com.qagroup.lec4.accessmod.another;

import com.qagroup.lec4.accessmod.Fields;

public class AccessTest2 {

	public static void main(String[] args) {
		Fields fields = new Fields();
		
		fields.iPublicField = "1";
		//fields.iProtectedField = "2"; // NOT ALLOWED
		//fields.iDefaultAccessModifierField = "3"; // NOT ALLOWED
		//fields.iPrivateField = "4"; // NOT ALLOWED
		
		ChildAccessTest child = new ChildAccessTest();

		child.iPublicField = "1";
		//child.iProtectedField = "2"; // NOT ALLOWED
		//child.iDefaultAccessModifierField = "3"; // NOT ALLOWED
		//child.iPrivateField = "4"; // NOT ALLOWED
	}
}
