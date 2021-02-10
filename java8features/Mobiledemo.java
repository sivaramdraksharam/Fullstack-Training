package java8features;

public class Mobiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobileoperator bsnl=new BSNL();
		Mobileoperator docomo=new Docomo();
		bsnl.showOperator();
		bsnl.support4G();
		bsnl.support5G();
		
		docomo.showOperator();
		docomo.support4G();
		docomo.support5G();
		
		Mobileoperator.operatorGuidelines();

	}

}
