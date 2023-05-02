import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String [] GryffindorList = new String[] {"DracoMalfoy",
                "GrahamMontague", "GregoryGoyle"};
        GryffindorStudent[] GryffindorStudent = new GryffindorStudent[GryffindorList.length];

        for (int i = 0; i < GryffindorList.length; i++) {
            GryffindorStudent [i] = new GryffindorStudent(GryffindorList[i], gR100(),
                    gR100(), gR100(), gR100(),
                    gR100());

        }

        /*GryffindorStudent HarryPotter = new GryffindorStudent("HarryPotter", gR100(),
                gR100(), gR100(), gR100(),
                gR100());
*/
        SlytherinStudent DracoMalfoy = new SlytherinStudent("Draco Malfoy", gR100(), gR100(),gR100(),
                gR100(),gR100(),gR100(), gR100());
        //Draco Malfoy GrahamMontague GregoryGoyle

        GryffindorStudent[0].PrintDescriptionStudent();

    }

    static int gR100() {
        Random r = new Random();
        return r.nextInt(100);
    }


}

