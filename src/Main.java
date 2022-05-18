public class Main {

    public static void main(String[] args) {
	// write your code here
        SolarSystem FactorX =new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Stars="10000";

        //adding features to our sun
        FeatureSun Xfact= new FeatureSun();
        Xfact.color="green";
        Xfact.radius="1000000000km";
        Xfact.heat="309324934898kj";

        FeatureStars FactX = new FeatureStars();
        FactX.color= "green";
        FactX.radius = "2982982398239km";
        FactX.size = "99999999999999km";
    }
}
