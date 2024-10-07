public interface FoodApp{
	void order(String item);
}

FoodApp foodApp = (String item)->{
	S.o.p("Food app");
};

public interface Ecom{
	void order(String item, int quantity);
}

Ecom ecom = ()->{
		S.o.p("Ecom");
};

public interface OnlineShoopping{
	void order(String item, double price, int quantity);
}
OnlineShoopping onlineShoopping = () -> {
	S.o.p("OnlineShoopping");
};
