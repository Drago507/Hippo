package ir.drago.hippo.model;

public class Record {
	String field1;
	String field2;
	String field3;
	String field4;
	String field5;
	String field6;
	String field7;
	String field8;
	String field9;
	String field10;

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	public String getField4() {
		return field4;
	}

	public void setField4(String field4) {
		this.field4 = field4;
	}

	public String getField5() {
		return field5;
	}

	public void setField5(String field5) {
		this.field5 = field5;
	}

	public String getField6() {
		return field6;
	}

	public void setField6(String field6) {
		this.field6 = field6;
	}

	public String getField7() {
		return field7;
	}

	public void setField7(String field7) {
		this.field7 = field7;
	}

	public String getField8() {
		return field8;
	}

	public void setField8(String field8) {
		this.field8 = field8;
	}

	public String getField9() {
		return field9;
	}

	public void setField9(String field9) {
		this.field9 = field9;
	}

	public String getField10() {
		return field10;
	}

	public void setField10(String field10) {
		this.field10 = field10;
	}

	public String getField(int index) {
		switch (index) {
		case 1:
			return getField1();

		case 2:
			return getField2();

		case 3:
			return getField3();

		case 4:
			return getField4();

		case 5:
			return getField5();

		case 6:
			return getField6();

		case 7:
			return getField7();

		case 8:
			return getField8();

		case 9:
			return getField9();

		case 10:
			return getField10();

		}
		return null;
	}
}
