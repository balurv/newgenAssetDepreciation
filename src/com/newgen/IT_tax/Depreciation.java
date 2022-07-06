package com.newgen.IT_tax;

public class Depreciation {
	private int n_Remaining_useful_life_of_the_asset;
	private double s_Scrap_value;
	private double c_Cost_of_the_asset;
//	private double rate;
	private DepreciationType depreciationType;
	
	
	public int getN_Remaining_useful_life_of_the_asset() {
		return n_Remaining_useful_life_of_the_asset;
	}

	public double getS_Scrap_value() {
		return s_Scrap_value;
	}

	public double getC_Cost_of_the_asset() {
		return c_Cost_of_the_asset;
	}

//	public double getRate() {
//		return rate;
//	}

	public DepreciationType getDepreciationType() {
		return depreciationType;
	}

	
	
	public Depreciation(DepreciationBuilder depreciationBuilder) throws Exception {
		this.n_Remaining_useful_life_of_the_asset = depreciationBuilder.n_Remaining_useful_life_of_the_asset;
		this.s_Scrap_value = depreciationBuilder.s_Scrap_value;
		this.c_Cost_of_the_asset = depreciationBuilder.c_Cost_of_the_asset;
		this.depreciationType = depreciationBuilder.depreciationType;
	}
	
	

	public static class DepreciationBuilder{
		private int n_Remaining_useful_life_of_the_asset;
		private double s_Scrap_value;
		private double c_Cost_of_the_asset;
		private DepreciationType depreciationType;
		
		public DepreciationBuilder n_Remaining_useful_life_of_the_asset(int n_Remaining_useful_life_of_the_asset) {
			this.n_Remaining_useful_life_of_the_asset = n_Remaining_useful_life_of_the_asset;
			return this;
		}
		public DepreciationBuilder s_Scrap_value(double s_Scrap_value) {
			this.s_Scrap_value = s_Scrap_value;
			return this;
		}
		public DepreciationBuilder c_Cost_of_the_asset(double c_Cost_of_the_asset) {
			this.c_Cost_of_the_asset = c_Cost_of_the_asset;
			return this;
		}
		public DepreciationBuilder depreciationType(DepreciationType depreciationType) {
			this.depreciationType = depreciationType;
			return this;
		}
		public Depreciation build() throws Exception {
			return new Depreciation(this);
		}
		
	}
	
//	private double calculateDepreciationRate(DepreciationType type) throws Exception {
//	
//		DepreciationInterface obj = new DepreciationFactory().getInstance(type);
//		return obj.calculateDepreciationRate( this);
//		
//		
////		if(type == DepreciationType.WDV) {
////			double base =  (this.s_Scrap_value / this.c_Cost_of_the_asset);
////			float power = (float) 1/this.n_Remaining_useful_life_of_the_asset;
////			result = Math.pow(base, power);
////			result = (1 -  result) * 100;
////			return result;
////		}
////		else if(type == DepreciationType.SLM){
////			double percent = this.s_Scrap_value / this.c_Cost_of_the_asset * 100;
////			result = (100 - percent) / this.n_Remaining_useful_life_of_the_asset;
////			return result;
////		}
////		throw new MissingFormatArgumentException("type mismatch");
//	}
	
	public void calculate_and_print_depreciation(DepreciationType type) throws Exception {
		DepreciationInterface obj = new DepreciationFactory().getInstance(type);
		obj.calculate_and_print_depreciation(this);
		
//		System.out.println("Year\tDepreciation as per "+type+"\t\tCost of asset");
//		this.rate = calculateDepreciationRate(type);
//		if(type == DepreciationType.SLM) {
//			double actualCost = this.c_Cost_of_the_asset;
//			for(int i = 1; i <= this.n_Remaining_useful_life_of_the_asset; i++) {
//				System.out.print(i+"\t");
//				double depreciation_cost = (this.c_Cost_of_the_asset * this.rate) / 100;
//				actualCost = actualCost - depreciation_cost;
//				System.out.print(depreciation_cost+"\t\t\t\t");
//				System.out.println(actualCost);
//			}
//		}
//		else if(type == DepreciationType.WDV) {
//			double actualCost = this.c_Cost_of_the_asset;
//			for(int i = 1; i <= this.n_Remaining_useful_life_of_the_asset; i++) {
//				System.out.print(i+"\t");
//				double depreciation_cost = (actualCost * this.rate) / 100;
//				actualCost -= depreciation_cost;
//				System.out.print(depreciation_cost+"\t\t");
//				System.out.println(actualCost);
//			}
//		}
	}
}
