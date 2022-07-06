package com.newgen.IT_tax;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		Depreciation depreciation = new Depreciation.DepreciationBuilder()
				.n_Remaining_useful_life_of_the_asset(10)
				.s_Scrap_value(30000)
				.c_Cost_of_the_asset(200000)
				.build();
		depreciation.calculate_and_print_depreciation(DepreciationType.SLM);
		depreciation.calculate_and_print_depreciation(DepreciationType.WDV);
		
		
		
		
		
		
		
//		Depreciation baluCar = new Depreciation.DepreciationBuilder()
//				.n_Remaining_useful_life_of_the_asset(3)
//				.s_Scrap_value(900000)
//				.c_Cost_of_the_asset(1200000)
//				.build();
//		baluCar.calculate_and_print_depreciation(DepreciationType.SLM);
//		baluCar.calculate_and_print_depreciation(DepreciationType.WDV);
		
//		System.out.println(obj.toString());
		
	}

}
