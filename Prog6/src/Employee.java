
public class Employee {
		//fields
		private String name;
		private int idNumber;
		private String department;
		private String position;

		//constructors
		public Employee(String inputName, int inputIdNumber, String inputDepartment, String inputPosition) {
			name = inputName;
			idNumber = inputIdNumber;
			department = inputDepartment;
			position = inputPosition;
		}
		public Employee(String inputName, int inputIdNumber) {
			name = inputName;
			idNumber = inputIdNumber;
			department = "";
			position = "";
		}
		public Employee() {
			name = "";
			idNumber = 0;
			department = "";
			position = "";
		}
		//mutators
		public void setName(String inputName) {
			name = inputName;
		}
		public void setIdNumber(int inputIdNumber) {
			idNumber = inputIdNumber;
		}
		public void setDepartment(String inputDepartment) {
			department = inputDepartment;
		}
		public void setPosition(String inputPosition) {
			position = inputPosition;
		}
		
		//accessors
		public String getName() {
			return name;
		}
		public int getIdNumber() {
			return idNumber;
		}
		public String getDepartment() {
			return department;
		}
		public String getPosition() {
			return position;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", idNumber=" + idNumber + ", department=" + department + ", position="
					+ position + "]";
		}
	}