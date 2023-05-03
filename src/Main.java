import java.util.Random;
import java.util.Scanner;

public class Main {

    //Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        String[] gryffindorList = new String[]{"HarryPotter", "HermioneGranger", " RonWeasley"};
        gryffindorStudents[] gryffindorStudents = new gryffindorStudents[gryffindorList.length];

        String[] slytherinList = new String[]{"DracoMalfoy", "GrahamMontague", "GregoryGoyle"};
        slytherinStudent[] slytherinStudents = new slytherinStudent[slytherinList.length];

        String[] puffenduyList = new String[]{"ZachariahSmith", "CedricDiggory", "JustinFinchFletchley"};
        puffenduyStudent[] puffenduyStudents = new puffenduyStudent[puffenduyList.length];

        String[] kogtevranList = new String[]{"ZhouChang", "PadmaPatil", "MarcusBelby"};
        kogtevranStudent[] kogtevranStudents = new kogtevranStudent[kogtevranList.length];


        for (int i = 0; i < gryffindorList.length; i++) { //заполняю массив студентов Гриффиндорф
            gryffindorStudents gs = new gryffindorStudents(gryffindorList[i], gR100(),
                    gR100(), gR100(), gR100(),
                    gR100());
            gs.setName(gryffindorList[i]); //не смог разобраться, почему
            // при создании нового объекта gryffindorStudents gs
            //не получается сразу вставлять слово из массива имен студентов gryffindorList
            // Воспользовался сеттером.
            gryffindorStudents[i] = gs;
        }

        for (int i = 0; i < slytherinList.length; i++) { // заполняю массив студентов slytherin
            slytherinStudent ss = new slytherinStudent(slytherinList[i], gR100(), gR100(), gR100(),
                    gR100(), gR100(), gR100(), gR100());
            ss.setName(slytherinList[i]);
            slytherinStudents[i] = ss;
        }
        for (int i = 0; i < puffenduyList.length; i++) { // заполняю массив студентов puffenduy
            puffenduyStudent ps = new puffenduyStudent(puffenduyList[i], gR100(), gR100(),
                    gR100(), gR100(), gR100());
            ps.setName(puffenduyList[i]);
            puffenduyStudents[i] = ps;
        }
        for (int i = 0; i < kogtevranList.length; i++) { // заполняю массив студентов kogtevran
            kogtevranStudent ks = new kogtevranStudent(kogtevranList[i], gR100(), gR100()
                    , gR100(), gR100(), gR100(), gR100());
        }

        for (gryffindorStudents gryffindorStudent : gryffindorStudents) { //печатаю всех студентов gryffindor
            gryffindorStudent.printDescriptionStudent();
            System.out.println();
        }

    }

    static int gR100() {
        Random r = new Random();
        return r.nextInt(100);
    }


    static void learnBestGryffindorStudent(gryffindorStudents aStudent, gryffindorStudents bStudent) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите номер первого студента");
        int a = x.nextInt();
        System.out.println("Введите номер второго студента");
        int b = x.nextInt();
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
        x.close();
    }

    static void learnBestSlytherinStudent(slytherinStudent aStudent, slytherinStudent bStudent) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите номер первого студента");
        int a = x.nextInt();
        System.out.println("Введите номер второго студента");
        int b = x.nextInt();
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
        x.close();
    }

    static void learnBestPuffenduyStudent(puffenduyStudent aStudent, puffenduyStudent bStudent) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите номер первого студента");
        int a = x.nextInt();
        System.out.println("Введите номер второго студента");
        int b = x.nextInt();
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
        x.close();
    }

    static void learnBestKogtevranStudent(kogtevranStudent aStudent, kogtevranStudent bStudent) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите номер первого студента");
        int a = x.nextInt();
        System.out.println("Введите номер второго студента");
        int b = x.nextInt();
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
        x.close();
    }
/*
static void GenerateStudentParаaculty (String[]List, hogwartsStudent[] students) {
    for (hogwartsStudent student : students) {
        
    }
}

 */

}

