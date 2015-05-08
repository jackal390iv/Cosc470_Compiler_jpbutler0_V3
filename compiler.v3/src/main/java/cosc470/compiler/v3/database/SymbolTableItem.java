package cosc470.compiler.v3.database;

public class SymbolTableItem {

	private String name, type,size, value;

	public SymbolTableItem(String name, String type, String size, String value) {
		this.name = name;
		this.type = type;
		this.size = size;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	
	public String getSize() {
		return size;
	}

	public String getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setSize(String size) {
		this.size = size;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void printSymbolTableItemData() {
		System.out.printf("\nName: %-20sType: %-20sSize: %-20sValue: %-20s", name, type,size,
				value);
	}
}
