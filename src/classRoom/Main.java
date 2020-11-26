package classRoom;

public class Main {
    public static void main(String[] args) {
        Pupil p1 = new ExcellentPupil();
        Pupil p2 = new GoodPupil();
        Pupil p3 = new BadPupil();
        ClassRoom c1 = new ClassRoom(p1, p2, p3);

        c1.p1.study();
        c1.p2.study();
        c1.p3.study();
        c1.p1.read();
        c1.p2.read();
        c1.p3.read();
        c1.p1.write();
        c1.p2.write();
        c1.p3.write();
        c1.p1.relax();
        c1.p2.relax();
        c1.p3.relax();
    }
}
