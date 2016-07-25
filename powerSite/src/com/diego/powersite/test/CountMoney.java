package com.diego.powersite.test;

public class CountMoney {
	public static void main(String[] args) {
		CountMoney countMoney = new CountMoney();
		double capital = 1;// 一开始投放的金额
		double addUpMoney = 0;// 每年增加的数额
		double rate = 0.09;// 年利率
		int year = 25;// 存放年数
		double totalMoney = countMoney.countMyMoney(capital, rate, year, addUpMoney, false);
		System.out.println(
				capital + "块钱在年利率为" + rate + "的情况下投资" + year + "年,\n每年增加" + addUpMoney + "块钱的情况下，本息和为:\n" + totalMoney);
	}

	/**
	 * 
	 * @param capital
	 *            一开始投放的金额
	 * @param rate
	 *            年利率
	 * @param year
	 *            存放年数
	 * @param addUpMoney
	 *            每年增加的数额
	 * @param flag
	 *            一开始是否叠加，默认为false
	 * @return 返回本金和
	 */
	public double countMyMoney(double capital, double rate, int year, double addUpMoney, boolean flag) {
		if (year > 1) {
			if (flag) {
				capital = capital + addUpMoney;
			}
			return countMyMoney(capital + capital * rate, rate, year - 1, addUpMoney, true);
		} else if (year == 1) {
			if (flag) {
				capital = capital + addUpMoney;
			}
			return (capital + capital * rate);
		}
		return 0;
	}

}
