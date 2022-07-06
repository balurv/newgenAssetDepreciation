package com.newgen.IT_tax;

public class SLMDepreciation implements DepreciationInterface {

	private double calculateDepreciationRate(Depreciation obj) {
		double result = 0;
		double percent = obj.getS_Scrap_value() / obj.getC_Cost_of_the_asset() * 100;
		result = (100 - percent) / obj.getN_Remaining_useful_life_of_the_asset();
		return result;
	}

	@Override
	public void calculate_and_print_depreciation(Depreciation obj) {
		System.out.println("Year\tDepreciation as per SLM\t\tCost of asset");
		double rate = calculateDepreciationRate(obj);
		double actualCost = obj.getC_Cost_of_the_asset();
//		for(int i = 1; i <= obj.getN_Remaining_useful_life_of_the_asset(); i++) {
//			System.out.print(i+"\t");
//			double depreciation_cost = (actualCost * rate) / 100;
//			actualCost -= depreciation_cost;
//			System.out.print(depreciation_cost+"\t\t");
//			System.out.println(actualCost);
//		}
		for(int i = 1; i <= obj.getN_Remaining_useful_life_of_the_asset(); i++) {
			System.out.print(i+"\t");
			double depreciation_cost = (obj.getC_Cost_of_the_asset() * rate) / 100;
			actualCost = actualCost - depreciation_cost;
			System.out.print(depreciation_cost+"\t\t\t\t");
			System.out.println(actualCost);
		}
	}
}
