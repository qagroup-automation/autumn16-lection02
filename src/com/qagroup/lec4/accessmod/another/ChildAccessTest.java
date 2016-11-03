package com.qagroup.lec4.accessmod.another;

import com.qagroup.lec4.accessmod.Fields;

public class ChildAccessTest extends Fields {

	public static void main(String[] args) {
		Fields fields = new Fields();

		fields.iPublicField = "1";
		// fields.iProtectedField = "2";
		// fields.iDefaultAccessModifierField = "3";
		// fields.iPrivateField = "4"; // NOT ALLOWED

		ChildAccessTest child = new ChildAccessTest();

		child.iPublicField = "1";
		child.iProtectedField = "2";
		//child.iDefaultAccessModifierField = "3"; // NOT ALLOWED
		//child.iPrivateField = "4"; // NOT ALLOWED
	}

}
