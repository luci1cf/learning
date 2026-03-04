public class Tuna {
    private String girlName;

    public String getGirlName() {
        return girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public void saying() {
        System.out.println("Your first gf was %s\n", getGirlName());
    }
}
