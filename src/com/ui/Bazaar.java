package com.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bazaar {

   private Map<Integer,String> policyMap =new HashMap<Integer, String>();

	//HashMap<Integer, String> policyMap = new HashMap<Integer, String>();

	public Map<Integer, String> getPolicyMap() {

		return policyMap;

	}

	public void setPolicyMap(HashMap<Integer, String> policyMap) {

		this.policyMap = policyMap;

	}

	// This method should add the policyID as key and policyName as value into the
	// policyMap

	public void addPolicyDetails(int policyId, String policyName)

	{
		if(policyMap.get(policyId) ==null)
		   policyMap.put(policyId, policyName);

	}

	public List<Integer> searchBasedOnPolicyType(String policyType) {

		List<Integer> policy = new ArrayList<Integer>();

		for (Map.Entry<Integer, String> entry : policyMap.entrySet()) {

			if (entry.getValue().toString().toLowerCase().indexOf(policyType.toLowerCase()) != -1) {

				policy.add(entry.getKey());

			}

		}

		return policy;

	}

}
