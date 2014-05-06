package com.teddy.algorism.sortcharactercount.load.impl;

import com.teddy.algorism.sortcharactercount.load.LoadEditorial;

public class StringBufferLoadEditorial implements LoadEditorial {

	@Override
	public String getEditorial() {
		StringBuffer editorial = new StringBuffer();

		editorial.append("세월호 참사는 선장과 선원들의 직업윤리 실종, 헝클어진 재난대응시스템, ");
		editorial.append("안전에 대한 인식 부족 등이 복합적으로 어우러진 결과라고 할 수 있다. ");
		editorial.append("290여명의 사망자가 발생한 1993년의 서해 훼리호 침몰 사건 당시 대책을 보면 사고 ");
		editorial.append("재발 방지를 위한 정책들이 들어 있지만 반짝 행정에 머물고 말았다. 대형 사고가 반복되는 ");
		editorial.append("가장 큰 원인은 재난·안전 분야가 다른 부문에 비해 하위로 분류돼 정책 우선순위에서 ");
		editorial.append("밀리고 있기 때문이라고 판단된다. 안전이야말로 국민의 행복이자 국가경쟁력인 시대다. ");
		editorial.append("안전 분야에 대한 전 국민적 관심과 정부의 과감하고 일관된 투자가 필요하다.");
		editorial.append("우리나라의 안전사고 사망률은 경제협력개발기구(OECD) 국가들에 비해 두 배 이상 높다. ");
		editorial.append("기후변화로 대형 재난사고 위험은 더욱 커져 전문 인력, 재난방지 첨단기술 등이 요구되고 있다. ");
		editorial.append("그런데도 예산은 충분히 뒷받침되지 못하고 있다. 올해 재난관리 예산은 9440억원으로 지난해 ");
		editorial.append("9840억원에 비해 4.1% 줄었다. ");
		editorial.append("정부의 국가재정운용계획상 2015년 8610억원, 2016년 7830억원, 2017년 8040억원이다. ");
		editorial.append("박근혜 대통령은 어제 열린 '2014 국가재정전략회의'에서 '각 부처는 모든 안전관련 예산을 철저히 ");
		editorial.append("재검토해야 한다'면서 ");
		editorial.append("'안전 관련 예산을 우선 배정하고 인력을 중점 배치해야 한다'고 강조했다. 국가 재난·안전 분야 연구개발(R&D) ");
		editorial.append("예산을 대폭 확충하는 등 미래지향적 투자 계획을 세우기 바란다.");

		return editorial.toString();
	}

}
