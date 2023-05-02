import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Random r = new Random();
        //System.out.println("r.nextInt() = " + r.nextInt(100));

        //HarryPotter HermioneGranger RonWeasley
        GryffindorStudent HarryPotter = new GryffindorStudent("HarryPotter", gR100(),
                gR100(), gR100(), gR100(),
                gR100());

        SlytherinStudent DracoMalfoy = new SlytherinStudent("Draco Malfoy", gR100(), gR100(),gR100(),
                gR100(),gR100(),gR100(), gR100());
        //Draco Malfoy GrahamMontague GregoryGoyle

        HarryPotter.PrintDescriptionStudent();

    }

    static int gR100() {
        Random r = new Random();
        return r.nextInt(100);
    }


}

