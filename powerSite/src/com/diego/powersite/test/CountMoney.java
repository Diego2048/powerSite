package com.diego.powersite.test;

public class CountMoney {
	public static void main(String[] args) {
		CountMoney countMoney = new CountMoney();
		double capital = 1;// һ��ʼͶ�ŵĽ��
		double addUpMoney = 0;// ÿ�����ӵ�����
		double rate = 0.09;// ������
		int year = 25;// �������
		double totalMoney = countMoney.countMyMoney(capital, rate, year, addUpMoney, false);
		System.out.println(
				capital + "��Ǯ��������Ϊ" + rate + "�������Ͷ��" + year + "��,\nÿ������" + addUpMoney + "��Ǯ������£���Ϣ��Ϊ:\n" + totalMoney);
	}

	/**
	 * 
	 * @param capital
	 *            һ��ʼͶ�ŵĽ��
	 * @param rate
	 *            ������
	 * @param year
	 *            �������
	 * @param addUpMoney
	 *            ÿ�����ӵ�����
	 * @param flag
	 *            һ��ʼ�Ƿ���ӣ�Ĭ��Ϊfalse
	 * @return ���ر����
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
