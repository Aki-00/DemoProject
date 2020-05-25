package com.vti.entity;

public class CPU {
	private float price;
	public Processor processor;
	public Ram ram;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public class Processor {
		private int coreAmount;
		private String menufacturer;

		public int getCoreAmount() {
			return coreAmount;
		}

		public void setCoreAmount(int coreAmount) {
			this.coreAmount = coreAmount;
		}

		public String getMenufacturer() {
			return menufacturer;
		}

		public void setMenufacturer(String menufacturer) {
			this.menufacturer = menufacturer;
		}

		public float getCache() {
			return 4.3f;
		}
	}

	public class Ram {
		private int memory;
		private String menufacturer;

		public int getMemory() {
			return memory;
		}

		public void setMemory(int memory) {
			this.memory = memory;
		}

		public String getMenufacturer() {
			return menufacturer;
		}

		public void setMenufacturer(String menufacturer) {
			this.menufacturer = menufacturer;
		}

		public float getClockSpeed() {
			return 5.5f;
		}
	}
}
