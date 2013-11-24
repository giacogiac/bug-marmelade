package internal.data;

public class Product {
	private int id;
	private String name;
	private String description;
	private String category;
	private String crmReference;
	private float price;
	private CRM crm;
	
	public Product() {
		super();
	}
	public Product(int id, String name, String description, String category,
			String crmReference, float price, CRM crm) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.crmReference = crmReference;
		this.price = price;
		this.crm = crm;
	}
	public Product(String name, String description, String category,
			String crmReference, float price, CRM crm) {
		super();
		this.name = name;
		this.description = description;
		this.category = category;
		this.crmReference = crmReference;
		this.price = price;
		this.crm = crm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCrmReference() {
		return crmReference;
	}
	public void setCrmReference(String crmReference) {
		this.crmReference = crmReference;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public CRM getCrm() {
		return crm;
	}
	public void setCrm(CRM crm) {
		this.crm = crm;
	}
}
