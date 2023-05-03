import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] gryffindorList = new String[]{"HarryPotter", "HermioneGranger", " RonWeasley"};
        gryffindorStudent[] gryffindorStudent = new gryffindorStudent[gryffindorList.length];

        String[] slytherinList = new String[]{"DracoMalfoy", "GrahamMontague", "GregoryGoyle"};
        slytherinStudent[] slytherinStudents = new slytherinStudent[slytherinList.length];

        String[] puffenduyList = new String[]{"ZachariahSmith", "CedricDiggory", "JustinFinchFletchley"};
        puffenduyStudent[] puffenduyStudents = new puffenduyStudent[puffenduyList.length];

        String[] kogtevranList = new String[]{"ZhouChang", "PadmaPatil", "MarcusBelby"};
        kogtevranStudent[] kogtevranStudents = new kogtevranStudent[kogtevranList.length];


        for (int i = 0; i < gryffindorList.length; i++) { //заполняю массив студентов Гриффиндорф

            //String name = GryffindorList[i];
            //System.out.println("name = " + name);
            gryffindorStudent gs = new gryffindorStudent(gryffindorList[i], gR100(),
                    gR100(), gR100(), gR100(),
                    gR100());
            gs.setName(gryffindorList[i]);
            gryffindorStudent[i] = gs;

            System.out.println("GryffindorList[i] = " + gryffindorList[i]);
        }

        slytherinStudent DracoMalfoy = new slytherinStudent("Draco Malfoy", gR100(), gR100(), gR100(),
                gR100(), gR100(), gR100(), gR100());
        //Draco Malfoy GrahamMontague GregoryGoyle

        for (gryffindorStudent gryffindorStudent : gryffindorStudent) {
            gryffindorStudent.printDescriptionStudent();
            System.out.println();
        }
        gryffindorStudent[0].printDescriptionStudent();
        gryffindorStudent[1].printDescriptionStudent();

    }

    static int gR100() {
        Random r = new Random();
        return r.nextInt(100);
    }



}

