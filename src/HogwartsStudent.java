public class HogwartsStudent {
    String name;
    int witchcraft;
    int transgression;

    protected HogwartsStudent(String name, int witchcraft, int transgression) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;

    }

    protected void printDescriptionStudent() {
    }

    protected int rating() {
        return (this.witchcraft + this.transgression);
    }

    protected void learnBestStudent(HogwartsStudent aSt, HogwartsStudent bSt) {

    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
