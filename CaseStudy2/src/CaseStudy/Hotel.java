package CaseStudy;

import java.io.Serializable;

public class Hotel implements Serializable{
    private int StandardPrice = 1500000;
    private int SuperiorPrice = 2000000;
    private int DeluxePrice = 2500000;
    private int SuitePrice = 3000000;
    private int PresidentPrice = 3500000;
    private int RoyalSuitePrice = 3800000;
    private int BungalowPrice = 4800000;
    private String Standard = "Standard";
    private String Superior = "Superior";
    private String Deluxe = "Deluxe";
    private String Suite = "Suite";
    private String President = "President";
    private String RoyalSuite = "RoyalSuite";
    private String Bungalow = "Bungalow";
    private static int Standardquantity = 10;
    private static int Superiorquantity = 12;
    private static int Deluxequantity = 5;
    private static int Suitequantity = 5;
    private static int Presidentquantity = 5;
    private static int RoyalSuitequantity = 2;
    private static int Bungalowquantity = 2;
    private int nightStay;
    private String choiceTypeRoom;
    private int Total;

    public Hotel() {
    }

     public Hotel(int standard, int superior, int deluxe, int suite, int president, int royalSuite, int bungalow, int standardquantity, int superiorquantity, int deluxequantity, int suitequantity, int presidentquantity, int royalSuitequantity, int bungalowquantity, int nightStay, String choiceTypeRoom, int total) {
        StandardPrice = standard;
        SuperiorPrice = superior;
        DeluxePrice = deluxe;
        SuitePrice = suite;
        PresidentPrice = president;
        RoyalSuitePrice = royalSuite;
        BungalowPrice = bungalow;
        Standardquantity = standardquantity;
        Superiorquantity = superiorquantity;
        Deluxequantity = deluxequantity;
        Suitequantity = suitequantity;
        Presidentquantity = presidentquantity;
        RoyalSuitequantity = royalSuitequantity;
        Bungalowquantity = bungalowquantity;
        this.nightStay = nightStay;
        this.choiceTypeRoom = choiceTypeRoom;
        Total = total;
    }

    Customer customer = new Customer();



    public int getStandardPrice() {
        return StandardPrice;
    }

    public int getSuperiorPrice() {
        return SuperiorPrice;
    }

    public int getDeluxePrice() {
        return DeluxePrice;
    }

    public String getChoiceTypeRoom() {
        return choiceTypeRoom;
    }

    public int getSuitePrice() {
        return SuitePrice;
    }

    public int getPresidentPrice() {
        return PresidentPrice;
    }

    public int getRoyalSuitePrice() {
        return RoyalSuitePrice;
    }

    public int getBungalowPrice() {
        return BungalowPrice;
    }

    public int getNightStay() {
        return nightStay;
    }

    public int getTotal() {
        return Total;
    }

    public int getStandardquantity() {
        return Standardquantity;
    }

    public int getSuperiorquantity() {
        return Superiorquantity;
    }

    public int getDeluxequantity() {
        return Deluxequantity;
    }

    public int getSuitequantity() {
        return Suitequantity;
    }

    public String getStandard() {
        return Standard;
    }

    public String getSuperior() {
        return Superior;
    }

    public String getDeluxe() {
        return Deluxe;
    }

    public String getSuite() {
        return Suite;
    }

    public String getPresident() {
        return President;
    }

    public String getRoyalSuite() {
        return RoyalSuite;
    }

    public String getBungalow() {
        return Bungalow;
    }

    public int getPresidentquantity() {
        return Presidentquantity;
    }

    public int getRoyalSuitequantity() {
        return RoyalSuitequantity;
    }

    public int getBungalowquantity() {
        return Bungalowquantity;
    }

    public void setStandardquantity(int standardquantity) {
        Standardquantity = standardquantity;
    }

    public void setSuperiorquantity(int superiorquantity) {
        Superiorquantity = superiorquantity;
    }

    public void setDeluxequantity(int deluxequantity) {
        Deluxequantity = deluxequantity;
    }

    public void setSuitequantity(int suitequantity) {
        Suitequantity = suitequantity;
    }

    public void setPresidentquantity(int presidentquantity) {
        Presidentquantity = presidentquantity;
    }

    public void setChoiceTypeRoom(String choiceTypeRoom) {
        this.choiceTypeRoom = choiceTypeRoom;
    }

    public void setRoyalSuitequantity(int royalSuitequantity) {
        RoyalSuitequantity = royalSuitequantity;
    }

    public void setBungalowquantity(int bungalowquantity) {
        Bungalowquantity = bungalowquantity;
    }

    public void setStandardPrice(int standardPrice) {

                StandardPrice = standardPrice;
    }

    public void setSuperiorPrice(int superiorPrice) {
        SuperiorPrice = superiorPrice;
    }

    public void setDeluxePrice(int deluxePrice) {
        DeluxePrice = deluxePrice;
    }

    public void setSuitePrice(int suitePrice) {
        SuitePrice = suitePrice;
    }

    public void setPresidentPrice(int presidentPrice) {
        PresidentPrice = presidentPrice;
    }

    public void setRoyalSuitePrice(int royalSuitePrice) {
        RoyalSuitePrice = royalSuitePrice;
    }

    public void setBungalowPrice(int bungalowPrice) {
        BungalowPrice = bungalowPrice;
    }

    public void setNightStay(int nightStay) {
        this.nightStay = nightStay;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public void setStandard(String standard) {
        Standard = standard;
    }

    public void setSuperior(String superior) {
        Superior = superior;
    }

    public void setDeluxe(String deluxe) {
        Deluxe = deluxe;
    }

    public void setSuite(String suite) {
        Suite = suite;
    }

    public void setPresident(String president) {
        President = president;
    }

    public void setRoyalSuite(String royalSuite) {
        RoyalSuite = royalSuite;
    }

    public void setBungalow(String bungalow) {
        Bungalow = bungalow;
    }

    @Override
    public String toString() {
        return
                 customer +
                ", choiceTypeRoom='" + choiceTypeRoom + '\'' +
                ", nightStay=" + nightStay +
                '}';
    }
}
