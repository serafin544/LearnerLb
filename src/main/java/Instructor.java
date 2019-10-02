public class Instructor extends Person implements Teacher {
    public Instructor(long id, long name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double teaHrs = numberOfHours/learners.length;
        for(Learner stu: learners){
            stu.learn(teaHrs);
        }
    }
}
