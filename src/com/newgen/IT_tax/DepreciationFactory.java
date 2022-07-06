package com.newgen.IT_tax;

import java.util.MissingFormatArgumentException;

public class DepreciationFactory {

	public DepreciationInterface getInstance(DepreciationType type) throws Exception{
		if(type == DepreciationType.WDV) {
			return new WDVDepreciation();
		}
		else if(type == DepreciationType.SLM){
			return new SLMDepreciation();
		}
//		else if(type == )
		throw new MissingFormatArgumentException("type mismatch");
	}
}
