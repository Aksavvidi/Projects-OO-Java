package gr.aueb.cf.ch20;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface TeacherIDChecker{
    boolean checkId(Teacher teacher);
}

public class Main {

    private static List<Teacher> teachers = Arrays.asList(
            new Teacher(1, "Th.", "Androutsos"),
            new Teacher(2, "B.", "Dylan"),
            new Teacher(3, "E.", "Mask"),
            new Teacher(4, "B.", "Gates")

    );

    public static void main(String[] args) {
        int id = 3;

//        printEqualId(teachers, new TeacherIDChecker() {
//        int id = 4;

//            @Override
//            public boolean checkId(Teacher teacher) {
//                return teacher.getTeacherId() == id;
//            }
//        });
//
//        printEqualId(teachers, teacher -> teacher.getTeacherId() == id);

        printEqualId(teachers, teacher -> teacher.getTeacherId() == id,
                Teacher::printTeacher);

        printEqualId(teachers, teacher -> teacher.getTeacherId() > id,
                Teacher::printFullName);
    }

    public static void printEquals(List<Teacher> teachers, int teacherID) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherID) {
                System.out.println("Full Name: " + teacher.getFirstname()
                        + ", " + teacher.getLastname());
            }
        }
    }

    public static void printGreaterThanID(List<Teacher> teachers, int teacherID) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() > teacherID) {
                System.out.println("Full Name: " + teacher.getFirstname()
                        + ", " + teacher.getLastname());
            }
        }
    }

    public static void printEqualId(List<Teacher> teachers, TeacherIDChecker idChecker) {
        for (Teacher teacher : teachers) {
            if (idChecker.checkId(teacher)) {
                System.out.println("Full Name: " + teacher.getFirstname()
                        + ", " + teacher.getLastname());
            }
        }
    }
//    public static void printEqualId(List<Teacher> teachers, Predicate<Teacher> checker,
//                                    Consumer<Teacher> teacherConsume) {
//        for (Teacher teacher : teachers) {
//            if (checker.test(teacher)) {
//                teacherConsume.accept(teacher);
//            }
//        }
//    }
public static void printEqualId(List<Teacher> teachers, Predicate<Teacher> checker,
                                Consumer<Teacher> teacherConsume) {
   teachers.forEach(teacher -> {
       if (checker.test(teacher) ) teacherConsume.accept(teacher);
   });
}
}
