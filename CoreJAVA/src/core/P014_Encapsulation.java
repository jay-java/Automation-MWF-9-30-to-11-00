package core;

class UserData {
	private int id;
	private String name;
	private long contact;
	private String address;

	public UserData() {

	}

	public UserData(int id, String name, long contact, String address) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "UserData [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}

}

public class P014_Encapsulation {
	public static void main(String[] args) {
		UserData u1 = new UserData();
		u1.setId(1);
		u1.setName("java");
		u1.setAddress("ahmedabad");
		u1.setContact(98765432);

		System.out.println(u1.getId());
		System.out.println(u1.getName());
		System.out.println(u1.getAddress());
		System.out.println(u1.getContact());

		System.out.println(u1);
		UserData u2 = new UserData(2, "python", 789456312, "delhi");
		System.out.println(u2);

	}
}
