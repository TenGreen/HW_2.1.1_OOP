public class GryffindorStudent extends HogwartsStudent {
    private String name;
    private int nobility;
    private int honor;
    private int bravery;

    //HarryPotter HermioneGranger RonWeasley
    public GryffindorStudent(String name, int witchcraft, int transgression,
                             int nobility, int honor, int bravery) {
        super(name, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    protected void printDescriptionStudent() {
        System.out.println("Характеристика студента Gryffindor: ");
        System.out.println("student.getName() = " + this.getName());
        System.out.println("super.getWitchcraft() = " + this.getWitchcraft());
        System.out.println("student.getTransgression() = " + this.getTransgression());
        System.out.println("student.nobility = " + this.getNobility());
        System.out.println("student.getHonor() = " + this.getHonor());
        System.out.println("student.getBravery() = " + this.getBravery());
    }
    @Override
    protected int rating() {
        return (this.getWitchcraft() + this.getTransgression() +
                this.getNobility() + this.getHonor() + this.getBravery());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
