import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] gryffindorList = new String[]{"HarryPotter", "HermioneGranger", " RonWeasley"};
        String[] slytherinList = new String[]{"DracoMalfoy", "GrahamMontague", "GregoryGoyle"};
        String[] puffenduyList = new String[]{"ZachariahSmith", "CedricDiggory", "JustinFinchFletchley"};
        String[] kogtevranList = new String[]{"ZhouChang", "PadmaPatil", "MarcusBelby"};

        GryffindorStudent[] gryffindorStudents = fillArraysStudentsGryffindor(gryffindorList);
        SlytherinStudent[] slytherinStudents = fillArraysStudentsSlytherin(slytherinList);
        PuffenduyStudent[] puffenduyStudents = fillArraysStudentsPuffenduy(puffenduyList);
        KogtevranStudent[] kogtevranStudents = fillArraysStudentsKogtevran(kogtevranList);

        for (GryffindorStudent gryffindorStudent : gryffindorStudents) {//печатаю всех студентов gryffindor
            gryffindorStudent.printDescriptionStudent();
            System.out.println();
        }
        for (SlytherinStudent student : slytherinStudents) { // печатаю всех студентов Slytherin
            student.printDescriptionStudent();
            System.out.println();
        }
        for (PuffenduyStudent student : puffenduyStudents) { // печатаю всех студентов Puffenduy
            student.printDescriptionStudent();
            System.out.println();
        }
        for (KogtevranStudent student : kogtevranStudents) { // печатаю всех студентов Kogtevran
            student.printDescriptionStudent();
            System.out.println();
        }

    }

    static int R100() {
        Random r = new Random();
        return r.nextInt(100);
    }

    static GryffindorStudent[] fillArraysStudentsGryffindor(String[] name) {
        GryffindorStudent[] gryffindorStudents = new GryffindorStudent[name.length];
        for (int i = 0; i < name.length; i++) { //заполняю массив студентов Гриффиндорф
            GryffindorStudent gs = new GryffindorStudent(name[i], R100(),
                    R100(), R100(), R100(),
                    R100());
            gs.setName(name[i]); //не смог разобраться, почему
            // при создании нового объекта gryffindorStudents gs
            //не получается сразу вставлять слово из массива имен студентов gryffindorList
            // Воспользовался сеттером.
            gryffindorStudents[i] = gs;
        }
        return gryffindorStudents;
    }

    static SlytherinStudent[] fillArraysStudentsSlytherin(String[] name) {
        SlytherinStudent[] slytherinStudents = new SlytherinStudent[name.length];
        for (int i = 0; i < name.length; i++) { // заполняю массив студентов slytherin
            SlytherinStudent ss = new SlytherinStudent(name[i], R100(), R100(), R100(),
                    R100(), R100(), R100(), R100());
            ss.setName(name[i]);
            slytherinStudents[i] = ss;
        }
        return slytherinStudents;
    }

    static PuffenduyStudent[] fillArraysStudentsPuffenduy(String[] name) {
        PuffenduyStudent[] puffenduyStudents = new PuffenduyStudent[name.length];
        for (int i = 0; i < name.length; i++) { // заполняю массив студентов puffenduy
            PuffenduyStudent ps = new PuffenduyStudent(name[i], R100(), R100(),
                    R100(), R100(), R100());
            ps.setName(name[i]);
            puffenduyStudents[i] = ps;
        }
        return puffenduyStudents;
    }

    static KogtevranStudent[] fillArraysStudentsKogtevran(String[] name) {
        KogtevranStudent[] kogtevranStudents = new KogtevranStudent[name.length];
        for (int i = 0; i < name.length; i++) { // заполняю массив студентов kogtevran
            KogtevranStudent ks = new KogtevranStudent(name[i], R100(), R100()
                    , R100(), R100(), R100(), R100());
        }
        return kogtevranStudents;
    }
    static void learnBestGryffindorStudent(GryffindorStudent aStudent, GryffindorStudent bStudent) {
        int aRaiting = aStudent.rating();
        int bRaiting = bStudent.rating();
        if (aRaiting == bRaiting) {
            System.out.println("Студенты одинаково хороши");
        }
        if (aRaiting > bRaiting) {
            System.out.println("Первый студент лучше второго");
        } else if (aRaiting < bRaiting) {
            System.out.println("Второй студент лучше первого");
        }
    }

    static void learnBestSlytherinStudent(SlytherinStudent aStudent, SlytherinStudent bStudent) {
        int aRaiting = aStudent.rating();
        int bRaiting = bStudent.rating();
        if (aRaiting == bRaiting) {
            System.out.println("Студенты одинаково хороши");
        }
        if (aRaiting > bRaiting) {
            System.out.println("Первый студент лучше второго");
        } else if (aRaiting < bRaiting) {
            System.out.println("Второй студент лучше первого");
        }
    }

    static void learnBestPuffenduyStudent(PuffenduyStudent aStudent, PuffenduyStudent bStudent) {
        int aRaiting = aStudent.rating();
        int bRaiting = bStudent.rating();
        if (aRaiting == bRaiting) {
            System.out.println("Студенты одинаково хороши");
        }
        if (aRaiting > bRaiting) {
            System.out.println("Первый студент лучше второго");
        } else if (aRaiting < bRaiting) {
            System.out.println("Второй студент лучше первого");
        }
    }

    static void learnBestKogtevranStudent(KogtevranStudent aStudent, KogtevranStudent bStudent) {
        int aRaiting = aStudent.rating();
        int bRaiting = bStudent.rating();
        if (aRaiting == bRaiting) {
            System.out.println("Студенты одинаково хороши");
        }
        if (aRaiting > bRaiting) {
            System.out.println("Первый студент лучше второго");
        } else if (aRaiting < bRaiting) {
            System.out.println("Второй студент лучше первого");
        }
    }

    static void learnBestStudentWitchcraftTransgression(HogwartsStudent a, HogwartsStudent b) {
        int aRaiting = a.rating();
        int bRaiting = b.rating();
        if (aRaiting == bRaiting) {
            System.out.println("Студенты одинаково хороши");
        }
        if (aRaiting > bRaiting) {
            System.out.println("Первый студент лучше второго");
        } else if (aRaiting < bRaiting) {
            System.out.println("Второй студент лучше первого");
        }
    }


}


