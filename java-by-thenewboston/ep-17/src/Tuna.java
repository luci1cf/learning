public class Tuna {
    private String girlName;

    public Tuna(String name) {
        girlName = name;
    }

    public String getGirlName() {
        return girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public void saying() {
        System.out.printf("Your first gf was %s\n", getGirlName());
    }
}
