package com.teddy.algorism.sortduplicationlist.process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 중복된 데이터가 들어 있는 ArrayList 의 데이터를 유니크하게 정렬
 * 
 * 데이터 처리 (중복 제거)
 * 
 * 정렬
 * 
 * @author teddy
 *
 */
public class SortDuplicationListProcess {
	
	private static final Logger logger = LoggerFactory.getLogger(SortDuplicationListProcess.class);
	
	public void doProcess() {
		List<Integer> integers = loadData();
		List<Integer> uniqueIntegers = findUniqueData(integers);
//		uniqueIntegers = ascendingSort(uniqueIntegers);
		uniqueIntegers = descendingSort(uniqueIntegers);
		
		printData(uniqueIntegers);
	}
	
	public List<Integer> loadData() {
		List<Integer> integers = new ArrayList<Integer>();
		
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		integers.add(4);
		integers.add(5);
		integers.add(2);
		integers.add(2);
		integers.add(11);
		integers.add(12);
		integers.add(11);
		integers.add(12);
		integers.add(17);
		integers.add(11);
		integers.add(13);
		integers.add(14);
		integers.add(15);
		integers.add(16);
		integers.add(17);
				
		return integers;
	}
	
	public List<Integer> findUniqueData(List<Integer> integers) {
		HashSet<Integer> uniqueIntegers = new HashSet<Integer>(integers);
		return new ArrayList<Integer>(uniqueIntegers);
	}
	
	public List<Integer> ascendingSort(List<Integer> uniqueData) {
		Collections.sort(uniqueData);
		return uniqueData;
	}
	
	public List<Integer> descendingSort(List<Integer> uniqueData) {
		Collections.sort(uniqueData, new DescCompare());
		return uniqueData;
	}
	
	public void printData(List<Integer> uniqueIntegers) {
		for (int i = 0; i < uniqueIntegers.size(); i++) {
			logger.info("IDX [{}] = [{}] ", i, uniqueIntegers.get(i));
		}
	}
		
	class DescCompare implements Comparator<Integer> {

		@Override
		public int compare(Integer arg1, Integer arg2) {
			
			return arg2.compareTo(arg1);
		}
		
	}
}
