package java8CodingProgramsPackage;

import java.util.Objects;

public class StudentDetails {

	private long id;
	private String name;
	private long deptId;
	private long salary;
	private String address;

	public long getId() {
		return id;
	}

	public StudentDetails(long id, String name, long deptId, long salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.salary = salary;
		this.address = address;
	}

	public StudentDetails() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", deptId=" + deptId + ", salary=" + salary
				+ ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, deptId, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDetails other = (StudentDetails) obj;
		return Objects.equals(address, other.address) && deptId == other.deptId && id == other.id
				&& Objects.equals(name, other.name) && salary == other.salary;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
