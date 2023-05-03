public class kogtevranStudent extends hogwartsStudent {
    int mind;
    int wisdom;
    int wit;
    int creativity;
    //ZhouChang PadmaPatil MarcusBelby kogtevran

    public kogtevranStudent(String name, int witchcraft, int transgression,
                            int mind, int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    protected void printDescriptionStudent() {
        System.out.println("Характеристика студента Puffenduy: ");
        System.out.println("student.getName() = " + this.getName());
        System.out.println("super.getWitchcraft() = " + this.getWitchcraft());
        System.out.println("student.getTransgression() = " + this.getTransgression());
        System.out.println("this.getMind() = " + this.getMind());
        System.out.println("this.getWisdom() = " + this.getWisdom());
        System.out.println("this.getWit() = " + this.getWit());
        System.out.println("this.getCreativity() = " + this.getCreativity());
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
