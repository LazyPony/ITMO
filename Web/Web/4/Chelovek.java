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
			res = (name + " не купит " + nyamka.name + ": слишком дорого");
		else if (magaz.Assortiment.indexOf(nyamka.name) == -1)
			res = ("¬ магазине " + magaz.name + " нет продукта " + nyamka.name);
		else if (nyamka.callorii > maxcallorii)
			res = ("ѕродукт " + nyamka.name + " слишком каллорийный");
		else if (magaz.ras > maxras)
			res = ("ћагазин " + magaz.name + " слишком далеко");
		else res = (name + " пойдет в магазин " + magaz.name + " за продуктом " + nyamka.name);
		return res;
	}
}
