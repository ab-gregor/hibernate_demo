package hibernate_demo.hibernate_demo;

import javax.persistence.Embeddable;

@Embeddable
public class EmpName {
	

	

		private String fname;
		private String lname;
		
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		@Override
		public String toString() {
			return "EmployeeName [fname=" + fname + ", lname=" + lname + "]";
		}
}
