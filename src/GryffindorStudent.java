public class GryffindorStudent extends HogwartsStudent {
    private String name;
    private int nobility;
    private int honor;
    private int bravery;

    //HarryPotter HermioneGranger RonWeasley
    public GryffindorStudent(String name, int witchcraft, int transgression,
                             int nobility, int honor, int bravery) {
        super();
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    protected void PrintDescriptionStudent(GryffindorStudent student) {
        System.out.println("Характеристика студента Gryffindor: ");
        System.out.println("student.getName() = " + student.getName());
        System.out.println("super.getWitchcraft() = " + student.getWitchcraft());
        System.out.println("student.getTransgression() = " + student.getTransgression());
        System.out.println("student.nobility = " + student.getNobility());
        System.out.println("student.getHonor() = " + student.getHonor());
        System.out.println("student.getBravery() = " + student.getBravery());
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
