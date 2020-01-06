/**
        A class that creates a template for a Student
*/
public class Student
{
        private String name;
        private int totalScored;
        private int quizzes;
        
        /**
                Construct a Student object
                @param name the name of the student
        */
        public Student(String studentName)
        {
                name = studentName;
        }
        
        /**
                Returns the name of the student
                @return the name of the student
        */
        public String getName()
        {
                return name;
        }
        
        /**
                Adds the result of the quiz scored by the student
                @param score the points scored by the Student in the quiz
        */
        public void addQuiz(int score)
        {
                totalScored = totalScored + score;
                quizzes = quizzes + 1;
        }
        
        /**
                Returns the total points scored by a Student in all the quiz he/she took
                @return the total points scored in all the quiz he/she took.
        */
        public double getTotalScore()
        {
                return totalScored;
        }
        
        /**
                Fetch the average score of a Student
                @return the average of all the points scored
        */
        public double getAverageScore()
        {
                return getTotalScore() / quizzes;
        }
}