package shoppinglist.domain;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

	private Long id;
	private String name;
	private Boolean status;
	private Double total;
	private List<Item> items = new ArrayList<Item>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public void add(Item item) {
		items.add(item);
		calculateTotal();
	}

	public Double getTotal() {
		return this.total;
	}

	public void update(Item item) {
		for (int i = 0; i < items.size() && item != null; i++) {
			if (items.get(i).getId().equals(item.getId())) {
				items.add(i, item);
				calculateTotal();
				break;
			}
		}
	}

	public void remove(Item item) {
		if (item != null) {
			items.remove(item);
			calculateTotal();
		}
	}

	private void calculateTotal() {
		total = 0.0;
		for (Item item : items) {
			total += item.getTotal();
		}
	}
}
