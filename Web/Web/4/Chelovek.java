package com;

public class Chelovek {
	public String name;
	public int dengi;
	public int maxras;
	public int maxcallorii;
	
	public void init(String name, int dengi, int maxras, int maxcallorii) {
		this.name = name;
		this.dengi = dengi;
		this.maxras = maxras;
		this.maxcallorii = maxcallorii;
	}
	
	public String kupit(Eda nyamka, Magazin magaz) {
		String res;
		if (dengi < nyamka.cena)
			res = (name + " �� ����� " + nyamka.name + ": ������� ������");
		else if (magaz.Assortiment.indexOf(nyamka.name) == -1)
			res = ("� �������� " + magaz.name + " ��� �������� " + nyamka.name);
		else if (nyamka.callorii > maxcallorii)
			res = ("������� " + nyamka.name + " ������� �����������");
		else if (magaz.ras > maxras)
			res = ("������� " + magaz.name + " ������� ������");
		else res = (name + " ������ � ������� " + magaz.name + " �� ��������� " + nyamka.name);
		return res;
	}
}
