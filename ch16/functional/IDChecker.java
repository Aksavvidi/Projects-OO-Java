package gr.aueb.cf.ch16.functional;

@FunctionalInterface
public interface IDChecker {
    /**
     * Checks a student's id based on
     * predicate's logic.
     *
     * @param student
     *        the student instance
     * @return
     *          true, if the id of the student is valid based
     *          on the predicate, false otherwise
     */
    public abstract boolean checkId(Student student); //abstract μεθοδος δεν έχει σώμα δηλαδή
}
